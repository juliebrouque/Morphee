package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Produits;

public class DeleteProduiModel {
	/*---------Atytributs-----*/
	@NotNull(message="Sélectionner un id produit")
private Long idProduit;
private List<Produits>listeDesProduits;
/*----------Getters et Setters-------*/


public Long getIdProduit() {
	return idProduit;
}

public List<Produits> getListeDesProduits() {
	return listeDesProduits;
}

public void setListeDesProduits(List<Produits> listeDesProduits) {
	this.listeDesProduits = listeDesProduits;
}

public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}

}
