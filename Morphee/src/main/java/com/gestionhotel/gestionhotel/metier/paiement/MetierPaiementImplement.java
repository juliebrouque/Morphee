package com.gestionhotel.gestionhotel.metier.paiement;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.gestionhotel.gestionhotel.dao.paiement.IDaoPaiement;
import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.exception.MyException;
/**
 * 
 * @author inti0298
 *classe: classe qui définit les méthodes de l'interface métier de la classe paiement
 *version : 1.0.0
 *date : 11/07/2016
 */

@Transactional
public class MetierPaiementImplement implements IMetierPaiement {
	//Attributs
	
		private IDaoPaiement dao;
		Logger log=Logger.getLogger("MetierPaiementImplement");
		
		
	public void setDao(IDaoPaiement dao) {
		log.info("----------DaoPaiement injected--------------");
			this.dao = dao;
		}

	@Override
	public Paiements addPaiements(Paiements p, Long idFacture)throws MyException {
		return dao.addPaiements(p, idFacture);
	}

	@Override
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture,
			int Annee, Long idReservation) {
		return dao.calculerBeneficeAnnuel(idConsommation, idFacture, Annee, idReservation);
	}

	@Override
	public List<Paiements> getAllPaiements() {
		return dao.getAllPaiements();
	}

}
