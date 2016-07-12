package com.gestionhotel.gestionhotel.metier.paiement;

import java.util.logging.Logger;

import com.gestionhotel.gestionhotel.dao.paiement.IDaoPaiement;
import com.gestionhotel.gestionhotel.entities.Paiements;
/**
 * 
 * @author inti0298
 *classe: classe qui définit les méthodes de l'interface métier de la classe paiement
 *version : 1.0.0
 *date : 11/07/2016
 */
public class MetierPaiementImplement implements IMetierPaiement {
	//Attributs
	
		private IDaoPaiement dao;
		Logger log=Logger.getLogger("MetierPaiementImplement");
		
		
	public void setDao(IDaoPaiement dao) {
		log.info("----------DaoPaiement injected--------------");
			this.dao = dao;
		}

	@Override
	public Paiements addPaiements(Paiements p) {
		return dao.addPaiements(p);
	}

	@Override
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture,
			int Annee, Long idReservation) {
		return dao.calculerBeneficeAnnuel(idConsommation, idFacture, Annee, idReservation);
	}

}
