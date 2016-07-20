package com.gestionhotel.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Personnes;

public class AfficherFactureClientModel {

	//Attributs
	
	@NotNull(message="Renseigner l'identifiant du client")
	private Long idClient;
	private Long nomClient;
	private Client client;
	private Factures facture;
	
	private List<Factures> tabFactureClient;
	private List<Personnes> tabClientFacture;

	//Get and Set
	
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Long getNomClient() {
		return nomClient;
	}

	public void setNomClient(Long nomClient) {
		this.nomClient = nomClient;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Factures getFacture() {
		return facture;
	}

	public void setFacture(Factures facture) {
		this.facture = facture;
	}

	public List<Factures> getTabFactureClient() {
		return tabFactureClient;
	}

	public void setTabFactureClient(List<Factures> tabFactureClient) {
		this.tabFactureClient = tabFactureClient;
	}

	public List<Personnes> getTabClientFacture() {
		return tabClientFacture;
	}

	public void setTabClientFacture(List<Personnes> tabClientFacture) {
		this.tabClientFacture = tabClientFacture;
	}

	
	
}
