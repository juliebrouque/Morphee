package com.gestionhotel.gestionhotel.dao.reservation;
/*
 * Projet: Morphee
 * Class: DaoReservationImplemeny
 * Date: 11/07/2016
 * Version: 1.0.0
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
	public Reservations addReservation(Reservations r, Long idClient, Long idChambres, Long idFacture) throws MyException {
		Personnes p=em.find(Client.class, idClient);
		Chambres c=em.find(Chambres.class, idChambres);
		Factures f=em.find(Factures.class, idFacture);
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
				r.setFacture(f);
				r.setPersonne(p);
				r.setChambre(c);
				em.persist(r);
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
	public Reservations getReservation(Long idReservation) {
		Reservations r=em.find(Reservations.class, idReservation);
		log.info("La réservation "+r.getIdReservation()+" a bien été récupérée");
		return r;
	}

	@Override
	public void deleteReservation(Long idReservation) {
		Reservations r=em.find(Reservations.class, idReservation);
		em.remove(r);
		log.info("La réservation "+r.getIdReservation()+" a bien été supprimée");
		
	}

	@Override
	public Reservations updateReservation(Reservations r) {
		em.merge(r);
		log.info("La réservation "+r.getIdReservation()+" a bien été modifiée");
		return null;
	}

	@Override
	public double coûtReservation(Long idReservation) {
		Reservations r=em.find(Reservations.class, idReservation);
		List<Consommation> tabCons=r.getTabConsommationreservation();
		Long nbJours= (r.getDateSortie().getTime()-r.getDateArrivee().getTime())/(24*60*60*1000);
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
	public List<Reservations> getReservationClient(Long idClient) {
		Personnes p1=em.find(Client.class, idClient);
		List<Reservations> tab1=p1.getTabReservationPersonne();
		log.info("Le client "+p1.getIdPersonnes()+" a effectué "+tab1.size()+" réservations");
		return tab1;
	}


}
