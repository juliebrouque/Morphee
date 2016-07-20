package com.gestionhotel.gestionhotel;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;
import com.gestionhotel.gestionhotel.metier.produit.IMetierProduit;
import com.gestionhotel.gestionhotel.metier.reservation.IMetierReservation;
import com.gestionhotel.model.AfficherReservatinParChambreModel;
import com.gestionhotel.model.AfficherReservationModel;
import com.gestionhotel.model.AfficherReservationParClientModel;
import com.gestionhotel.model.CouReservationbyIdModel;
import com.gestionhotel.model.PersonnesModel;
import com.gestionhotel.model.ReservationModel;
import com.gestionhotel.model.SupReservationModel;
import com.gestionhotel.model.SupprimerReservationModel;
import com.gestionhotel.model.TabReservationModel;

@Controller
public class ReservationController {

	@Autowired
	private IMetierReservation metier;
	
	@Autowired
	private IMetierProduit metierProd;

	@RequestMapping(value = "/indexReservations")
	public String index(@ModelAttribute("TabReservationModel") TabReservationModel trm) {
		List<Reservations> tab=metier.getReservations();
		trm.setTabReservationIndex(tab);
		List<Produits> tab1=metierProd.getAllProduits();
		trm.setTabProduitCons(tab1);
		return "Reservation";
	}

	@RequestMapping(value = "/addReservation", method = RequestMethod.POST)
	public String addReservation(
			@ModelAttribute("ReservationModel") @Valid ReservationModel rm,
			BindingResult result, Long idClient, Long idChambre) {
		if (result.hasErrors()) {
			System.out.println("errors"+result);
			return "Reservation";
		}
		try {
			Reservations r = new Reservations(rm.getDateArriveeReservation(),
					rm.getDateSortieReservation());
			rm.setReservation(r);
			metier.addReservation(r, rm.getIdClient(), rm.getIdChambre());
		} catch (Exception e) {
			rm.setExceptionReservationDispo(e.getMessage());
			return "Reservation";
		}
		return "redirect:indexReservations";
	}

	@RequestMapping(value = "/getReservations")
	private String getReservations(
			@ModelAttribute("ReservationModel") ReservationModel rm) {
		List<Reservations> tab = metier.getReservations();
		rm.setTabReservationExist(tab);
		return "Reservation";
	}

	@RequestMapping(value = "/getReservationById")
	private String getReservationById(@ModelAttribute("TabReservationModel") TabReservationModel trm,
			@ModelAttribute("AfficherReservationModel") @Valid AfficherReservationModel rm,
			BindingResult result, Long idReservation) {
		if (result.hasErrors()) {
			List<Reservations> tab=metier.getReservations();
			trm.setTabReservationIndex(tab);
			List<Produits> tab1=metierProd.getAllProduits();
			trm.setTabProduitCons(tab1);
			return "Reservation";
		}
		try {
			Reservations r = metier.getReservation(rm.getIdReservation());
			rm.setReservation(r);
		} catch (Exception e) {
			rm.setExceptionReservationById(e.getMessage());
		}
		List<Reservations> tab=metier.getReservations();
		trm.setTabReservationIndex(tab);
		List<Produits> tab1=metierProd.getAllProduits();
		trm.setTabProduitCons(tab1);
		return "Reservation";
	}

	@RequestMapping(value = "/getReservationByClient")
	private String getReservationByClient(@ModelAttribute("TabReservationModel") TabReservationModel trm,
			@ModelAttribute("AfficherReservationParClientModel") @Valid AfficherReservationParClientModel rm,
			BindingResult result, Long idClient) {
		if (result.hasErrors()) {
			List<Reservations> tab=metier.getReservations();
			trm.setTabReservationIndex(tab);
			List<Produits> tab1=metierProd.getAllProduits();
			trm.setTabProduitCons(tab1);
			return "Reservation";
		}
		try {
			List<Reservations> tab = metier.getReservationClient(rm
					.getIdClient());
			rm.setTabReservationClient(tab);
		} catch (Exception e) {
			rm.setExceptionReservationClient(e.getMessage());
		}
		List<Reservations> tab=metier.getReservations();
		trm.setTabReservationIndex(tab);
		List<Produits> tab1=metierProd.getAllProduits();
		trm.setTabProduitCons(tab1);
		return "Reservation";
	}

	@RequestMapping(value = "/getReservationByChambre")
	private String getReservationByChambre(@ModelAttribute("TabReservationModel") TabReservationModel trm,
			@ModelAttribute("AfficherReservatinParChambreModel") @Valid AfficherReservatinParChambreModel rm,
			BindingResult result, Long idChambre) {
		if (result.hasErrors()) {
			List<Reservations> tab=metier.getReservations();
			trm.setTabReservationIndex(tab);
			List<Produits> tab1=metierProd.getAllProduits();
			trm.setTabProduitCons(tab1);
			return "Reservation";
		}
		try {
			List<Reservations> tab = metier.getReservationChambre(rm
					.getIdChambre());
			rm.setTabRerservationChambre(tab);
		} catch (Exception e) {
			rm.setExceptionReservationChambre(e.getMessage());
		}
		List<Reservations> tab=metier.getReservations();
		trm.setTabReservationIndex(tab);
		List<Produits> tab1=metierProd.getAllProduits();
		trm.setTabProduitCons(tab1);
		return "Reservation";
	}

	@RequestMapping(value = "/getcoutReservationById")
	private String getcoutReservationById(@ModelAttribute("TabReservationModel") TabReservationModel trm,
			@ModelAttribute("CouReservationbyIdModel") @Valid CouReservationbyIdModel rm,
			BindingResult result, Long idReservation) {
		if (result.hasErrors()) {
			List<Reservations> tab=metier.getReservations();
			trm.setTabReservationIndex(tab);
			List<Produits> tab1=metierProd.getAllProduits();
			trm.setTabProduitCons(tab1);
			return "Reservation";
		}
		try {
			double cout = metier.coûtReservation(rm.getIdReservation());
			rm.setCoutResById(cout);
		} catch (Exception e) {
			rm.setExceptionReservationCoutId(e.getMessage());
		}
		List<Reservations> tab=metier.getReservations();
		trm.setTabReservationIndex(tab);
		List<Produits> tab1=metierProd.getAllProduits();
		trm.setTabProduitCons(tab1);
		return "Reservation";
	}

	@RequestMapping(value ="/getcoutReservations")
	private String getcoutReservations(
			@ModelAttribute("ReservationModel") ReservationModel rm) {
		double cout = metier.coûtReservations();
		rm.setCoutRes(cout);
		return "Reservation";
	}

	@RequestMapping(value="/deleteReservation")
	public String deletePers(@ModelAttribute("TabReservationModel") TabReservationModel trm,
	@ModelAttribute("SupReservationModel") @Valid SupReservationModel rm,
			BindingResult result){
		if (result.hasErrors()) {
			List<Reservations> tab=metier.getReservations();
			trm.setTabReservationIndex(tab);
			List<Produits> tab1=metierProd.getAllProduits();
			trm.setTabProduitCons(tab1);
			return "Reservation";
		}
		metier.deleteReservation(rm.getIdReservation());;
		return "redirect:indexReservations";
	}
}
