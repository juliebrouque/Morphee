package com.gestionhotel.gestionhotel.entities;

import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Suite
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Suite extends Chambres{
	
	//Constructors
	
	public Suite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Suite(Integer etageChambre) {
		super(etageChambre);
		// TODO Auto-generated constructor stub
	}

}
