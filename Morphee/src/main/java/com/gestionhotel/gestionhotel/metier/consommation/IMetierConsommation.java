package com.gestionhotel.gestionhotel.metier.consommation;
/*
 * Projet: Morphee
 * Interface: IMétierConsommation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import com.gestionhotel.gestionhotel.entities.Consommation;

public interface IMetierConsommation {
	
	public Consommation addconsommationSachantProduit(Consommation c,
			Long idProduit, Long idReservation);
}
