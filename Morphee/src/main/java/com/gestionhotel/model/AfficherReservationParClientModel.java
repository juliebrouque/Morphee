package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Reservations;

public class AfficherReservationParClientModel {
	
	@NotNull(message="Renseigner l'identifiant du client")
	private Long idClient;
	private String exceptionReservationClient;
	private List<Reservations> tabReservationClient;
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getExceptionReservationClient() {
		return exceptionReservationClient;
	}
	public void setExceptionReservationClient(String exceptionReservationClient) {
		this.exceptionReservationClient = exceptionReservationClient;
	}
	public List<Reservations> getTabReservationClient() {
		return tabReservationClient;
	}
	public void setTabReservationClient(List<Reservations> tabReservationClient) {
		this.tabReservationClient = tabReservationClient;
	}
	
	
}
