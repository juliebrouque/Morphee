package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Carte
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Cheques extends Paiements{

	//Attributs
	
	private Integer numCheque;

	public Cheques() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cheques(Date datePaiement) {
		super(datePaiement);
		// TODO Auto-generated constructor stub
	}

	public Cheques(Date datePaiement, Integer numCheque) {
		super(datePaiement);
		this.numCheque = numCheque;
	}
	public Cheques(Integer numCheque) {
		super();
		this.numCheque = numCheque;
	}

	//Get and Set
	
	public Integer getNumCheque() {
		return numCheque;
	}

	public void setNumCheque(Integer numCheque) {
		this.numCheque = numCheque;
	}
	
	
	
}
