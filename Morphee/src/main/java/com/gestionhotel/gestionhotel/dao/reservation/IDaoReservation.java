package com.gestionhotel.gestionhotel.dao.reservation;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;

/*
 * Projet: Morphee
 * Interface: IDaoReservation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public interface IDaoReservation {
	
	public Reservations addReservation(Reservations r, Long idClient, Long idChambre) throws MyException;
	public List<Reservations> getReservations();
	public Reservations getReservation(Long idReservation) throws MyException;
	public void deleteReservation(Long idReservation);
	public Reservations updateReservation(Reservations r);
	public double coûtReservation(Long idReservation) throws MyException;
	public double coûtReservations();
	public double getStockProduit(Long idProduit);
	public List<Reservations> getReservationClient(Long idClient) throws MyException;
	public List<Reservations> getReservationChambre(Long idChambre) throws MyException;

}
