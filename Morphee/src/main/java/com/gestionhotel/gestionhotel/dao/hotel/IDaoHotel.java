package com.gestionhotel.gestionhotel.dao.hotel;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;

public interface IDaoHotel {

	public Hotel addHotel(Hotel h);
	public List<Personnes> getTabEmployeCdi(Long idHotel) throws MyException;
	public List<Personnes> gettabClient(Long idHotel) throws MyException;
	public Hotel getHotel(Long idHotel);
	public List<Hotel> getHotels();
	public List<Personnes> getTabEmployeCdd(Long idHotel) throws MyException;
}
