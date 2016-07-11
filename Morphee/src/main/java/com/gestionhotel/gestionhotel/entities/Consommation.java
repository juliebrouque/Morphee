package com.gestionhotel.gestionhotel.entities;
/*
 * Projet: Morphee
 * Class: Consommation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Consommation {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idConsommation;
	private Integer quantiteConsomee;
	
	@ManyToOne
	@JoinColumn(name="idReservation")
	private Reservations reservation;
	
	@ManyToOne
	@JoinColumn(name="idProduit")
	private Produits produit;
	
	
	//Constructors
	
	public Consommation(Integer quantiteConsomee) {
		super();
		this.quantiteConsomee = quantiteConsomee;
	}
	public Consommation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Get and Set
	
	public Long getIdConsommation() {
		return idConsommation;
	}
	public void setIdConsommation(Long idConsommation) {
		this.idConsommation = idConsommation;
	}
	public Integer getQuantiteConsomee() {
		return quantiteConsomee;
	}
	public void setQuantiteConsomee(Integer quantiteConsomee) {
		this.quantiteConsomee = quantiteConsomee;
	}
	public Reservations getReservation() {
		return reservation;
	}
	public void setReservation(Reservations reservation) {
		this.reservation = reservation;
	}
	public Produits getProduit() {
		return produit;
	}
	public void setProduit(Produits produit) {
		this.produit = produit;
	}
	
}
