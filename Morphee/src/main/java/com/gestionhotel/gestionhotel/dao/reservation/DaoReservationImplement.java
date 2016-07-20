package com.gestionhotel.gestionhotel.dao.reservation;
/*
 * Projet: Morphee
 * Class: DaoReservationImplemeny
 * Date: 11/07/2016
 * Author: Julie Brouqué
 */
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.validator.internal.util.privilegedactions.GetConstraintValidatorList;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;


public class DaoReservationImplement implements IDaoReservation{

	Logger log=Logger.getLogger("DaoReservationImplement");
	
	@PersistenceContext
	private EntityManager em;
	
	
	//Méthodes
	
	
	@Override
	public Reservations addReservation(Reservations r, Long idClient, Long idChambres) throws MyException {
		Personnes p=em.find(Client.class, idClient);
		Chambres c=em.find(Chambres.class, idChambres);
		if(c==null){
			throw new MyException("L'identifiant chambre saisit n'existe pas");
		}
		if(p==null){
			throw new MyException("L'identifiant client saisit n'existe pas");
		}
		List<Reservations> tabRes=c.getTabReservationChambre();
		List<Reservations> tab1=new ArrayList<Reservations>();
		for(Reservations res:tabRes){
			if((res.getDateArrivee().before(r.getDateArrivee()) && res.getDateSortie().after(r.getDateArrivee())) 
					|| (res.getDateArrivee().before(r.getDateSortie()) 
							&& res.getDateSortie().after(r.getDateSortie())) 
							|| res.getDateArrivee().equals(r.getDateArrivee()) 
							|| res.getDateSortie().equals(r.getDateSortie())
							|| (r.getDateArrivee().before(res.getDateArrivee()) && r.getDateSortie().after(res.getDateSortie()))){
				tab1.add(res);
				throw new MyException("Cette chambre est déjà réservée du "+res.getDateArrivee()+" au "+res.getDateSortie());
			}}if(tab1.isEmpty()){
				r.setPersonne(p);
				r.setChambre(c);
				em.persist(r);
				Client c1=(Client) p;
				c1.setNbReservation(c1.getNbReservation()+1);
				log.info("La réservation "+r.getIdReservation()+" a bien été enregistrée");
			}
		return r;
	}

	@Override
	public List<Reservations> getReservations() {
		Query query= em.createQuery("from Reservations");
		log.info("Il existe "+query.getResultList().size()+" réservations");
		return query.getResultList();
	}

	@Override
	public Reservations getReservation(Long idReservation) throws MyException {
		Reservations r=em.find(Reservations.class, idReservation);
		if(r==null){
			throw new MyException("L'identifiant reservation saisit n'existe pas");
		}
		log.info("La réservation "+r.getIdReservation()+" a bien été récupérée");
		return r;
	}

	@Override
	public void deleteReservation(Long idReservation) {
		Reservations r=em.find(Reservations.class, idReservation);
		em.remove(r);
		Client c=(Client) r.getPersonne();
		c.setNbReservation(c.getNbReservation()-1);
		log.info("La réservation "+r.getIdReservation()+" a bien été supprimée");
		
	}

	@Override
	public Reservations updateReservation(Reservations r) {
		em.merge(r);
		log.info("La réservation "+r.getIdReservation()+" a bien été modifiée");
		return null;
	}

	@Override
	public double coûtReservation(Long idReservation) throws MyException {
		final int nbMiliSec=24*60*60*1000;
		Reservations r=em.find(Reservations.class, idReservation);
		if(r==null){
			throw new MyException("L'identifiant reservation saisit n'existe pas");
		}
		List<Consommation> tabCons=r.getTabConsommationreservation();
		Long nbJours= (r.getDateSortie().getTime()-r.getDateArrivee().getTime())/nbMiliSec;
		log.info("nombre joures"+nbJours);
		double coutCons=0;
		for(Consommation c:tabCons){
			if(c.getReservation().getIdReservation().equals(idReservation)){
				coutCons=coutCons+(c.getProduit().getPrixProduit())*c.getQuantiteConsomee();
			}
		}
		double cout=(r.getChambre().getPrixChambre())*nbJours+coutCons;
		log.info("Le coût de la réservation"+r.getIdReservation()+" est de "+cout);
		return cout;
	}

	@Override
	public double coûtReservations() {
		List<Reservations> tabRes=getReservations();
		double coutReservation=0;
		double coutCons=0;
		double coutChambre=0;
		for(Reservations r:tabRes){
			System.out.println(r.getChambre());
			Long nbJours= (r.getDateSortie().getTime()-r.getDateArrivee().getTime())/(24*60*60*1000);
			List<Consommation> tabCons=r.getTabConsommationreservation();
			for(Consommation c:tabCons){
				coutCons=coutCons+(c.getProduit().getPrixProduit())*c.getQuantiteConsomee();
			}
			coutChambre=coutChambre+(r.getChambre().getPrixChambre())*nbJours;
		}
		coutReservation=coutChambre+coutCons;
		log.info("Le coût des réservations est de "+coutReservation);
		return coutReservation;
	}

	@Override
	public double getStockProduit(Long idProduit) {
		Produits p=em.find(Produits.class, idProduit);
		return p.getQuantiteProduit();
	}

	@Override
	public List<Reservations> getReservationClient(Long idClient) throws MyException {
		Personnes p1=em.find(Client.class, idClient);
		if(p1==null){
			throw new MyException("L'identifiant client saisit n'existe pas");
		}
		List<Reservations> tab1=p1.getTabReservationPersonne();
		if(tab1.isEmpty()){
			throw new MyException("Aucune réservation n'est enregistrée pour ce client");
		}
		log.info("Le client "+p1.getIdPersonnes()+" a effectué "+tab1.size()+" réservations");
		return tab1;
	}

	@Override
	public List<Reservations> getReservationChambre(Long idChambre) throws MyException {
		Chambres c=em.find(Chambres.class, idChambre);
		if(c==null){
			throw new MyException("L'identifiant chambre saisit n'existe pas");
		}
		List<Reservations> tab=c.getTabReservationChambre();
		if(tab.isEmpty()){
			throw new MyException("Aucune réservation n'est enregistrée pour cette chambre");
		}
		log.info("La chambre "+c.getIdChambre()+" possède "+tab.size()+" réservation(s)");
		return tab;
	}


}
