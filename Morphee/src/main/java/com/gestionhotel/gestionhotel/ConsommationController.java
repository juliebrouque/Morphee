package com.gestionhotel.gestionhotel;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.metier.consommation.IMetierConsommation;
import com.gestionhotel.gestionhotel.metier.produit.IMetierProduit;
import com.gestionhotel.gestionhotel.metier.reservation.IMetierReservation;
import com.gestionhotel.model.ConsommationModel;
import com.gestionhotel.model.ReservationModel;
import com.gestionhotel.model.TabReservationModel;

@Controller
public class ConsommationController {

	@Autowired
	private IMetierConsommation metier;
	
	@Autowired
	private IMetierReservation metierRes;
	
	@Autowired
	private IMetierProduit metierProd;
	
	@RequestMapping(value = "/addConsommationReservation", method = RequestMethod.POST)
	public String addConsommation(@ModelAttribute("TabReservationModel") TabReservationModel trm,
			@ModelAttribute("ConsommationModel") @Valid ConsommationModel cm,
			BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("errors"+result);
			List<Reservations> tab=metierRes.getReservations();
			trm.setTabReservationIndex(tab);
			List<Produits> tab1=metierProd.getAllProduits();
			trm.setTabProduitCons(tab1);
			return "Reservation";
		}
		Consommation s=new Consommation(cm.getQuantiteConsomee());
		cm.setConso(s);
		metier.addconsommationSachantProduit(s, cm.getIdProduit(), cm.getIdReservation());
		List<Reservations> tab=metierRes.getReservations();
		trm.setTabReservationIndex(tab);
		List<Produits> tab1=metierProd.getAllProduits();
		trm.setTabProduitCons(tab1);
		return "redirect:indexReservations";
	}
}
