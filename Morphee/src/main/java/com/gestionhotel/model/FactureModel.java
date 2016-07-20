package com.gestionhotel.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Reservations;

public class FactureModel {

	// Attributs 
	
	private Factures facture;
	@NotNull(message="La date dinscription est obligatoire")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateFacturation;
	@NotNull(message="Renseigner la TVA")
	private double tva;
	@NotNull(message="Renseigner l'identifiant de la réservation à facturer")
	private Long idReservation;
	
	//Attributs tableaux
	
	private List<Reservations> tabFactureReservation;
	
	
	//Get and Set
	
	public Factures getFacture() {
		return facture;
	}
	public void setFacture(Factures facture) {
		this.facture = facture;
	}
	public Date getDateFacturation() {
		return dateFacturation;
	}
	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}
	public double getTva() {
		return tva;
	}
	public void setTva(double tva) {
		this.tva = tva;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public List<Reservations> getTabFactureReservation() {
		return tabFactureReservation;
	}
	public void setTabFactureReservation(List<Reservations> tabFactureReservation) {
		this.tabFactureReservation = tabFactureReservation;
	}
	
	
}
