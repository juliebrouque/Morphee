package com.gestionhotel.gestionhotel.entities;

import javax.persistence.Entity;
/*
 * Projet: Morphee
 * Class: Double
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Double extends Chambres{

	public Double() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double(Integer etageChambre) {
		super(etageChambre);
		// TODO Auto-generated constructor stub
	}

}
