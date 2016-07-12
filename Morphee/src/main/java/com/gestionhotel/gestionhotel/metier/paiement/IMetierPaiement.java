package com.gestionhotel.gestionhotel.metier.paiement;

import com.gestionhotel.gestionhotel.entities.Paiements;
/**
 * 
 * @author inti0298
 *classe : interface métier de la classe paiement
 *version: 1.0.0
 *date: 11/07/2016
 */
public interface IMetierPaiement {
	public Paiements addPaiements (Paiements p);
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture, int Annee, Long idReservation);
}
