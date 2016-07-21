package com.gestionhotel.model;

import java.util.List;




import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Produits;

public class ProduitModel {

	List<Produits>listeDesProduits;
	private Long idProduit;
	private Double prixProduit;
	private String nomProduit;
	private String referenceProduit;
	private Integer quantiteProduit;
	private Produits produit;
	
	
/*-----------Getters et Setters----------*/
	
	public List<Produits> getListeDesProduits() {
		return listeDesProduits;
	}

	public Produits getProduit() {
		return produit;
	}

	public void setProduit(Produits produit) {
		this.produit = produit;
	}

	public void setListeDesProduits(List<Produits> listeDesProduits) {
		this.listeDesProduits = listeDesProduits;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public double getPrixProduit() {
		return prixProduit;
	}

	public void setPrixProduit(double prixProduit) {
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

	public void setPrixProduit(Double prixProduit) {
		this.prixProduit = prixProduit;
	}

	
	
}
