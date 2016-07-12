package com.gestionhotel.gestionhotel.dao.paiement;

import com.gestionhotel.gestionhotel.entities.Paiements;
/**
 * 
 * @author inti0298
 *classe: classe qui définit les méthodes de l'interface dao de la classe paiement
 *version : 1.0.0
 *date : 11/047/2016
 */
public interface IDaoPaiement {
	public Paiements addPaiements (Paiements p);
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture, int Annee, Long idReservation);
	
}
