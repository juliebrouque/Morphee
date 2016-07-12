package com.gestionhotel.gestionhotel.entities;
/*
 * Projet: Morphee
 * Class: Factures
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javassist.expr.NewArray;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Factures {

	//Attributs
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFacture;
	
	@Temporal(TemporalType.DATE)
	private Date dateFacturation;
	private double tva;
	
	@OneToMany(mappedBy="facture")
	private List<Reservations> tabReservationsFactures= new ArrayList<Reservations>();
	
	
	@OneToOne(mappedBy="facturePaiement")
	private Paiements paiement;
	
	//Constructors
	
	public Factures() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Factures(Date dateFacturation, double tva) {
		super();
		this.dateFacturation = dateFacturation;
		this.tva = tva;
	}

	//Get and Set
	
	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public Date getDateFacturation() {
		return dateFacturation;
	}

	public void setDateFacturation(Date dateFacturation) {
		this.dateFacturation = dateFacturation;
	}

	public double getTva() {
		return tva;
	}

	public void setTva(double tva) {
		this.tva = tva;
	}

	public List<Reservations> getTabReservationsFactures() {
		return tabReservationsFactures;
	}

	public void setTabReservationsFactures(
			List<Reservations> tabReservationsFactures) {
		this.tabReservationsFactures = tabReservationsFactures;
	}


	public Paiements getPaiement() {
		return paiement;
	}

	public void setPaiement(Paiements paiement) {
		this.paiement = paiement;
	}	
}
