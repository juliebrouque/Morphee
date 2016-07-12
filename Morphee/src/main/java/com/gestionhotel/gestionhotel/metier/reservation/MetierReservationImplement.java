package com.gestionhotel.gestionhotel.metier.reservation;

import java.util.List;
import java.util.logging.Logger;

import com.gestionhotel.gestionhotel.dao.reservation.IDaoReservation;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;

/*
 * Projet: Morphee
 * Classe: MétierReservationImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public class MetierReservationImplement implements IMetierReservation{

	//Attributs
	
	private IDaoReservation dao;
	Logger log=Logger.getLogger("MetierReservationImplement");
	
	//Set
	
	public void setDao(IDaoReservation dao) {
		this.dao = dao;
		log.info("<-----------------DaoReservation Injected---------------->");
	}
	
	@Override
	public Reservations addReservation(Reservations r, Long idClient,
			Long idChambre) throws MyException {
		// TODO Auto-generated method stub
		return dao.addReservation(r, idClient, idChambre);
	}


	@Override
	public List<Reservations> getReservations() {
		// TODO Auto-generated method stub
		return dao.getReservations();
	}

	@Override
	public Reservations getReservation(Long idReservation) {
		// TODO Auto-generated method stub
		return dao.getReservation(idReservation);
	}

	@Override
	public void deleteReservation(Long idReservation) {
		dao.deleteReservation(idReservation);
		
	}

	@Override
	public Reservations updateReservation(Reservations r) {
		// TODO Auto-generated method stub
		return dao.updateReservation(r);
	}

	@Override
	public double coûtReservation(Long idReservation) {
		// TODO Auto-generated method stub
		return dao.coûtReservation(idReservation);
	}

	@Override
	public double coûtReservations() {
		// TODO Auto-generated method stub
		return dao.coûtReservations();
	}

	@Override
	public double getStockProduit(Long idProduit) {
		// TODO Auto-generated method stub
		return dao.getStockProduit(idProduit);
	}

}
