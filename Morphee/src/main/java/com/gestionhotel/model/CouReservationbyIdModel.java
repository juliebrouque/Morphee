package com.gestionhotel.model;

import javax.validation.constraints.NotNull;

public class CouReservationbyIdModel {

	//Attributs 
	
	private String exceptionReservationCoutId;
	@NotNull(message="Renseigner l'identifiant de la réservation")
	private Long idReservation;
	private double coutResById;
	
	//Get and Set
	
	public String getExceptionReservationCoutId() {
		return exceptionReservationCoutId;
	}
	public void setExceptionReservationCoutId(String exceptionReservationCoutId) {
		this.exceptionReservationCoutId = exceptionReservationCoutId;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public double getCoutResById() {
		return coutResById;
	}
	public void setCoutResById(double coutResById) {
		this.coutResById = coutResById;
	}
	
	
}
