package com.gestionhotel.gestionhotel.dao.consommation;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Consommation;

/**
 * 
 * @author inti0298 classe : interface de la classe consommation version:1.0.0
 *         date : 11/07/2016
 */
public interface IDaoConsommation {

	public Consommation addconsommationSachantProduit(Consommation c,
			Long idProduit, Long idReservation);
	public List<Consommation> getAllConsommation();
}
