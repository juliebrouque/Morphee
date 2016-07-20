package com.gestionhotel.gestionhotel;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;
import com.gestionhotel.gestionhotel.metier.factures.IMetierFactures;
import com.gestionhotel.gestionhotel.metier.personnes.IMetierPersonne;
import com.gestionhotel.gestionhotel.metier.reservation.IMetierReservation;
import com.gestionhotel.model.AddReservationFactureModel;
import com.gestionhotel.model.AfficherFactureByIdModel;
import com.gestionhotel.model.AfficherFactureClientModel;
import com.gestionhotel.model.CoutAnnuelClientModel;
import com.gestionhotel.model.CoutSemestreClientModel;
import com.gestionhotel.model.FactureModel;
import com.gestionhotel.model.PersonnesModel;


@Controller
public class FactureController {

	@Autowired 
	private IMetierFactures metier;
	
	@Autowired
	private IMetierReservation metierRes;
	
	@Autowired
	private IMetierPersonne metierPers;

	@RequestMapping(value = "/indexFactures")
	public String index(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm)  throws MyException{
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "Facture";
	}
	
	@RequestMapping(value="/addFacture", method=RequestMethod.POST)
	public String saveC(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm,
			@ModelAttribute("FactureModel")
	@Valid FactureModel fm, 
	BindingResult result) throws MyException{
		if(result.hasErrors()){
			System.out.println("errors"+result);
			List<Factures> tab=metier.getAllFactures();
			arm.setTabFacturesExist(tab);
			List<Reservations> tab1=metierRes.getReservations();
			arm.setTabReservationExi(tab1);
			List<Personnes> tab2=metierPers.getPersonnesClient();
			arm.setTabPersonnesExi(tab2);
			return "Facture";
		}
		Factures f= new Factures(fm.getDateFacturation(), fm.getTva());
		fm.setFacture(f);
		metier.addFactures(f);
		metier.addReservationFacture(fm.getIdReservation(), f.getIdFacture());
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "redirect:indexFactures";
	}
	
	@RequestMapping(value="/addReservationFacture", method=RequestMethod.POST)
	public String addResFacture(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm,
			@ModelAttribute("AddReservationFactureModel")
	@Valid AddReservationFactureModel fm, 
	BindingResult result) throws MyException{
		if(result.hasErrors()){
			System.out.println("errors"+result);
			List<Factures> tab=metier.getAllFactures();
			arm.setTabFacturesExist(tab);
			List<Reservations> tab1=metierRes.getReservations();
			arm.setTabReservationExi(tab1);
			List<Personnes> tab2=metierPers.getPersonnesClient();
			arm.setTabPersonnesExi(tab2);
			return "Facture";
		}
		metier.addReservationFacture(fm.getIdReservation(), fm.getIdFactures());
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "redirect:indexFactures";
	}
	
	@RequestMapping(value="/getFactureById")
	public String getPersId(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm,
			@ModelAttribute("AfficherFactureByIdModel") @Valid AfficherFactureByIdModel afm, 
			BindingResult result) throws MyException{
		if(result.hasErrors()){
			System.out.println("errors"+result);
			List<Factures> tab=metier.getAllFactures();
			arm.setTabFacturesExist(tab);
			List<Reservations> tab1=metierRes.getReservations();
			arm.setTabReservationExi(tab1);
			List<Personnes> tab2=metierPers.getPersonnesClient();
			arm.setTabPersonnesExi(tab2);
			return "Facture";
		}
		afm.setFacture(metier.getFacture(afm.getIdFacture()));
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "Facture";
	}
	
	@RequestMapping(value="/getFacturesClient")
	public String getfacturClient(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm,
			@ModelAttribute("AfficherFactureClientModel") @Valid AfficherFactureClientModel afcm, 
			BindingResult result) throws MyException{
		if(result.hasErrors()){
			System.out.println("errors"+result);
			List<Factures> tab=metier.getAllFactures();
			arm.setTabFacturesExist(tab);
			List<Reservations> tab1=metierRes.getReservations();
			arm.setTabReservationExi(tab1);
			List<Personnes> tab2=metierPers.getPersonnesClient();
			arm.setTabPersonnesExi(tab2);
			return "Facture";
		}
		List<Factures> tab3=metier.getFactures(afcm.getIdClient());
		afcm.setTabFactureClient(tab3);
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "Facture";
	}
	
	@RequestMapping(value="/getCoutAnnuelClient")
	public String getCoutAnnuelClient(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm,
			@ModelAttribute("CoutAnnuelClientModel") @Valid CoutAnnuelClientModel cacm,
			BindingResult result) throws MyException{
		if(result.hasErrors()){
			System.out.println("errors"+result);
			List<Factures> tab=metier.getAllFactures();
			arm.setTabFacturesExist(tab);
			List<Reservations> tab1=metierRes.getReservations();
			arm.setTabReservationExi(tab1);
			List<Personnes> tab2=metierPers.getPersonnesClient();
			arm.setTabPersonnesExi(tab2);
			return "Facture";
		}
		double cout=metier.getCoutAnnuelClient(cacm.getAnnee(), cacm.getIdClient());
		cacm.setCout(cout);
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "Facture";
	}
	
	@RequestMapping(value="/getCoutSemestreClient")
	public String getCoutSemestreClient(@ModelAttribute("AddReservationFactureModel") AddReservationFactureModel arm,
			@ModelAttribute("CoutSemestreClientModel") @Valid CoutSemestreClientModel cacm,
			BindingResult result) throws MyException{
		if(result.hasErrors()){
			System.out.println("errors"+result);
			List<Factures> tab=metier.getAllFactures();
			arm.setTabFacturesExist(tab);
			List<Reservations> tab1=metierRes.getReservations();
			arm.setTabReservationExi(tab1);
			List<Personnes> tab2=metierPers.getPersonnesClient();
			arm.setTabPersonnesExi(tab2);
			return "Facture";
		}
		double cout=metier.getCoutSemestrielClient(cacm.getDateDebut(), cacm.getDateFin(), cacm.getIdClient());
		cacm.setCoutSemestre(cout);
		List<Factures> tab=metier.getAllFactures();
		arm.setTabFacturesExist(tab);
		List<Reservations> tab1=metierRes.getReservations();
		arm.setTabReservationExi(tab1);
		List<Personnes> tab2=metierPers.getPersonnesClient();
		arm.setTabPersonnesExi(tab2);
		return "Facture";
	}
}
