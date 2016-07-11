package com.gestionhotel.gestionhotel.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
/*
 * Projet: Morphee
 * Class: Consommation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produits {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idProduit;
	private double prixProduit;
	private String nomProduit;
	private String referenceProduit;
	private Integer quantiteProduit;
	
	@OneToMany(mappedBy="produit")
	private List<Consommation> tabConsommationProduit=new ArrayList<Consommation>();
	
	//Constructors
	
	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Produits(double prixProduit, String nomProduit,
			String referenceProduit, Integer quantiteProduit) {
		super();
		this.prixProduit = prixProduit;
		this.nomProduit = nomProduit;
		this.referenceProduit = referenceProduit;
		this.quantiteProduit = quantiteProduit;
	}


	//Get and Set
	
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



	public List<Consommation> getTabConsommationProduit() {
		return tabConsommationProduit;
	}

	public void setTabConsommationProduit(List<Consommation> tabConsommationProduit) {
		this.tabConsommationProduit = tabConsommationProduit;
	}

	
}
