package com.gestionhotel.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.entities.Reservations;

public class AddPaiementModel {
	/*----------Attributs----------*/
	@NotNull(message="Sélectionner un id facture")
	private Long idFacture;
	private Long idPaiement;
	private Date datePaiement;

	private List<Factures>tabFacturesExist;
	private List<Paiements> listeDesPaiements;
	private List<Reservations> tabReservationExi;
	private List<Consommation> tabConsommationProduit;
	private String addPaiementException;
	private Paiements paiement;

	/*----------Getters et Setters---------*/


	public Date getDatePaiement() {
		return datePaiement;
	}
	public String getAddPaiementException() {
		return addPaiementException;
	}
	public void setAddPaiementException(String addPaiementException) {
		this.addPaiementException = addPaiementException;
	}
	public Long getIdPaiement() {
		return idPaiement;
	}
	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}
	public List<Reservations> getTabReservationExi() {
		return tabReservationExi;
	}
	public void setTabReservationExi(List<Reservations> tabReservationExi) {
		this.tabReservationExi = tabReservationExi;
	}
	public List<Consommation> getTabConsommationProduit() {
		return tabConsommationProduit;
	}
	public void setTabConsommationProduit(List<Consommation> tabConsommationProduit) {
		this.tabConsommationProduit = tabConsommationProduit;
	}
	public List<Paiements> getListeDesPaiements() {
		return listeDesPaiements;
	}
	public void setListeDesPaiements(List<Paiements> listeDesPaiements) {
		this.listeDesPaiements = listeDesPaiements;
	}
	public Paiements getPaiement() {
		return paiement;
	}
	public void setPaiement(Paiements paiement) {
		this.paiement = paiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}

	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public List<Factures> getTabFacturesExist() {
		return tabFacturesExist;
	}
	public void setTabFacturesExist(List<Factures> tabFacturesExist) {
		this.tabFacturesExist = tabFacturesExist;
	}
	




}
