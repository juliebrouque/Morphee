package com.gestionhotel.gestionhotel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.loader.custom.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;
import com.gestionhotel.gestionhotel.metier.chambres.IMetierChambres;
import com.gestionhotel.gestionhotel.metier.reservation.IMetierReservation;
import com.gestionhotel.model.ChambreModel;
import com.gestionhotel.model.DeleteChambreModel;
import com.gestionhotel.model.GetChambreDispoModel;
import com.gestionhotel.model.GetChambreId;
import com.gestionhotel.model.SaveChambreModel;
import com.gestionhotel.model.UpdateChambreModel;

@Controller
public class ChambreController {
	@Autowired
private IMetierChambres metierChambres;
	@Autowired
	private IMetierReservation metierReservations;

	@RequestMapping(value="/HomeChambre", method=RequestMethod.GET)
	public String indexChambre(Model model,@ModelAttribute("modelChambre")ChambreModel cm,
			@ModelAttribute("GetChambreDispoModel")GetChambreDispoModel gc){
		model.addAttribute("modelChambre", new ChambreModel());
		List<Chambres> TabChambres=metierChambres.getAllChambres();
        cm.setListeDesChambres(TabChambres);
        List<Chambres>TabChambres1 = metierChambres.getAllChambres();
        gc.setListeDesChambres(TabChambres1);
		return "Chambre";
	}
	
	@RequestMapping(value="/saveChambre", method=RequestMethod.POST)
	public String addChambre(@ModelAttribute("SaveChambreModel")@Valid SaveChambreModel cm,
			BindingResult result) throws MyException{
		if(result.hasErrors()){
			List<Chambres> TabChambres=metierChambres.getAllChambres();
	        cm.setListeDesChambres(TabChambres);
			return "Chambre";
		}	
		Chambres ch = new Chambres(cm.getNumChambre(), 
				cm.getPrixChambre(), cm.getSurfaceChambre(), 
				cm.getEtageChambre(), cm.getNbPieceChambre(), cm.getNbLitChambre());
		try {
			List<Chambres> TabChambres=metierChambres.getAllChambres();
	        cm.setListeDesChambres(TabChambres);
		} catch (Exception e) {
			cm.setSaveChambreException(e.getMessage());
		}
		metierChambres.addChambreSachantHotel(ch, cm.getIdHotel());
		cm.setChambre(ch);
		return "Chambre";
	}
	
@RequestMapping(value="/deleteChambre", method=RequestMethod.POST)
	public  String deleteChambre(@ModelAttribute("DeleteChambreModel")@Valid DeleteChambreModel cm,  
			BindingResult result) throws MyException{
		if (result.hasErrors()) {
			List<Chambres> TabChambres=metierChambres.getAllChambres();
	        cm.setListeDesChambres(TabChambres);
			return "Chambre";
		}
		try {
			List<Chambres> TabChambres=metierChambres.getAllChambres();
	        cm.setListeDesChambres(TabChambres);
		} catch (Exception e2) {
			cm.setDeleteChambreException(e2.getMessage());
		}
		metierChambres.deleteChambre(cm.getIdChambre());
		return "Chambre";
		
	}
		@RequestMapping(value="/updateChambre", method=RequestMethod.POST)
		public String updateChambre(@ModelAttribute("UpdateChambreModel")@Valid UpdateChambreModel cm, 
				BindingResult result){
			if (result.hasErrors()) {
				List<Chambres> TabChambres=metierChambres.getAllChambres();
		        cm.setListeDesChambres(TabChambres);
				return "Chambre";
			}
			Chambres ch = metierChambres.getChambreById(cm.getIdChambre());
			ch.setNumChambre(cm.getNumChambre());
			ch.setPrixChambre(cm.getPrixChambre());
			ch.setSurfaceChambre(cm.getSurfaceChambre());
			ch.setEtageChambre(cm.getEtageChambre());
			ch.setNbPieceChambre(cm.getNbPieceChambre());
			ch.setNbLitChambre(cm.getNbLitChambre());
		     metierChambres.updateChambre(ch);
			return "redirect:getAllChambres";
		}
		@RequestMapping(value="/getAllChambres")
		public String getChambres(@ModelAttribute("modelChambre")@Valid ChambreModel cm, BindingResult result){
			if (result.hasErrors()) {
				return "Chambre";
			}
			List<Chambres> TabChambres=metierChambres.getAllChambres();
	        cm.setListeDesChambres(TabChambres);
			return "Chambre";
		}
		@RequestMapping(value="/getChambresById")
		public String getOneChambre(@ModelAttribute("modelChambre")@Valid ChambreModel cm,
				@ModelAttribute("GetChambreId")@Valid GetChambreId gi,
				BindingResult result){
			if (result.hasErrors()) {
				List<Chambres> TabChambres=metierChambres.getAllChambres();
		        cm.setListeDesChambres(TabChambres);
				return "Chambre";
			}
			List<Chambres> TabChambres=metierChambres.getAllChambres();
	        cm.setListeDesChambres(TabChambres);
			Chambres ch =metierChambres.getChambreById(cm.getIdChambre());
			cm.setChambre(ch);
			return "Chambre";
		}
		@RequestMapping(value="/getChambresDispo", method=RequestMethod.POST)
		public String getChambresLibres(@ModelAttribute("GetChambreDispoModel")@Valid GetChambreDispoModel cm,BindingResult result) throws MyException{
			if (result.hasErrors()) {
				List<Chambres> TabChambres=metierChambres.getAllChambres();
		        cm.setListeDesChambres(TabChambres);
				return "Chambre";
			}
			List<Chambres> TabAllChambres = metierChambres.getAllChambres();
			cm.setListeDesChambres(TabAllChambres);
			List<Reservations> TabReservationParChambre = metierReservations.getReservationChambre(cm.getIdChambre());
			cm.setListeReservationParChambre(TabReservationParChambre);
			List<Chambres>TabChambresDispo = metierChambres.getchambresDisponibles(cm.getDateArrivee(), cm.getDateSortie());
			cm.setListeChambresDispo(TabChambresDispo);
			return "Chambre";
		}
		
}



