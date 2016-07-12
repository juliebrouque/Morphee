package com.gestionhotel.gestionhotel.metier.factures;

import java.util.Date;
import java.util.List;

import com.gestionhotel.gestionhotel.entities.Factures;

/*
 * Projet: Morphee
 * Interface: IMétierFacture
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public interface IMetierFactures {

	public Factures addFactures(Factures f);
	public void addReservationFacture(Long idReservation, Long idFacture);
	public List<Factures> getFactures(Long idClient);
	public double getCoutAnnuelClient(int Année, Long idClient);
	public double getCoutSemestrielClient(Date dateDebut, Date dateFin, Long idClient);
	public Factures getFacture(Long idFacture);
}
