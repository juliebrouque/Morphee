package com.gestionhotel.gestionhotel.metier.reservation;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;

/*
 * Projet: Morphee
 * Interface: IMétierReservation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public interface IMetierReservation {

	public Reservations addReservation(Reservations r, Long idClient, Long idChambre) throws MyException;
	public void addConsommationReservation(Long idConsommation, Long idReservation);
	public List<Reservations> getReservations();
	public Reservations getReservation(Long idReservation);
	public void deleteReservation(Long idReservation);
	public Reservations updateReservation(Reservations r);
	public double coûtReservation(Long idReservation);
	public double coûtReservations();
	public double getStockProduit(Long idProduit);
	
}
