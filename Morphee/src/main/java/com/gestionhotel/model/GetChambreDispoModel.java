package com.gestionhotel.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Reservations;
/**
 * @author Zineb LAMRANI
 * classe : model correspond au formulaire de récupération des chambres disponibles.
 * version : 1.0.0
 * date : 20/07/2016
 */
public class GetChambreDispoModel {
	/*---Attributs-----*/
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@NotNull(message="La date d'arrivée est obligatoire")
	private Date dateArrivee;
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	@NotNull(message="la date de sortie est obligatoire")
	private Date dateSortie;
	@NotNull(message="l'id de la chambre est obligatoire")
	private Long idChambre;
	private Chambres chambre;
	private Hotel hotel;
	private List<Chambres>listeDesChambres;
	private List<Chambres>listeChambresDispo;
	private List<Reservations>listeReservationParChambre;
	
	/*-----Getters et Setters---------*/
	
	
	public Date getDateArrivee() {
		return dateArrivee;
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
	public Long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	public List<Reservations> getListeReservationParChambre() {
		return listeReservationParChambre;
	}
	public void setListeReservationParChambre(
			List<Reservations> listeReservationParChambre) {
		this.listeReservationParChambre = listeReservationParChambre;
	}
	public List<Chambres> getListeChambresDispo() {
		return listeChambresDispo;
	}
	public void setListeChambresDispo(List<Chambres> listeChambresDispo) {
		this.listeChambresDispo = listeChambresDispo;
	}
	public List<Chambres> getListeDesChambres() {
		return listeDesChambres;
	}
	public void setListeDesChambres(List<Chambres> listeDesChambres) {
		this.listeDesChambres = listeDesChambres;
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
	
	
	
	
}
