package com.gestionhotel.gestionhotel.entities;
/*
 * Projet: Morphee
 * Class: Chambres
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Chambres {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idChambre;
	private Integer numChambre;
	private double prixChambre;
	private double surfaceChambre;
	private Integer etageChambre;
	private Integer nbPieceChambre;
	private Integer nbLitChambre;
	
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotel;
	
	@OneToMany(mappedBy="chambre")
	private List<Reservations> tabReservationChambre=new ArrayList<Reservations>();
	
	//Contructors 
	
	public Chambres(Integer etageChambre) {
		super();
		this.etageChambre = etageChambre;
	}

	public Chambres() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Get and Set

	public Long getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}

	

	public Integer getEtageChambre() {
		return etageChambre;
	}

	public void setEtageChambre(Integer etageChambre) {
		this.etageChambre = etageChambre;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Reservations> getTabReservationChambre() {
		return tabReservationChambre;
	}

	public void setTabReservationChambre(List<Reservations> tabReservationChambre) {
		this.tabReservationChambre = tabReservationChambre;
	}

	public double getPrixChambre() {
		return prixChambre;
	}

	public void setPrixChambre(double prixChambre) {
		this.prixChambre = prixChambre;
	}

	public double getSurfaceChambre() {
		return surfaceChambre;
	}

	public void setSurfaceChambre(double surfaceChambre) {
		this.surfaceChambre = surfaceChambre;
	}

	public Integer getNbPieceChambre() {
		return nbPieceChambre;
	}

	public void setNbPieceChambre(Integer nbPieceChambre) {
		this.nbPieceChambre = nbPieceChambre;
	}

	public Integer getNbLitChambre() {
		return nbLitChambre;
	}

	public void setNbLitChambre(Integer nbLitChambre) {
		this.nbLitChambre = nbLitChambre;
	}

	
}
