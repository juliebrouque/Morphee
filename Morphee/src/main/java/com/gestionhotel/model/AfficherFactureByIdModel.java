package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Factures;

public class AfficherFactureByIdModel {

	//Attributs 
	
	@NotNull(message="Renseigner l'identifiant de la facture")
	private Long idFacture;
	private Factures facture;
	
	private List<Factures> tabFacture;
	
	//Get and Set
	
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Factures getFacture() {
		return facture;
	}
	public void setFacture(Factures facture) {
		this.facture = facture;
	}
	public List<Factures> getTabFacture() {
		return tabFacture;
	}
	public void setTabFacture(List<Factures> tabFacture) {
		this.tabFacture = tabFacture;
	}
	
	

}
