package com.gestionhotel.gestionhotel.dao.paiement;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
/**
 * 
 * @author inti0298
 *classe: classe qui définit les méthodes de l'interface dao de la classe paiement
 *version : 1.0.0
 *date : 11/047/2016
 */
public interface IDaoPaiement {
	public Paiements addPaiements(Paiements p, Long idFacture);
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture, int Annee, Long idReservation);
	public List<Paiements> getAllPaiements();
		
}
