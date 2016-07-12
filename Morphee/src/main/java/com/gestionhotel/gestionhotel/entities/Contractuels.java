package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/*
 * Projet: Morphee
 * Class: Contractuels
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
@DiscriminatorValue("CDI")
public class Contractuels extends Employes{

	//Attributs
	
	private double prime;

	//Constructors
	
	public Contractuels() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contractuels(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne,
			Date dateEntrePersonne, double salaire) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne, dateEntrePersonne, salaire);
		// TODO Auto-generated constructor stub
	}

	public Contractuels(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne);
		// TODO Auto-generated constructor stub
	}

	public Contractuels(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne,
			Date dateEntrePersonne, double salaire, double prime) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne, dateEntrePersonne,
				salaire);
		this.prime = prime;
	}
	
	//Get and Set

	public double getPrime() {
		return prime;
	}

	public void setPrime(double prime) {
		this.prime = prime;
	}
	
}
