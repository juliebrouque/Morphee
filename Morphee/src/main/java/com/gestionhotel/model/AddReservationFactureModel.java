package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Reservations;

public class AddReservationFactureModel {

	//Attributs 
	@NotNull(message="Renseigner l' identifiant de la facture")
	private Long idFactures;
	@NotNull(message="Renseigner l'identifiant de la réservation")
	private Long idReservation;
	private List<Reservations> tabReservationExi;
	private List<Factures> tabFacturesExist;
	private List<Personnes> tabPersonnesExi;
	
	//Get and Set
	
	public Long getIdFactures() {
		return idFactures;
	}
	public void setIdFactures(Long idFactures) {
		this.idFactures = idFactures;
	}
	public List<Reservations> getTabReservationExi() {
		return tabReservationExi;
	}
	public void setTabReservationExi(List<Reservations> tabReservationExi) {
		this.tabReservationExi = tabReservationExi;
	}
	public List<Factures> getTabFacturesExist() {
		return tabFacturesExist;
	}
	public void setTabFacturesExist(List<Factures> tabFacturesExist) {
		this.tabFacturesExist = tabFacturesExist;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public List<Personnes> getTabPersonnesExi() {
		return tabPersonnesExi;
	}
	public void setTabPersonnesExi(List<Personnes> tabPersonnesExi) {
		this.tabPersonnesExi = tabPersonnesExi;
	}
	
	
}
