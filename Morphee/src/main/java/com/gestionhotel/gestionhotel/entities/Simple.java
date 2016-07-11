package com.gestionhotel.gestionhotel.entities;

import javax.persistence.Entity;

/*
 * Projet: Morphee
 * Class: Simple
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Simple extends Chambres{

	//Constructors
	
	public Simple() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Simple(Integer etageChambre) {
		super(etageChambre);
		// TODO Auto-generated constructor stub
	}
}
