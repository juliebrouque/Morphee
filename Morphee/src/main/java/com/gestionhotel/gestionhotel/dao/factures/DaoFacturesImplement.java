package com.gestionhotel.gestionhotel.dao.factures;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Reservations;

/*
 * Projet: Morphee
 * Class: DaoFacturesImplemeny
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public class DaoFacturesImplement implements IDaoFactures{

	Logger log=Logger.getLogger("DaoFacturesImplement");
	
	@PersistenceContext
	private EntityManager em;
	
	//Methodes 
	
	
	@Override
	public Factures addFactures(Factures f) {
		em.persist(f);
		return f;
	}

	@Override
	public void addReservationFacture(Long idReservation, Long idFacture) {
		Reservations r=em.find(Reservations.class, idReservation);
		Factures f=em.find(Factures.class, idFacture);
		f.getTabReservationsFactures().add(r);
		log.info("La réservation "+r.getIdReservation()+" a bien été rajoutée à la facture"+f.getIdFacture());
		
	}

	@Override
	public List<Factures> getFactures(Long idClient) {
		List<Factures> tabFac=new ArrayList<Factures>();
		Personnes p=em.find(Client.class, idClient);
		List<Reservations> tabRes=p.getTabReservationPersonne();
		for(Reservations r:tabRes){
			if(r.getPersonne().getIdPersonnes().equals(idClient)){
				tabFac.add(r.getFacture());
			}
		}
		log.info("La liste de factures du client "+p.getIdPersonnes()+" a bien été récupérée");
		return tabFac;
	}

	@Override
	public double getCoutAnnuelClient(int Année, Long idClient) {
		Personnes p=em.find(Client.class, idClient);
		List<Reservations> tabRes=p.getTabReservationPersonne();
		double coutReservation=0;
		double coutCons=0;
		double coutChambre=0;
		for(Reservations res:tabRes){
			Calendar c = Calendar.getInstance(); 
			c.setTime(res.getDateSortie());
			int year = c.get(Calendar.YEAR);
			if(Année==year){
				Long nbJours= (res.getDateSortie().getTime()-res.getDateArrivee().getTime())/(24*60*60*1000);
				coutChambre=coutChambre+(res.getChambre().getPrixChambre())*nbJours;
				List<Consommation> tabCons=res.getTabConsommationreservation();
				for(Consommation cons:tabCons){
					coutCons=coutCons+(cons.getProduit().getPrixProduit())*cons.getQuantiteConsomee();
				}
			}
		}
		coutReservation=coutChambre+coutCons;
		log.info("Le cout annuel du client "+p.getIdPersonnes()+" est de "+coutReservation);
		return coutReservation;
	}

	@Override
	public double getCoutSemestrielClient(Date dateDebut, Date dateFin, Long idClient) {
		Personnes p=em.find(Client.class, idClient);
		List<Reservations> tabRes=p.getTabReservationPersonne();
		double coutReservation=0;
		double coutCons=0;
		double coutChambre=0;
		for(Reservations res:tabRes){
			if(dateDebut.before(res.getDateArrivee()) && dateFin.after(res.getDateSortie())){
				Long nbJours= (res.getDateSortie().getTime()-res.getDateArrivee().getTime())/(24*60*60*1000);
				coutChambre=coutChambre+(res.getChambre().getPrixChambre())*nbJours;
				List<Consommation> tabCons=res.getTabConsommationreservation();
				for(Consommation c:tabCons){
					coutCons=coutCons+(c.getProduit().getPrixProduit())*c.getQuantiteConsomee();
				}
			}
		}
		coutReservation= coutReservation+coutChambre+coutCons;
		log.info("Le cout semestriel du client "+p.getIdPersonnes()+" est de "+coutReservation);
		return coutReservation;
	}

	@Override
	public Factures getFacture(Long idFacture) {
		Factures f1=em.find(Factures.class, idFacture);
		log.info("La facture "+f1.getIdFacture()+" a bien été récupérée");
		return f1;
	}

}
