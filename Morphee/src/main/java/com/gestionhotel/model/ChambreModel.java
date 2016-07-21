package com.gestionhotel.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Reservations;

public class ChambreModel {
	private Long idChambre;
	private Integer numChambre;
	private Double prixChambre;
	private Double surfaceChambre;
	private Integer etageChambre;
	private Integer nbPieceChambre;
	private Integer nbLitChambre;
	private Chambres chambre;
	private Long idHotel;
	private Hotel hotel;
	private List<Chambres>listeDesChambres;
	private List<Reservations> tabReservationChambre=new ArrayList<Reservations>();
	
	//-------gettters et setters----------------------
	
	
	public Long getIdChambre() {
		return idChambre;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public Chambres getChambre() {
		return chambre;
	}
	public void setChambre(Chambres chambre) {
		this.chambre = chambre;
	}
	public void setPrixChambre(Double prixChambre) {
		this.prixChambre = prixChambre;
	}
	public void setSurfaceChambre(Double surfaceChambre) {
		this.surfaceChambre = surfaceChambre;
	}
	public List<Chambres> getListeDesChambres() {
		return listeDesChambres;
	}
	public void setListeDesChambres(List<Chambres> listeDesChambres) {
		this.listeDesChambres = listeDesChambres;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	public Integer getNumChambre() {
		return numChambre;
	}
	public void setNumChambre(Integer numChambre) {
		this.numChambre = numChambre;
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
	public Integer getEtageChambre() {
		return etageChambre;
	}
	public void setEtageChambre(Integer etageChambre) {
		this.etageChambre = etageChambre;
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
	
	
	
}
