package com.gestionhotel.gestionhotel;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.metier.consommation.IMetierConsommation;
import com.gestionhotel.gestionhotel.metier.factures.IMetierFactures;
import com.gestionhotel.gestionhotel.metier.paiement.IMetierPaiement;
import com.gestionhotel.gestionhotel.metier.reservation.IMetierReservation;
import com.gestionhotel.model.AddPaiementModel;
import com.gestionhotel.model.AddReservationFactureModel;
import com.gestionhotel.model.CoutBenefModel;
import com.gestionhotel.model.FactureModel;
import com.gestionhotel.model.PaiementModel;

/**
 * 
 * @author Zineb LAMRANI
 * classe : controller de la classe paiement
 * version : 1.0.0
 * date : 19/07/2016
 *
 */
@Controller
public class PaiementController {
	@Autowired
	private IMetierPaiement metierPaiement;
	@Autowired 
	private IMetierFactures metier;
	@Autowired
	private IMetierReservation metierRes;
	@Autowired
	private IMetierConsommation metierConso;



	@RequestMapping(value="/HomePaiement", method=RequestMethod.GET)
	public String HomePaiement(Model model,@ModelAttribute("AddPaiementModel") AddPaiementModel ap,
			@ModelAttribute("CoutBenefModel")CoutBenefModel cbm, 
			@ModelAttribute("PaiementModel")PaiementModel pm) {
		List<Factures> tabadd=metier.getAllFactures();
		ap.setTabFacturesExist(tabadd);
		List<Factures>TabFact = metier.getAllFactures();
		pm.setListeDesFactures(TabFact);
		List<Factures> tabCout=metier.getAllFactures();
		cbm.setTabFacturesCoutBenef(tabCout);
		List<Reservations> tab1=metierRes.getReservations();
		cbm.setTabReservationExi(tab1);
		List<Consommation> tab2 = metierConso.getAllConsommation();
		cbm.setTabConsommationProduit(tab2);

		model.addAttribute("modelPaiement", new PaiementModel());
		return "Paiement";
	}
	@RequestMapping(value="/getAllPaiement", method=RequestMethod.GET)
	public String getallPaiements(@ModelAttribute("PaiementModel")PaiementModel pm){
		List<Factures>TabAllFactures = metier.getAllFactures();
		pm.setListeDesFactures(TabAllFactures);
		return "Paiement";
	}

	@RequestMapping(value="/savePaiement", method=RequestMethod.POST)
	public String addPaiement(@ModelAttribute("AddPaiementModel")@Valid AddPaiementModel pm,
			BindingResult result) {
		if (result.hasErrors()) {
			List<Factures> tab=metier.getAllFactures();
			pm.setTabFacturesExist(tab);
			return "Paiement";
		}
		try {
			List<Factures> tab=metier.getAllFactures();
			pm.setTabFacturesExist(tab);	
			Paiements p = new Paiements(pm.getDatePaiement());
			metierPaiement.addPaiements(p, pm.getIdFacture());
		} catch (Exception e) {
			pm.setAddPaiementException(e.getMessage());
			return "Paiement";
		}
		
		return "redirect:HomePaiement";
	}
	@RequestMapping(value="/getCoutBenef", method=RequestMethod.POST)
	public String getCoutBenefAnnuel(@ModelAttribute("CoutBenefModel")@Valid CoutBenefModel cbm,
			BindingResult result ) {
		if (result.hasErrors()) {
			List<Factures> tabCout=metier.getAllFactures();
			cbm.setTabFacturesCoutBenef(tabCout);
			List<Reservations> tab1=metierRes.getReservations();
			cbm.setTabReservationExi(tab1);
			List<Consommation> tab2 = metierConso.getAllConsommation();
			cbm.setTabConsommationProduit(tab2);
			return "Paiement";
		}

		double coutBenef=metierPaiement.calculerBeneficeAnnuel(cbm.getIdConsommation(), cbm.getIdFacture(), cbm.getAnnee(), cbm.getIdReservation());
		cbm.setCoutBenefAnnuel(coutBenef);
		return "Paiement";
	}
}
