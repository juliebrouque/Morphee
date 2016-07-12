package com.gestionhotel.gestionhotel.dao.produit;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Produits;
/**
 * 
 * @author inti0298
 *classe : interface de la classe produits
 *version:1.0.0
 *date : 11/07/2016
 */
public interface IDaoProduits {
public Produits	 addProduit(Produits p);
public Produits deleteProduit (Long idProduit);
public Produits updateChambre (Produits p);
public List<Produits> getAllProduits();
public Produits getProduitById (Long idProduit);



}
