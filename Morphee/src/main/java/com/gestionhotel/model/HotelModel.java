package com.gestionhotel.model;
/*
 * Projet: Morphee
 * Class: HotelModel
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.List;

import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;

public class HotelModel {

	//Attributs exceptions
	
	private String exceptionEmployeCdi;
	private String exceptionEmployeCdd;
	private String execptionClient;
	
	//Attributs
	
	private List<Hotel> tabHotel;
	private Long idHotel;
	private List<Personnes> tabEmployeHotelCdi;
	private List<Personnes> tabEmployeHotelCdd;
	private List<Personnes> tabClientHotel;
	
	//Get and Set
	
	public List<Hotel> getTabHotel() {
		return tabHotel;
	}
	public void setTabHotel(List<Hotel> tabHotel) {
		this.tabHotel = tabHotel;
	}
	public Long getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}
	public List<Personnes> getTabClientHotel() {
		return tabClientHotel;
	}
	public void setTabClientHotel(List<Personnes> tabClientHotel) {
		this.tabClientHotel = tabClientHotel;
	}
	
	public String getExecptionClient() {
		return execptionClient;
	}
	public void setExecptionClient(String execptionClient) {
		this.execptionClient = execptionClient;
	}
	public String getExceptionEmployeCdi() {
		return exceptionEmployeCdi;
	}
	public void setExceptionEmployeCdi(String exceptionEmployeCdi) {
		this.exceptionEmployeCdi = exceptionEmployeCdi;
	}
	public String getExceptionEmployeCdd() {
		return exceptionEmployeCdd;
	}
	public void setExceptionEmployeCdd(String exceptionEmployeCdd) {
		this.exceptionEmployeCdd = exceptionEmployeCdd;
	}
	public List<Personnes> getTabEmployeHotelCdi() {
		return tabEmployeHotelCdi;
	}
	public void setTabEmployeHotelCdi(List<Personnes> tabEmployeHotelCdi) {
		this.tabEmployeHotelCdi = tabEmployeHotelCdi;
	}
	public List<Personnes> getTabEmployeHotelCdd() {
		return tabEmployeHotelCdd;
	}
	public void setTabEmployeHotelCdd(List<Personnes> tabEmployeHotelCdd) {
		this.tabEmployeHotelCdd = tabEmployeHotelCdd;
	}

}
