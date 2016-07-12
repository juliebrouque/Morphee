package com.gestionhotel.gestionhotel.metier.produit;

import java.util.List;
import com.gestionhotel.gestionhotel.entities.Produits;
/**
 * 
 * @author inti0298
 *classe: interface métier de la classe produit
 * version : 1.0.0
 * date : 11/07/2016
 */
public interface IMetierProduit {
	public Produits	 addProduit(Produits p);
	public Produits deleteProduit (Long idProduit);
	public Produits updateChambre (Produits p);
	public List<Produits> getAllProduits();
	public Produits getProduitById (Long idProduit);

}
