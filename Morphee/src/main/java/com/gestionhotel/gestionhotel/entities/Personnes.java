package com.gestionhotel.gestionhotel.entities;
/*
 * Projet: Morphee
 * Class: Personnes
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Personnes {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPersonnes;
	private String nomPersonne;
	private String prenomPersonne;
	
	@Temporal(TemporalType.DATE)
	private Date dateDeNaissance;
	private String adressePersonne;
	private String adresseMailPersonne;
	private String numTelPersonnne;
	
	@ManyToOne
	@JoinColumn(name="idHotel")
	private Hotel hotelPersonne;
	
	@OneToMany(mappedBy="personne")
	private List<Reservations> tabReservationPersonne=new ArrayList<Reservations>();
	
	//Constructors
	
	public Personnes(String nomPersonne, String prenomPersonne,
			Date dateDeNaissance, String adressePersonne,
			String adresseMailPersonne, String numTelPersonnne) {
		super();
		this.nomPersonne = nomPersonne;
		this.prenomPersonne = prenomPersonne;
		this.dateDeNaissance = dateDeNaissance;
		this.adressePersonne = adressePersonne;
		this.adresseMailPersonne = adresseMailPersonne;
		this.numTelPersonnne = numTelPersonnne;
	}

	public Personnes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Get and Set

	public Long getIdPersonnes() {
		return idPersonnes;
	}

	public void setIdPersonnes(Long idPersonnes) {
		this.idPersonnes = idPersonnes;
	}

	public String getNomPersonne() {
		return nomPersonne;
	}

	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}

	public String getPrenomPersonne() {
		return prenomPersonne;
	}

	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdressePersonne() {
		return adressePersonne;
	}

	public void setAdressePersonne(String adressePersonne) {
		this.adressePersonne = adressePersonne;
	}

	public String getAdresseMailPersonne() {
		return adresseMailPersonne;
	}

	public void setAdresseMailPersonne(String adresseMailPersonne) {
		this.adresseMailPersonne = adresseMailPersonne;
	}

	public String getNumTelPersonnne() {
		return numTelPersonnne;
	}

	public void setNumTelPersonnne(String numTelPersonnne) {
		this.numTelPersonnne = numTelPersonnne;
	}

	public Hotel getHotelPersonne() {
		return hotelPersonne;
	}

	public void setHotelPersonne(Hotel hotelPersonne) {
		this.hotelPersonne = hotelPersonne;
	}

	public List<Reservations> getTabReservationPersonne() {
		return tabReservationPersonne;
	}

	public void setTabReservationPersonne(List<Reservations> tabReservationPersonne) {
		this.tabReservationPersonne = tabReservationPersonne;
	}

	
}
