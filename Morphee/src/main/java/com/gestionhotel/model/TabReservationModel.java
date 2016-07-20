package com.gestionhotel.model;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.entities.Reservations;

public class TabReservationModel {

	private List<Produits> tabProduitCons;
	private List<Reservations> tabReservationIndex;

	public List<Produits> getTabProduitCons() {
		return tabProduitCons;
	}

	public void setTabProduitCons(List<Produits> tabProduitCons) {
		this.tabProduitCons = tabProduitCons;
	}

	public List<Reservations> getTabReservationIndex() {
		return tabReservationIndex;
	}

	public void setTabReservationIndex(List<Reservations> tabReservationIndex) {
		this.tabReservationIndex = tabReservationIndex;
	}
	
	
}
