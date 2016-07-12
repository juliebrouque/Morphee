package com.gestionhotel.gestionhotel.dao.paiement;

import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Reservations;
/**
 * 
 * @author inti0298
 *classe qui définit les méthodes de l'interface paiement
 *version : 1.0.0
 *date : 11/07/2016
 */
public class DaoPaiementImplement implements IDaoPaiement {

	Logger log = Logger.getLogger("DaoPaiementImplement");
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Paiements addPaiements(Paiements p) {
		em.persist(p);
		log.info("le paiement"+ p.getIdPaiement()+ " a bien été enregistré");
		return p;
	}

@Override
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture, int Annee, Long idReservation) {
	Reservations r = em.find(Reservations.class, idReservation);
	Factures f = em.find(Factures.class, idFacture);
	Consommation conso = em.find(Consommation.class, idConsommation);
	List<Consommation>tabConsoParReservation = r.getTabConsommationreservation();
	double coutchambre=0;
	double coutConsommation=0;
	double coutBenefAnnuel=0;
	for (Consommation consommation : tabConsoParReservation) {
		Calendar c = Calendar.getInstance(); 
		
		c.setTime(f.getDateFacturation());
		int year = c.get(Calendar.YEAR);
		if(Annee==year){
			coutchambre=r.getChambre().getPrixChambre();
			List<Consommation> tabCons=r.getTabConsommationreservation();
			for(Consommation cons:tabCons){
				coutConsommation= conso.getProduit().getPrixProduit();
			}
		}
	}
		coutBenefAnnuel =coutchambre+coutConsommation;
		return coutBenefAnnuel;
	}

	
}
