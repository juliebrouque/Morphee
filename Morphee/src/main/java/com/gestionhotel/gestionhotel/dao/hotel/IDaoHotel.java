package com.gestionhotel.gestionhotel.dao.hotel;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.exception.MyException;

public interface IDaoHotel {

	public Hotel addHotel(Hotel h);
	public List<Employes> getTabEmploye(Long idHotel) throws MyException;
	public List<Client> gettabClient(Long idHotel) throws MyException;
}
