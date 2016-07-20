package com.gestionhotel.gestionhotel.metier.hotel;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import com.gestionhotel.gestionhotel.dao.hotel.IDaoHotel;
import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;
/*
 * Projet: Morphee
 * Classe: MétierHotelImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Transactional
public class MetierHotelImplement implements IMetierHotel{

	//Attributs 
	
	private IDaoHotel dao;
	Logger log=Logger.getLogger("MetierHotelImplement");
	
	//Set
	
	public void setDao(IDaoHotel dao) {
		this.dao = dao;
		log.info("<----------daoHotel injected-------->");
	}
	
	//Méthodes
	
	@Override
	public Hotel addHotel(Hotel h) {
		// TODO Auto-generated method stub
		return dao.addHotel(h);
	}
	@Override
	public List<Personnes> getTabEmployeCdi(Long idHotel) throws MyException {
		// TODO Auto-generated method stub
		return dao.getTabEmployeCdi(idHotel);
	}
	@Override
	public List<Personnes> gettabClient(Long idHotel) throws MyException {
		// TODO Auto-generated method stub
		return dao.gettabClient(idHotel);
	}

	@Override
	public Hotel getHotel(Long idHotel) {
		// TODO Auto-generated method stub
		return dao.getHotel(idHotel);
	}

	@Override
	public List<Hotel> getHotels() {
		// TODO Auto-generated method stub
		return dao.getHotels();
	}


	@Override
	public List<Personnes> getTabEmployeCdd(Long idHotel) throws MyException {
		// TODO Auto-generated method stub
		return dao.getTabEmployeCdd(idHotel);
	}
}
