package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Chambres;
/**
 * 
 * @author Zineb LAMRANI
 * classe: model du formulaire de suppression d'une chambre
 * version : 1.0.0
 * date: 20/07/2016
 *
 */
public class DeleteChambreModel {
	/*-----------Attributs----------*/
	@NotNull(message="Sélectionner l'id chambre")
	private Long idChambre;
	private List<Chambres>listeDesChambres;
	private String deleteChambreException;
	
	/*----------Getters et Setters----------*/
	
	
	public Long getIdChambre() {
		return idChambre;
	}
	public String getDeleteChambreException() {
		return deleteChambreException;
	}
	public void setDeleteChambreException(String deleteChambreException) {
		this.deleteChambreException = deleteChambreException;
	}
	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}
	
	public List<Chambres> getListeDesChambres() {
		return listeDesChambres;
	}
	public void setListeDesChambres(List<Chambres> listeDesChambres) {
		this.listeDesChambres = listeDesChambres;
	}
	
	
	
	
}

