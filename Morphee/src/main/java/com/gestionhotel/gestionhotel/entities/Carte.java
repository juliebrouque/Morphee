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
public class Carte extends Paiements{

	//Attributs
	
	private String typeCarte;
	private Integer numCarte;
	
	//Constructors
	
	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carte(Date datePaiement) {
		super(datePaiement);
		// TODO Auto-generated constructor stub
	}
	public Carte(Date datePaiement, String typeCarte, Integer numCarte) {
		super(datePaiement);
		this.typeCarte = typeCarte;
		this.numCarte = numCarte;
	}
	public Carte(String typeCarte, Integer numCarte) {
		super();
		this.typeCarte = typeCarte;
		this.numCarte = numCarte;
	}
	
	//Get and Set
	
	public String getTypeCarte() {
		return typeCarte;
	}
	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}
	public Integer getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(Integer numCarte) {
		this.numCarte = numCarte;
	}
	
	
}
