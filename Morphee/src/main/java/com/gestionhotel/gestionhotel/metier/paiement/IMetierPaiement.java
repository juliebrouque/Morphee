package com.gestionhotel.gestionhotel.metier.paiement;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.exception.MyException;
/**
 * 
 * @author inti0298
 *classe : interface métier de la classe paiement
 *version: 1.0.0
 *date: 11/07/2016
 */
public interface IMetierPaiement {
	public Paiements addPaiements(Paiements p, Long idFacture)throws MyException;
	public double calculerBeneficeAnnuel(Long idConsommation, Long idFacture, int Annee, Long idReservation);
	public List<Paiements> getAllPaiements();
}
