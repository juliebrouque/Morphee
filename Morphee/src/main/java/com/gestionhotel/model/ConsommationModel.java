package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Consommation;

public class ConsommationModel {

	//Attributs
	
	@NotNull(message="Renseigner une quantité")
	private Integer quantiteConsomee;
	@NotNull(message="Selectionner une réservation")
	private Long idReservation;
	@NotNull(message="Selectionner un produit")
	private Long idProduit;
	private Consommation conso;
	
	//Get and Set
	
	public Integer getQuantiteConsomee() {
		return quantiteConsomee;
	}
	public void setQuantiteConsomee(Integer quantiteConsomee) {
		this.quantiteConsomee = quantiteConsomee;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Consommation getConso() {
		return conso;
	}
	public void setConso(Consommation conso) {
		this.conso = conso;
	}
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	
	
	
}


