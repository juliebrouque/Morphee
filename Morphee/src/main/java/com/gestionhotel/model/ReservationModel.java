package com.gestionhotel.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Reservations;

public class ReservationModel {

	//Attributs 
	
	private Reservations reservation;
	
	private Long idReservation;
	@NotNull(message="Renseigner l'identifiant du client")
	private Long idClient;
	@NotNull(message="Renseigner l'identifiant de la chambre")
	private Long idChambre;
	@NotNull(message="La date d' arrivée est obligatoire")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateArriveeReservation;
	@NotNull(message="La date de sortie est obligatoire")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateSortieReservation;
	private double coutResById;
	private double coutRes;
	
	
	//Attributs exceptions
	
	private String exceptionReservationDispo;
	
	
	//Attributs tableaux
	
	private List<Reservations> tabReservationExist;
	private List<Reservations> tabReservationClient;
	private List<Reservations> tabRerservationChambre;
	
	
	
	//Get and Set
	
	public Reservations getReservation() {
		return reservation;
	}
	public void setReservation(Reservations reservation) {
		this.reservation = reservation;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Long getIdChambre() {
		return idChambre;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	public Date getDateArriveeReservation() {
		return dateArriveeReservation;
	}
	public void setDateArriveeReservation(Date dateArriveeReservation) {
		this.dateArriveeReservation = dateArriveeReservation;
	}
	public Date getDateSortieReservation() {
		return dateSortieReservation;
	}
	public void setDateSortieReservation(Date dateSortieReservation) {
		this.dateSortieReservation = dateSortieReservation;
	}
	public String getExceptionReservationDispo() {
		return exceptionReservationDispo;
	}
	public void setExceptionReservationDispo(String exceptionReservationDispo) {
		this.exceptionReservationDispo = exceptionReservationDispo;
	}
	public List<Reservations> getTabReservationExist() {
		return tabReservationExist;
	}
	public void setTabReservationExist(List<Reservations> tabReservationExist) {
		this.tabReservationExist = tabReservationExist;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public List<Reservations> getTabReservationClient() {
		return tabReservationClient;
	}
	public void setTabReservationClient(List<Reservations> tabReservationClient) {
		this.tabReservationClient = tabReservationClient;
	}
	public List<Reservations> getTabRerservationChambre() {
		return tabRerservationChambre;
	}
	public void setTabRerservationChambre(List<Reservations> tabRerservationChambre) {
		this.tabRerservationChambre = tabRerservationChambre;
	}
	
	public double getCoutResById() {
		return coutResById;
	}
	public void setCoutResById(double coutResById) {
		this.coutResById = coutResById;
	}
	
	public double getCoutRes() {
		return coutRes;
	}
	public void setCoutRes(double coutRes) {
		this.coutRes = coutRes;
	}
	
	
}
