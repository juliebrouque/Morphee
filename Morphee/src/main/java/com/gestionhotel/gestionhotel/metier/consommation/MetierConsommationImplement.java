package com.gestionhotel.gestionhotel.metier.consommation;

import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.gestionhotel.gestionhotel.dao.consommation.IDaoConsommation;
import com.gestionhotel.gestionhotel.entities.Consommation;

/*
 * Projet: Morphee
 * Classe: MétierConsommationImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
@Transactional
public class MetierConsommationImplement implements IMetierConsommation{

	//Attributs
	
		private IDaoConsommation dao;
		Logger log=Logger.getLogger("MetierConsommationImplement");
		
	
		
	public void setDao(IDaoConsommation dao) {
			this.dao = dao;
			log.info("<----------------DaoConsommation injected---------------->");
		}



	@Override
	public Consommation addconsommationSachantProduit(Consommation c,
			Long idProduit, Long idReservation) {
		// TODO Auto-generated method stub
		return dao.addconsommationSachantProduit(c, idProduit, idReservation);
	}

}
