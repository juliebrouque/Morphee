package com.gestionhotel.gestionhotel;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.metier.produit.IMetierProduit;
import com.gestionhotel.model.ChambreModel;
import com.gestionhotel.model.DeleteProduiModel;
import com.gestionhotel.model.GetIdProduitModel;
import com.gestionhotel.model.ProduitModel;
import com.gestionhotel.model.SaveProduitModel;
import com.gestionhotel.model.UpdateProduitModel;

@Controller
public class ProduitController {
	@Autowired
	private IMetierProduit metierProduits;

		@RequestMapping(value="/HomeProduit", method=RequestMethod.GET)
		public String indexChambre(Model model, @ModelAttribute("modelProduit")ProduitModel pm,
				@ModelAttribute("GetIdProduitModel")GetIdProduitModel gm,
				@ModelAttribute("UpdateProduitModel")@Valid UpdateProduitModel um){
			List<Produits>tabProduits = metierProduits.getAllProduits();
			pm.setListeDesProduits(tabProduits);
			List<Produits>tabProduits1 = metierProduits.getAllProduits();
			gm.setListeDesProduits(tabProduits1);
			List<Produits> tabProduitsU = metierProduits.getAllProduits();
			um.setListeDesProduits(tabProduitsU);
			model.addAttribute("modelProduit", new ProduitModel());
			return "Produit";
		}
		@RequestMapping(value="/getAllProduits")
		public String getAllProd(@ModelAttribute("modelProduit")ProduitModel pm, BindingResult result ) {
			if (result.hasErrors()) {
				return "Produit";
			}
			List<Produits>tabProduits = metierProduits.getAllProduits();
			pm.setListeDesProduits(tabProduits);
			return "Produit";
			
		}
		@RequestMapping(value="/getProduitById")
		public String getAllProd(@ModelAttribute("GetIdProduitModel")@Valid GetIdProduitModel pm, BindingResult result ) {
			if (result.hasErrors()) {
				List<Produits>tabProduits = metierProduits.getAllProduits();
				pm.setListeDesProduits(tabProduits);
				return "Produit";
			}
			Produits p = metierProduits.getProduitById(pm.getIdProduit());
			pm.setProduit(p);
			return "Produit";
			
		}
		@RequestMapping(value="/saveProduit", method=RequestMethod.POST)
		public String addProduit(@ModelAttribute("SaveProduitModel")@Valid SaveProduitModel sm, BindingResult result){
			if(result.hasErrors()){
				List<Produits>tabProduits = metierProduits.getAllProduits();
				sm.setListeDesProduits(tabProduits);
				return "Produit";
			}	
			Produits p = new Produits(sm.getPrixProduit(), sm.getNomProduit(), sm.getReferenceProduit(), sm.getQuantiteProduit());
			metierProduits.addProduit(p);      
			return "Produit";
		}
		@RequestMapping(value="/deleteProduit", method=RequestMethod.POST)
		public  String deleteChambre(@ModelAttribute("DeleteProduiModel")@Valid DeleteProduiModel pm,  
				BindingResult result){
			if (result.hasErrors()) {
				List<Produits>tabProduits = metierProduits.getAllProduits();
				pm.setListeDesProduits(tabProduits);
				return "Produit";
				
			}
			metierProduits.deleteProduit(pm.getIdProduit());
			return "Produit";
		}
		@RequestMapping(value="/updateProduit", method=RequestMethod.POST)
		public String updateChambre(@ModelAttribute("UpdateProduitModel")@Valid UpdateProduitModel pm, BindingResult result){
			if (result.hasErrors()) {
				List<Produits>tabProduits = metierProduits.getAllProduits();
				pm.setListeDesProduits(tabProduits);
				return "Produit";
			}
			Produits p = metierProduits.getProduitById(pm.getIdProduit());
		p.setNomProduit(pm.getNomProduit());
		p.setPrixProduit(pm.getPrixProduit());
		p.setReferenceProduit(pm.getReferenceProduit());
		p.setQuantiteProduit(pm.getQuantiteProduit());
		metierProduits.updateProduit(p);		
			return "redirect:getAllProduits";
		}
		
}
