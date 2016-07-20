package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Reservations;

public class SupprimerReservationModel {

	//Attributs
	
	@NotNull(message="L' identifiant doit être renseigné")
	private Long idReservation;
	
	private List<Reservations> tabReservationEx;

	//Get and Set
	
	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public List<Reservations> getTabReservationEx() {
		return tabReservationEx;
	}

	public void setTabReservationEx(List<Reservations> tabReservationEx) {
		this.tabReservationEx = tabReservationEx;
	}

}
