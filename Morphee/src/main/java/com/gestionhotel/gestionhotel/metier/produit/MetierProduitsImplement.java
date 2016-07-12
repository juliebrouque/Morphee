package com.gestionhotel.gestionhotel.metier.produit;

import java.util.List;
import java.util.logging.Logger;

import com.gestionhotel.gestionhotel.dao.produit.IDaoProduits;
import com.gestionhotel.gestionhotel.entities.Produits;
/**
 * 
 * @author inti0298
 *classe : classe qui définit les méthodes de l'interface métier de la classe produit
 *version : 1.0.0
 *date: 11/07/2016
 */
public class MetierProduitsImplement implements IMetierProduit {
	private IDaoProduits dao;
	Logger log=Logger.getLogger("MetierProduitsImplement");
	
	

	public void setDao(IDaoProduits dao) {
		log.info("--------DaoProduits injected------------------");
		this.dao = dao;
	}

	@Override
	public Produits addProduit(Produits p) {
		return dao.addProduit(p);
	}

	@Override
	public Produits deleteProduit(Long idProduit) {
		return dao.deleteProduit(idProduit);
	}

	@Override
	public Produits updateChambre(Produits p) {
		return dao.updateChambre(p);
	}

	@Override
	public List<Produits> getAllProduits() {
		return dao.getAllProduits();
	}

	@Override
	public Produits getProduitById(Long idProduit) {
		return dao.getProduitById(idProduit);
	}

}
