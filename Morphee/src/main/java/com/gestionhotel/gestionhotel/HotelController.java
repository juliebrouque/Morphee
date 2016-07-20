package com.gestionhotel.gestionhotel;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*
 * Projet: Morphee
 * Class: HotelController
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;
import com.gestionhotel.gestionhotel.metier.hotel.IMetierHotel;
import com.gestionhotel.model.HotelModel;

@Controller
public class HotelController {

	@Autowired 
	private IMetierHotel metier;
	
	@RequestMapping(value = "/Hotel")
	public String index(){
		return "Hotel";
	}
	
	@RequestMapping(value="/getHotel", method=RequestMethod.GET)
	public String getHotel(Model model, HotelModel hm, Long idHotel) throws MyException{
		List<Hotel> tab=new ArrayList<Hotel>();
		tab.add(metier.getHotel(hm.getIdHotel()));
		hm.setTabHotel(tab);
		try {
			List<Personnes> tab1=metier.getTabEmployeCdi(hm.getIdHotel());
			hm.setTabEmployeHotelCdi(tab1);;
		} catch (Exception e) {
			hm.setExceptionEmployeCdi(e.getMessage());
		}
		try {
			List<Personnes> tab1=metier.getTabEmployeCdd(hm.getIdHotel());
			hm.setTabEmployeHotelCdd(tab1);
		} catch (Exception e) {
			hm.setExceptionEmployeCdd(e.getMessage());
		}
		try {
			List<Personnes> tab2=metier.gettabClient(hm.getIdHotel());
			hm.setTabClientHotel(tab2);
		} catch (Exception e) {
			hm.setExecptionClient(e.getMessage());
		}
		model.addAttribute("HotelModel", hm);		
		return "Hotel";
	}
	
}
