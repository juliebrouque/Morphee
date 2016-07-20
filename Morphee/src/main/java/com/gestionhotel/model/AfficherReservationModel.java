package com.gestionhotel.model;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Reservations;

public class AfficherReservationModel {
	
	//Attributs
	
	@NotNull(message="Renseigner l'identifiant de la réservation")
	private Long idReservation;
	private Reservations reservation;
	private String exceptionReservationById;
	
	//Get and Set
	
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Reservations getReservation() {
		return reservation;
	}
	public void setReservation(Reservations reservation) {
		this.reservation = reservation;
	}
	public String getExceptionReservationById() {
		return exceptionReservationById;
	}
	public void setExceptionReservationById(String exceptionReservationById) {
		this.exceptionReservationById = exceptionReservationById;
	}
	
	
	
}
