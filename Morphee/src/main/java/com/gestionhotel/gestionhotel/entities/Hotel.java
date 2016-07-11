package com.gestionhotel.gestionhotel.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*
 * Projet: Morphee
 * Class: Hotel
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Hotel {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idHotel;
	private String nomHotel;
	private String adresseHotel;
	private Integer classeHotel;
	
	@OneToMany(mappedBy="hotel")
	private List<Chambres> tabChambreHotel=new ArrayList<Chambres>();
	
	@OneToMany(mappedBy="hotelPersonne")
	private List<Personnes> tabPersonneHotel=new ArrayList<Personnes>();
	
	@OneToMany(mappedBy="hotelFacture")
	private List<Factures> tabFactureHotel=new ArrayList<Factures>();
	
	//Constructors
	
	public Hotel(String nomHotel, String adresseHotel, Integer classeHotel) {
		super();
		this.nomHotel = nomHotel;
		this.adresseHotel = adresseHotel;
		this.classeHotel = classeHotel;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//Get and Set
	
	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNomHotel() {
		return nomHotel;
	}

	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}

	public String getAdresseHotel() {
		return adresseHotel;
	}

	public void setAdresseHotel(String adresseHotel) {
		this.adresseHotel = adresseHotel;
	}

	public Integer getClasseHotel() {
		return classeHotel;
	}

	public void setClasseHotel(Integer classeHotel) {
		this.classeHotel = classeHotel;
	}

	public List<Chambres> getTabChambreHotel() {
		return tabChambreHotel;
	}

	public void setTabChambreHotel(List<Chambres> tabChambreHotel) {
		this.tabChambreHotel = tabChambreHotel;
	}

	public List<Personnes> getTabPersonneHotel() {
		return tabPersonneHotel;
	}

	public void setTabPersonneHotel(List<Personnes> tabPersonneHotel) {
		this.tabPersonneHotel = tabPersonneHotel;
	}

	public List<Factures> getTabFactureHotel() {
		return tabFactureHotel;
	}

	public void setTabFactureHotel(List<Factures> tabFactureHotel) {
		this.tabFactureHotel = tabFactureHotel;
	}
	
}
