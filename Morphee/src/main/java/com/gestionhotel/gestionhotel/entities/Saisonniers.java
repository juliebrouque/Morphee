package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Saisonniers
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("CDD")
public class Saisonniers extends Employes{
	
	//Attributs
	
	@Temporal(TemporalType.DATE)
	private Date dateSortieSaisonnier;

	//Constructors
	
	public Saisonniers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Saisonniers(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne,
			Date dateEntrePersonne, double salaire) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne, dateEntrePersonne, salaire);
		// TODO Auto-generated constructor stub
	}

	public Saisonniers(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne);
		// TODO Auto-generated constructor stub
	}

	public Saisonniers(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne,
			Date dateEntrePersonne, double salaire, Date dateSortieSaisonnier) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne, dateEntrePersonne,
				salaire);
		this.dateSortieSaisonnier = dateSortieSaisonnier;
	}
	
	//Get and Set

	public Date getDateSortieSaisonnier() {
		return dateSortieSaisonnier;
	}

	public void setDateSortieSaisonnier(Date dateSortieSaisonnier) {
		this.dateSortieSaisonnier = dateSortieSaisonnier;
	}
	
}
