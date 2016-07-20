package com.gestionhotel.gestionhotel;
/*
 * Projet: Morphee
 * Class: PersonnesController
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;






import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Contractuels;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Saisonniers;
import com.gestionhotel.gestionhotel.metier.personnes.IMetierPersonne;
import com.gestionhotel.model.AjouterClientModel;
import com.gestionhotel.model.AjouterContractuelModel;
import com.gestionhotel.model.AjouterSaisonnierModel;
import com.gestionhotel.model.PersonnesModel;


@Controller
public class PersonnesController {
	
	@Autowired
	private IMetierPersonne metier;
	
	@RequestMapping(value = "/indexPersonnes")
	public String index(@ModelAttribute("PersonnesModel") PersonnesModel pm){
		List<Personnes> tab=metier.getPersonnes();
		pm.setTabPersonne(tab);
		return "Personnes";
	}
	
	@RequestMapping(value = "/AjouterClient")
	public String indexC(){
		return "AjouterClient";
	}
	
	@RequestMapping(value = "/AjouterEmployer")
	public String indexE(){
		return "AjouterEmployer";
	}
	
	@RequestMapping(value = "/AfficherClient")
	public String indexAC(@ModelAttribute("PersonnesModel") PersonnesModel pm){
		try {
			List<Personnes> tab=metier.getPersonnesClient();
		pm.setTabPersonneClient(tab);
		} catch (Exception e) {
			pm.setExceptionClientPers(e.getMessage());
		}
		
		return "AfficherClient";
	}
	@RequestMapping(value = "/AfficherEmploye")
	public String indexAE(@ModelAttribute("PersonnesModel") PersonnesModel pm){
		try {
			List<Personnes> tab=metier.getPersonnesEmployeCdd();
		pm.setTabPersonneEmployeCdd(tab);
		} catch (Exception e) {
			pm.setExecptionEmpPersCdd(e.getMessage());
		}
		try {
			List<Personnes> tab1=metier.getPersonnesEmployeCdi();
			pm.setTabPersonneEmployeCdi(tab1);
		} catch (Exception e) {
			pm.setExceptionEmpPersCdi(e.getMessage());
		}
		return "AfficherEmploye";
	}
	
	@RequestMapping(value="/addClient", method=RequestMethod.POST)
	public String saveC(@ModelAttribute("AjouterClientModel")
	@Valid AjouterClientModel acm, 
	BindingResult result){
		if(result.hasErrors()){
			System.out.println("errors"+result);
			return "AjouterClient";
		}
		Personnes e = new Client(acm.getNomClient(), acm.getPrenomClient(), acm.getDateN(), acm.getAdresseClient(), acm.getAdresseMailClient(), acm.getNumTelClient(), acm.getDateI(), 0, acm.getReduction());
		acm.setClient(e);
		metier.addPersonne(e, acm.getIdHotel());
		return "redirect:indexPersonnes";

	}
	
	@RequestMapping(value="/addEmployeContractuel", method=RequestMethod.POST)
	public String saveEC(@ModelAttribute("AjouterContractuelModel")
	@Valid AjouterContractuelModel pm, 
	BindingResult result){
		if(result.hasErrors()){
			System.out.println("errors"+result);
			return "AjouterEmployer";
		}
		Personnes e = new Contractuels(pm.getNomEmploye(), pm.getPrenomEmploye(), pm.getDateNE(), pm.getAdresseEmploye(), pm.getAdresseMailEmploye(), pm.getNumTelEmploye(), pm.getDateE(), pm.getSalaire(), pm.getPrime());
		pm.setContactuel(e);;
		metier.addPersonne(e, pm.getIdHotel());
		return "redirect:indexPersonnes";

	}
	
	@RequestMapping(value="/addEmployeSaisonnier", method=RequestMethod.POST)
	public String saveES(@ModelAttribute("AjouterSaisonnierModel")
	@Valid AjouterSaisonnierModel pm, 
	BindingResult result){
		if(result.hasErrors()){
			return "AjouterEmployer";
		}
		Personnes e = new Saisonniers(pm.getNomEmploye(), pm.getPrenomEmploye(), pm.getDateNE(), pm.getAdresseEmploye(), pm.getAdresseMailEmploye(), pm.getNumTelEmploye(), pm.getDateE(), pm.getSalaire(), pm.getDateS());
		pm.setSaisonnier(e);
		metier.addPersonne(e, pm.getIdHotel());
		return "redirect:indexPersonnes";

	}
	
			
	@RequestMapping(value="/deletePersonne")
	public String deletePers(@ModelAttribute("PersonnesModel") PersonnesModel pm, Long idPersonnne){
		metier.deletePersonne(pm.getIdPersonnes());
		return "redirect:indexPersonnes";
	}
	
	@RequestMapping(value="/getPersonneById")
	public String getPersId(@ModelAttribute("PersonnesModel") PersonnesModel pm, Long idPersonnne){
		pm.setPersonne(metier.getPersonne(pm.getIdPersonnes()));
		Personnes p=pm.getPersonne();
		pm.setIdPersonnes(p.getIdPersonnes());
		pm.setPrenomPersonne(p.getPrenomPersonne());
		pm.setNomPersonne(p.getNomPersonne());
		pm.setDateDeNaissance(p.getDateDeNaissance());
		pm.setAdressePersonne(p.getAdressePersonne());
		pm.setAdresseMailPersonne(p.getAdresseMailPersonne());
		pm.setNumTelPersonne(p.getNumTelPersonnne());
		List<Personnes> tab=metier.getPersonnes();
		pm.setTabPersonne(tab);
		return "Personnes";
	}
	
	@RequestMapping(value="/updatePersonne")
	public String updatePers(@ModelAttribute("PersonnesModel") PersonnesModel pm, Long idPersonnne){
		Personnes p=metier.getPersonne(pm.getIdPersonnes());
		p.setNomPersonne(pm.getNomPersonne());
		p.setPrenomPersonne(pm.getPrenomPersonne());
		p.setDateDeNaissance(pm.getDateDeNaissance());
		p.setAdressePersonne(pm.getAdressePersonne());
		p.setAdresseMailPersonne(pm.getAdresseMailPersonne());
		p.setNumTelPersonnne(pm.getNumTelPersonne());
		metier.updatePersonne(p);
		pm.setPersonne(p);
		return "redirect:indexPersonnes";
	}
	
	@RequestMapping(value="/getPersonneByMc")
	public String getPersByMc(@ModelAttribute("PersonnesModel") PersonnesModel pm, String motCle){
		try {
			List<Personnes> tab=metier.getPersonnesParMc(pm.getMotClePersonne());
			pm.setTabPersonne(tab);
		} catch (Exception e) {
			pm.setExecptionPersonneMotCle(e.getMessage());
		}
		return "Personnes";
	}
}
