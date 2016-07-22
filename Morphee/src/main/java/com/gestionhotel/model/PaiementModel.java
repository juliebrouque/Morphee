package com.gestionhotel.model;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
/**
 * 
 * @author Zineb LAMRANI
 * classe : Model de la classe paiement
 * version: 1.0.0
 * date : 19/07/2016
 *
 */
public class PaiementModel {
	/*---------attributs----------*/
	private Long idPaiement;
	private Long idFacture;
	@DateTimeFormat(pattern="dd/MM/yyyy") 
	private Date datePaiement;
	private Factures facturePaiement;
	private List<Paiements>listeDesPaiements;
	private List<Factures>listeDesFactures;
/*----------Getters et setters---------*/
	
	
	public Long getIdPaiement() {
		return idPaiement;
	}
	public List<Factures> getListeDesFactures() {
		return listeDesFactures;
	}
	public void setListeDesFactures(List<Factures> listeDesFactures) {
		this.listeDesFactures = listeDesFactures;
	}
	public List<Paiements> getListeDesPaiements() {
		return listeDesPaiements;
	}
	public void setListeDesPaiements(List<Paiements> listeDesPaiements) {
		this.listeDesPaiements = listeDesPaiements;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
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
