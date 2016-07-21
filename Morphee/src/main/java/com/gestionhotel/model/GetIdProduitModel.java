package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Produits;

public class GetIdProduitModel {
	/*--------attributs---------*/
@NotNull(message="L'id produit est obligatoire")	
private Long idProduit;
private Produits produit;
List<Produits>listeDesProduits;
private Double prixProduit;
private String nomProduit;
private String referenceProduit;
private Integer quantiteProduit;
/*-----------Getters et Setters---------*/


public Long getIdProduit() {
	return idProduit;
}

public List<Produits> getListeDesProduits() {
	return listeDesProduits;
}

public void setListeDesProduits(List<Produits> listeDesProduits) {
	this.listeDesProduits = listeDesProduits;
}

public Double getPrixProduit() {
	return prixProduit;
}

public void setPrixProduit(Double prixProduit) {
	this.prixProduit = prixProduit;
}

public String getNomProduit() {
	return nomProduit;
}

public void setNomProduit(String nomProduit) {
	this.nomProduit = nomProduit;
}

public String getReferenceProduit() {
	return referenceProduit;
}

public void setReferenceProduit(String referenceProduit) {
	this.referenceProduit = referenceProduit;
}

public Integer getQuantiteProduit() {
	return quantiteProduit;
}

public void setQuantiteProduit(Integer quantiteProduit) {
	this.quantiteProduit = quantiteProduit;
}

public Produits getProduit() {
	return produit;
}

public void setProduit(Produits produit) {
	this.produit = produit;
}

public void setIdProduit(Long idProduit) {
	this.idProduit = idProduit;
}


}
