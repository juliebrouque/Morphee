package com.gestionhotel.gestionhotel.dao.paiement;

import java.util.Calendar;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;
/**
 * 
 * @author Zineb LAMRANI
 *classe qui définit les méthodes de l'interface paiement
 *version : 1.0.0
 *date : 11/07/2016
 */
public class DaoPaiementImplement implements IDaoPaiement {

	Logger log = Logger.getLogger("DaoPaiementImplement");
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Paiements addPaiements(Paiements p, Long idFacture) throws MyException {
		Factures f=em.find(Factures.class, idFacture);
		if (f==null) {
			throw new MyException("L'id facture n'existe pas");
		}
		p.setFacturePaiement(f);
		if (p.getFacturePaiement().getIdFacture()==idFacture) {
			throw new MyException("L'id facture possède déjà un paiement");
		}
		em.merge(p.getFacturePaiement());
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
		Long nbJours= (r.getDateSortie().getTime()-r.getDateArrivee().getTime())/(24*60*60*1000);
		Calendar c = Calendar.getInstance(); 
		c.setTime(f.getDateFacturation());
		int year = c.get(Calendar.YEAR);
		if(Annee==year){
			coutchambre=coutchambre + (r.getChambre().getPrixChambre())*nbJours;
			List<Consommation> tabCons=r.getTabConsommationreservation();
			for(Consommation cons:tabCons){
				coutConsommation= conso.getProduit().getPrixProduit();
			}
		}
	}
		coutBenefAnnuel =coutchambre+coutConsommation;
		return coutBenefAnnuel;
	}

@SuppressWarnings("unchecked")
@Override
public List<Paiements> getAllPaiements() {
	Query query = em.createQuery("From Paiements");
	log.info("il exsite"+" "+ query.getResultList().size()+"paiements");
	return query.getResultList();
}


	
}
