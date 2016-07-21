package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Reservations;
/**
 * 
 * @author Zineb LAMRANI
 * classe :model pour le formulaire de calcul de coût
 * version : 1.0.0
 * date : 21/07/2016
 *
 */
public class CoutBenefModel {
	/*------------attributs----------*/
	private Long idPaiement;
	private Long idFacture;
	private Long idReservation;
	private Long idConsommation;
	@NotNull(message="l'année est obligatoire")
	private Integer annee;
    private Double coutBenefAnnuel;
    private List<Reservations> tabReservationExi;
    private List<Consommation> tabConsommationProduit;
    private List<Factures> tabFacturesCoutBenef;

/*----------Getters et Setters-----------*/

    
    public Long getIdPaiement() {
	return idPaiement;
}
	public Integer getAnnee() {
		return annee;
	}
	public void setAnnee(Integer annee) {
		this.annee = annee;
	}
	public Double getCoutBenefAnnuel() {
		return coutBenefAnnuel;
	}

	public void setCoutBenefAnnuel(Double coutBenefAnnuel) {
		this.coutBenefAnnuel = coutBenefAnnuel;
	}

	public List<Factures> getTabFacturesCoutBenef() {
		return tabFacturesCoutBenef;
	}

	public void setTabFacturesCoutBenef(List<Factures> tabFacturesCoutBenef) {
		this.tabFacturesCoutBenef = tabFacturesCoutBenef;
	}

	public List<Consommation> getTabConsommationProduit() {
		return tabConsommationProduit;
	}

	public void setTabConsommationProduit(List<Consommation> tabConsommationProduit) {
		this.tabConsommationProduit = tabConsommationProduit;
	}

	public List<Reservations> getTabReservationExi() {
		return tabReservationExi;
	}

	public void setTabReservationExi(List<Reservations> tabReservationExi) {
		this.tabReservationExi = tabReservationExi;
	}

	public void setIdPaiement(Long idPaiement) {
		this.idPaiement = idPaiement;
	}
	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Long getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}
	public Long getIdConsommation() {
		return idConsommation;
	}
	public void setIdConsommation(Long idConsommation) {
		this.idConsommation = idConsommation;
	}


}
