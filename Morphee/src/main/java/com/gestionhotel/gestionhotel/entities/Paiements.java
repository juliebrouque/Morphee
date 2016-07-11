package com.gestionhotel.gestionhotel.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/*
 * Projet: Morphee
 * Class: Paiements
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */

@Entity
public class Paiements {

	//Attributs 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPaiement;
	
	@Temporal(TemporalType.DATE)
	private Date datePaiement;
	
	@OneToOne
	@JoinColumn(name="idFacture")
	private Factures facturePaiement;

	//Constructors
	
	public Paiements() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paiements(Date datePaiement) {
		super();
		this.datePaiement = datePaiement;
	}

	//Get and Set
	
	public Long getIdPaiement() {
		return idPaiement;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}

	public Date getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public Factures getFacturePaiement() {
		return facturePaiement;
	}

	public void setFacturePaiement(Factures facturePaiement) {
		this.facturePaiement = facturePaiement;
	}
	
	
	
}
