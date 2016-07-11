package com.gestionhotel.gestionhotel.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*
 * Projet: Morphee
 * Class: Reservation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservations {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReservation;
	
	@Temporal(TemporalType.DATE)
	private Date dateArrivee;
	@Temporal(TemporalType.DATE)
	private Date dateSortie;
	
	@ManyToOne
	private Factures facture;
	
	@ManyToOne
	@JoinColumn(name="idPersonne")
	private Personnes personne;
	
	@ManyToOne
	@JoinColumn(name="idChambres")
	private Chambres chambre;
	
	@OneToMany(mappedBy="reservation")
	private List<Consommation> tabConsommationreservation=new ArrayList<Consommation>();
	
	//Constructors
	
	public Reservations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservations(Date dateArrivee, Date dateSortie) {
		super();
		this.dateArrivee = dateArrivee;
		this.dateSortie = dateSortie;
	}
	
	//Get and Set

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = dateArrivee;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public Factures getFacture() {
		return facture;
	}

	public void setFacture(Factures facture) {
		this.facture = facture;
	}

	public Personnes getPersonne() {
		return personne;
	}

	public void setPersonne(Personnes personne) {
		this.personne = personne;
	}

	public Chambres getChambre() {
		return chambre;
	}

	public void setChambre(Chambres chambre) {
		this.chambre = chambre;
	}

	public List<Consommation> getTabConsommationreservation() {
		return tabConsommationreservation;
	}

	public void setTabConsommationreservation(
			List<Consommation> tabConsommationreservation) {
		this.tabConsommationreservation = tabConsommationreservation;
	}

}
