package com.gestionhotel.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Personnes;

public class AjouterClientModel {

	//Attribiuts Hotel
	
		@NotNull(message="L' identifiant de l'hotel doit être renseigné")
		private Long idHotel;
		
	//Attributs Clients
	
		@NotEmpty(message="Le nom est obligatoire")
		private String nomClient;
		@NotEmpty(message="Le prénom est obligatoire")
		private String prenomClient;
		@NotNull(message="La date de naissance est obligatoire")
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date dateN;
		@NotEmpty(message="L' adresse est obligatoire")
		private String adresseClient;
		@NotEmpty(message="L'adresse mail est obligatoire")
		private String adresseMailClient;
		@NotEmpty(message="Le numéro de téléphone est obligatoire")
		private String numTelClient;
		@NotNull(message="La date dinscription est obligatoire")
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date dateI;
		@NotNull(message="Renseigner un chiffre")
		private double reduction;
		private Personnes client;
		public String getNomClient() {
			return nomClient;
		}
		public void setNomClient(String nomClient) {
			this.nomClient = nomClient;
		}
		public String getPrenomClient() {
			return prenomClient;
		}
		public void setPrenomClient(String prenomClient) {
			this.prenomClient = prenomClient;
		}
		public Date getDateN() {
			return dateN;
		}
		public void setDateN(Date dateN) {
			this.dateN = dateN;
		}
		public String getAdresseClient() {
			return adresseClient;
		}
		public void setAdresseClient(String adresseClient) {
			this.adresseClient = adresseClient;
		}
		public String getAdresseMailClient() {
			return adresseMailClient;
		}
		public void setAdresseMailClient(String adresseMailClient) {
			this.adresseMailClient = adresseMailClient;
		}
		public String getNumTelClient() {
			return numTelClient;
		}
		public void setNumTelClient(String numTelClient) {
			this.numTelClient = numTelClient;
		}
		public Date getDateI() {
			return dateI;
		}
		public void setDateI(Date dateI) {
			this.dateI = dateI;
		}
		public double getReduction() {
			return reduction;
		}
		public void setReduction(double reduction) {
			this.reduction = reduction;
		}
		public Personnes getClient() {
			return client;
		}
		public void setClient(Personnes client) {
			this.client = client;
		}
		public Long getIdHotel() {
			return idHotel;
		}
		public void setIdHotel(Long idHotel) {
			this.idHotel = idHotel;
		}
		
		
}
