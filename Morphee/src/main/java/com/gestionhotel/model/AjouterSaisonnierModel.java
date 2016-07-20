package com.gestionhotel.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Personnes;

public class AjouterSaisonnierModel {
	@NotEmpty(message="Le nom est obligatoire")
	private String nomEmploye;
	@NotEmpty(message="Le prénom est obligatoire")
	private String prenomEmploye;
	@NotNull(message="La date de naissance est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNE;
	@NotEmpty(message="L' adresse est obligatoire")
	private String adresseEmploye;
	@NotEmpty(message="L'adresse mail est obligatoire")
	private String adresseMailEmploye;
	@NotEmpty(message="Le numéro de téléphone est obligatoire")
	private String numTelEmploye;
	@NotNull(message="La date d' entrée est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateE;
	@NotNull(message="Le salaire est obligatoire")
	private double salaire;
	@NotNull(message="La date de sortie est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateS;
	private Personnes saisonnier;
	
	//Attribiuts Hotel
	
		@NotNull(message="L' identifiant de l'hotel doit être renseigné")
		private Long idHotel;
		
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getPrenomEmploye() {
		return prenomEmploye;
	}
	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}
	public Date getDateNE() {
		return dateNE;
	}
	public void setDateNE(Date dateNE) {
		this.dateNE = dateNE;
	}
	public String getAdresseEmploye() {
		return adresseEmploye;
	}
	public void setAdresseEmploye(String adresseEmploye) {
		this.adresseEmploye = adresseEmploye;
	}
	public String getAdresseMailEmploye() {
		return adresseMailEmploye;
	}
	public void setAdresseMailEmploye(String adresseMailEmploye) {
		this.adresseMailEmploye = adresseMailEmploye;
	}
	public String getNumTelEmploye() {
		return numTelEmploye;
	}
	public void setNumTelEmploye(String numTelEmploye) {
		this.numTelEmploye = numTelEmploye;
	}
	public Date getDateE() {
		return dateE;
	}
	public void setDateE(Date dateE) {
		this.dateE = dateE;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public Date getDateS() {
		return dateS;
	}
	public void setDateS(Date dateS) {
		this.dateS = dateS;
	}
	public Personnes getSaisonnier() {
		return saisonnier;
	}
	public void setSaisonnier(Personnes saisonnier) {
		this.saisonnier = saisonnier;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	
}
