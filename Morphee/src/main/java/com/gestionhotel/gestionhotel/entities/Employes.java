package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Employe
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employes extends Personnes{

	//Attributs
	
	@Temporal(TemporalType.DATE)
	private Date dateEntrePersonne;
	private double salaire;
	
	//Constructors
	
	public Employes(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne,
			Date dateEntrePersonne, double salaire) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne);
		this.dateEntrePersonne = dateEntrePersonne;
		this.salaire = salaire;
	}

	public Employes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employes(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne);
		// TODO Auto-generated constructor stub
	}

	//Get and Set 
	
	public Date getDateEntrePersonne() {
		return dateEntrePersonne;
	}

	public void setDateEntrePersonne(Date dateEntrePersonne) {
		this.dateEntrePersonne = dateEntrePersonne;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
