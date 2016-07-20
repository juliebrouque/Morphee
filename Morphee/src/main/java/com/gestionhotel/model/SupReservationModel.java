package com.gestionhotel.model;

import javax.validation.constraints.NotNull;

public class SupReservationModel {

	@NotNull(message="Selectionner une réservation")
	private Long idReservation;

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	
	
}
