package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gestionhotel.gestionhotel.entities.Produits;
/**
 * 
 * @author Zineb LAMRANI
 * classe : classe model pour le formulaire d'enregistrement d'un produit
 * version 1.0.0
 * 
 *
 */
public class SaveProduitModel {
	/*----- attributs-----------------*/
	private Long idProduit;
	@NotNull(message="Le prix du produit est obligatoire")
	private Double prixProduit;
	@NotEmpty(message="Le nom du produit est obligatoire")
	private String nomProduit;
	@NotEmpty(message="La référence produit est obligatoire")
	private String referenceProduit;
	@NotNull(message="Veuillez indiquer la quantité")
	private Integer quantiteProduit;
	private Produits produit;
	List<Produits>listeDesProduits;
	
	/*--------------Getters et Setters----------------*/
	
	
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
	
	
	
}
