package com.gestionhotel.model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Personnes;

/*
 * Projet: Morphee
 * Class: HotelModel
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public class PersonnesModel {
	
	private Long idPersonnes;
	private Personnes personne;
	private String nomPersonne;
	private String prenomPersonne;
	private Date dateDeNaissance;
	private String adressePersonne;
	private String adresseMailPersonne;
	private String numTelPersonne;
	private String motClePersonne;
	
	//Attributs exceptions
	private String execptionPersonneMotCle;
	private String exceptionClientPers;
	private String execptionEmpPersCdd;
	private String exceptionEmpPersCdi;
	
	//Attributs Clients
	
	@NotEmpty(message="Le nom est obligatoire")
	private String nomClient;
	@NotEmpty(message="Le prénom est obligatoire")
	private String prenomClient;
	@NotNull(message="La date de naissance est obligatoire")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateN;
	@NotEmpty(message="L' adresse est obligatoire")
	private String adresseClient;
	@NotEmpty(message="L'adresse mail est obligatoire")
	private String adresseMailClient;
	@NotEmpty(message="Le numéro de téléphone est obligatoire")
	private String numTelClient;
	@NotNull(message="La date dinscription est obligatoire")
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateI;
	@NotNull(message="Renseigner un chiffre")
	private double reduction;
	private Personnes client;
	
	//Attributs Employé
	
	@NotEmpty(message="Le nom est obligatoire")
	private String nomEmploye;
	@NotEmpty(message="Le prénom est obligatoire")
	private String prenomEmploye;
	@NotNull(message="La date de naissance est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateNE;
	@NotEmpty(message="L' adresse est obligatoire")
	private String adresseEmploye;
	@NotEmpty(message="L'adresse mail est obligatoire")
	private String adresseMailEmploye;
	@NotEmpty(message="Le numéro de téléphone est obligatoire")
	private String numTelEmploye;
	@NotNull(message="La date d' entrée est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateE;
	@NotNull(message="Le salaire est obligatoire")
	private double salaire;
	@NotNull(message="Entrez une valeur")
	private double prime;
	@NotNull(message="La date de sortie est obligatoire")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateS;
	private Personnes contactuel;
	private Personnes saisonnier;
	
	//Attribiuts Hotel
	
	@NotNull(message="L' identifiant de l'hotel doit être renseigné")
	private Long idHotel;
	
	//Attributs listes
	
	private List<Personnes> tabPersonne;
	private List<Personnes> tabPersonneEmployeCdd;
	private List<Personnes> tabPersonneEmployeCdi;
	private List<Personnes> tabPersonneClient;
	 
	
	//Get and Set
	
	
	
	public String getNomClient() {
		return nomClient;
	}
	public Long getIdPersonnes() {
		return idPersonnes;
	}
	public void setIdPersonnes(Long idPersonnes) {
		this.idPersonnes = idPersonnes;
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
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getPrenomEmploye() {
		return prenomEmploye;
	}
	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}
	public Date getDateNE() {
		return dateNE;
	}
	public void setDateNE(Date dateNE) {
		this.dateNE = dateNE;
	}
	public String getAdresseEmploye() {
		return adresseEmploye;
	}
	public void setAdresseEmploye(String adresseEmploye) {
		this.adresseEmploye = adresseEmploye;
	}
	public String getAdresseMailEmploye() {
		return adresseMailEmploye;
	}
	public void setAdresseMailEmploye(String adresseMailEmploye) {
		this.adresseMailEmploye = adresseMailEmploye;
	}
	public String getNumTelEmploye() {
		return numTelEmploye;
	}
	public void setNumTelEmploye(String numTelEmploye) {
		this.numTelEmploye = numTelEmploye;
	}
	public Date getDateE() {
		return dateE;
	}
	public void setDateE(Date dateE) {
		this.dateE = dateE;
	}
	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public double getPrime() {
		return prime;
	}
	public void setPrime(double prime) {
		this.prime = prime;
	}
	public Personnes getContactuel() {
		return contactuel;
	}
	public void setContactuel(Personnes contactuel) {
		this.contactuel = contactuel;
	}
	public Date getDateS() {
		return dateS;
	}
	public void setDateS(Date dateS) {
		this.dateS = dateS;
	}
	public Personnes getSaisonnier() {
		return saisonnier;
	}
	public void setSaisonnier(Personnes saisonnier) {
		this.saisonnier = saisonnier;
	}
	public List<Personnes> getTabPersonne() {
		return tabPersonne;
	}
	public void setTabPersonne(List<Personnes> tabPersonne) {
		this.tabPersonne = tabPersonne;
	}
	public Personnes getPersonne() {
		return personne;
	}
	public void setPersonne(Personnes personne) {
		this.personne = personne;
	}
	public String getNomPersonne() {
		return nomPersonne;
	}
	public void setNomPersonne(String nomPersonne) {
		this.nomPersonne = nomPersonne;
	}
	public String getPrenomPersonne() {
		return prenomPersonne;
	}
	public void setPrenomPersonne(String prenomPersonne) {
		this.prenomPersonne = prenomPersonne;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public String getAdressePersonne() {
		return adressePersonne;
	}
	public void setAdressePersonne(String adressePersonne) {
		this.adressePersonne = adressePersonne;
	}
	public String getAdresseMailPersonne() {
		return adresseMailPersonne;
	}
	public void setAdresseMailPersonne(String adresseMailPersonne) {
		this.adresseMailPersonne = adresseMailPersonne;
	}
	public String getNumTelPersonne() {
		return numTelPersonne;
	}
	public void setNumTelPersonne(String numTelPersonne) {
		this.numTelPersonne = numTelPersonne;
	}
	public String getMotClePersonne() {
		return motClePersonne;
	}
	public void setMotClePersonne(String motClePersonne) {
		this.motClePersonne = motClePersonne;
	}
	public String getExecptionPersonneMotCle() {
		return execptionPersonneMotCle;
	}
	public void setExecptionPersonneMotCle(String execptionPersonneMotCle) {
		this.execptionPersonneMotCle = execptionPersonneMotCle;
	}
	
	public List<Personnes> getTabPersonneClient() {
		return tabPersonneClient;
	}
	public void setTabPersonneClient(List<Personnes> tabPersonneClient) {
		this.tabPersonneClient = tabPersonneClient;
	}
	public List<Personnes> getTabPersonneEmployeCdd() {
		return tabPersonneEmployeCdd;
	}
	public void setTabPersonneEmployeCdd(List<Personnes> tabPersonneEmployeCdd) {
		this.tabPersonneEmployeCdd = tabPersonneEmployeCdd;
	}
	public List<Personnes> getTabPersonneEmployeCdi() {
		return tabPersonneEmployeCdi;
	}
	public void setTabPersonneEmployeCdi(List<Personnes> tabPersonneEmployeCdi) {
		this.tabPersonneEmployeCdi = tabPersonneEmployeCdi;
	}
	public String getExceptionClientPers() {
		return exceptionClientPers;
	}
	public void setExceptionClientPers(String exceptionClientPers) {
		this.exceptionClientPers = exceptionClientPers;
	}
	public String getExecptionEmpPersCdd() {
		return execptionEmpPersCdd;
	}
	public void setExecptionEmpPersCdd(String execptionEmpPersCdd) {
		this.execptionEmpPersCdd = execptionEmpPersCdd;
	}
	public String getExceptionEmpPersCdi() {
		return exceptionEmpPersCdi;
	}
	public void setExceptionEmpPersCdi(String exceptionEmpPersCdi) {
		this.exceptionEmpPersCdi = exceptionEmpPersCdi;
	}
}
