package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Hotel;

public class UpdateChambreModel {
	/*----------Attributs--------------*/
	private Long idChambre;
	@NotNull(message="le numéro de chambre est obligatoire")
	private Integer numChambre;
	@NotNull(message="le prix de la chambre est obligatoire")
	private Double prixChambre;
	@NotNull(message="la surfa de la chambre est obligatoire")
	private Double surfaceChambre;
	@NotNull(message="l'étage de la chambre est obligatoire")
	private Integer etageChambre;
	@NotNull(message="le nombre de pièces de la chambre est obligatoire")
	private Integer nbPieceChambre;
	@NotNull(message="le nombre de lits de la chambre est obligatoire")
	private Integer nbLitChambre;
	private Chambres chambre;
	private Hotel hotel;
	private List<Chambres>listeDesChambres;
	/*-----------Getters et Setters-------------*/
	public Long getIdChambre() {
		return idChambre;
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
	public Double getPrixChambre() {
		return prixChambre;
	}
	public void setPrixChambre(Double prixChambre) {
		this.prixChambre = prixChambre;
	}
	public Double getSurfaceChambre() {
		return surfaceChambre;
	}
	public void setSurfaceChambre(Double surfaceChambre) {
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
	public Chambres getChambre() {
		return chambre;
	}
	public void setChambre(Chambres chambre) {
		this.chambre = chambre;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public List<Chambres> getListeDesChambres() {
		return listeDesChambres;
	}
	public void setListeDesChambres(List<Chambres> listeDesChambres) {
		this.listeDesChambres = listeDesChambres;
	}
	
	
}
