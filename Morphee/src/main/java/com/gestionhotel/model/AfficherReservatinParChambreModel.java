package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Reservations;

public class AfficherReservatinParChambreModel {

	//Attributs
	
	@NotNull(message="Renseigner l'identifiant de la chambre")
	private Long idChambre;
	private String exceptionReservationChambre;
	private List<Reservations> tabRerservationChambre;
	
	//Get and Set
	
	public Long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	public String getExceptionReservationChambre() {
		return exceptionReservationChambre;
	}
	public void setExceptionReservationChambre(String exceptionReservationChambre) {
		this.exceptionReservationChambre = exceptionReservationChambre;
	}
	public List<Reservations> getTabRerservationChambre() {
		return tabRerservationChambre;
	}
	public void setTabRerservationChambre(List<Reservations> tabRerservationChambre) {
		this.tabRerservationChambre = tabRerservationChambre;
	}
	
	
}
