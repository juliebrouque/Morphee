package com.gestionhotel.gestionhotel.metier.hotel;

import java.util.List;
import java.util.logging.Logger;

import com.gestionhotel.gestionhotel.dao.hotel.IDaoHotel;
import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.exception.MyException;
/*
 * Projet: Morphee
 * Classe: MétierHotelImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
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
	public List<Employes> getTabEmploye(Long idHotel) throws MyException {
		// TODO Auto-generated method stub
		return dao.getTabEmploye(idHotel);
	}
	@Override
	public List<Client> gettabClient(Long idHotel) throws MyException {
		// TODO Auto-generated method stub
		return dao.gettabClient(idHotel);
	}
}
