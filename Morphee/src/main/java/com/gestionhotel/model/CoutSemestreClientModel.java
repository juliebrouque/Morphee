package com.gestionhotel.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class CoutSemestreClientModel {

	//Attributs
	
	private double coutSemestre;
	@NotNull(message="Selectionner un client")
	private Long idClient;
	@NotNull(message="La date de début doit être renseignée")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateDebut;
	@NotNull(message="La date de fin doit être renseignée")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateFin;
	
	//Get and Set
	
	public double getCoutSemestre() {
		return coutSemestre;
	}
	public void setCoutSemestre(double coutSemestre) {
		this.coutSemestre = coutSemestre;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
}
