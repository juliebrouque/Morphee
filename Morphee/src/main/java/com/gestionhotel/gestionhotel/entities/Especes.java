package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Espaces
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Especes extends Paiements{

	//Constructors
	
	public Especes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Especes(Date datePaiement) {
		super(datePaiement);
		// TODO Auto-generated constructor stub
	}

}
