package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;


import com.gestionhotel.gestionhotel.entities.Personnes;

public class CoutAnnuelClientModel {

	
	// Attributs
	
	@NotNull(message="Un client doit être selectionné")
	private Long annee;
	@NotNull(message="Un client doit être selectionné")
	private Long idClient;
	private double cout;
	
	private List<Personnes> tabCoutAnnuelClient;

	//Get and Set
	
	public Long getAnnee() {
		return annee;
	}

	public void setAnnee(Long annee) {
		this.annee = annee;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public double getCout() {
		return cout;
	}

	public void setCout(double cout) {
		this.cout = cout;
	}

	public List<Personnes> getTabCoutAnnuelClient() {
		return tabCoutAnnuelClient;
	}

	public void setTabCoutAnnuelClient(List<Personnes> tabCoutAnnuelClient) {
		this.tabCoutAnnuelClient = tabCoutAnnuelClient;
	}
	
	
}
