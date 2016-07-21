package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.gestionhotel.gestionhotel.entities.Produits;
/**
 * 
 * @author Zineb LAMRANI
 * classe : model du formulaire de modification d'un produit
 *version : 1.0.0
 *date : 20/07/2016
 */
public class UpdateProduitModel {
	/*--------Attributs----------*/
	private Long idProduit;
	private Produits produit;
	List<Produits>listeDesProduits;
	@NotNull(message="Le prix est obligatoire")
	private Double prixProduit;
	@NotEmpty(message="Le nom est obligatoire")
	private String nomProduit;
	@NotEmpty(message="La référence est obligatoire")
	private String referenceProduit;
	@NotNull(message="La quantité est obligatoire")
	private Integer quantiteProduit;
	/*-----------Getters et Setters--------*/
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public Produits getProduit() {
		return produit;
	}
	public void setProduit(Produits produit) {
		this.produit = produit;
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
	
	
}
