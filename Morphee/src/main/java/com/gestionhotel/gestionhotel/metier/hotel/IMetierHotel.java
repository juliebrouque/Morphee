package com.gestionhotel.gestionhotel.metier.hotel;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.exception.MyException;

/*
 * Projet: Morphee
 * Interface: IMétierHotel
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public interface IMetierHotel {

	public Hotel addHotel(Hotel h);
	public List<Employes> getTabEmploye(Long idHotel) throws MyException;
	public List<Client> gettabClient(Long idHotel) throws MyException;
}
