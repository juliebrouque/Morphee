package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Client
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("CLI")
public class Client extends Personnes{

	//Attributs
	
	@Temporal(TemporalType.DATE)
	private Date dateInscriptionClient;
	private Integer nbReservation;
	private double reduction;
	
	//Constructors
	
	public Client(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne,
			Date dateInscriptionClient, Integer nbReservation, double reduction) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne);
		this.dateInscriptionClient = dateInscriptionClient;
		this.nbReservation = nbReservation;
		this.reduction = reduction;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne) {
		super(nomPersonne, prenomPersonne, dateDeNaissance, adressePersonne,
				adresseMailPersonne, numTelPersonnne);
		// TODO Auto-generated constructor stub
	}
	
	//Get and Set

	public Date getDateInscriptionClient() {
		return dateInscriptionClient;
	}

	public void setDateInscriptionClient(Date dateInscriptionClient) {
		this.dateInscriptionClient = dateInscriptionClient;
	}

	public Integer getNbReservation() {
		return nbReservation;
	}

	public void setNbReservation(Integer nbReservation) {
		this.nbReservation = nbReservation;
	}

	public double getReduction() {
		return reduction;
	}

	public void setReduction(double reduction) {
		this.reduction = reduction;
	}
	
}
