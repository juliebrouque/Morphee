package com.gestionhotel.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Reservations;
/**
 * 
 * @author Zineb LAMRANI
 * classe: controller pour le formulaire d'enregistrement de la chambre
 * version 1.0.0
 * date : 19/07/2016
 *
 */
public class SaveChambreModel {
	/*---------attributs-------------*/
	@NotNull(message="le numéro de chambre est obligatoire")
	private Integer numChambre;
	@NotNull(message="Le prix de la chambre est obligatoire")
	private Double prixChambre;
	@NotNull(message="La surface de la chambre est obligatoire")
	private Double surfaceChambre;
	@NotNull(message="Veuillez précisez l'étage de la chambre")
	private Integer etageChambre;
	@NotNull(message="Veuillez indiquez le nombre de pièces")
	private Integer nbPieceChambre;
	@NotNull(message="Veuillez précisez le nombre de lits de la chambre")
	private Integer nbLitChambre;
	@NotNull(message="Veuillez indiquez l'id de l'hotel correspondant")
	private Long idHotel;
	private Chambres chambre;
	private Hotel hotel;
	private List<Chambres>listeDesChambres;
	private List<Reservations> tabReservationChambre=new ArrayList<Reservations>();
	private String SaveChambreException;
	/*------------Getters et Setters------------*/
	
	
	public Integer getNumChambre() {
		return numChambre;
	}
	public String getSaveChambreException() {
		return SaveChambreException;
	}
	public void setSaveChambreException(String saveChambreException) {
		SaveChambreException = saveChambreException;
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
	public List<Reservations> getTabReservationChambre() {
		return tabReservationChambre;
	}
	public void setTabReservationChambre(List<Reservations> tabReservationChambre) {
		this.tabReservationChambre = tabReservationChambre;
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
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	
	
}
