package com.gestionhotel.gestionhotel.dao.produit;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Produits;
/**
 * 
 * @author inti0298
 *classe : classe qui décrit les méthodes dao de la classe produits
 *version : 1.0.0
 *date : 11/07/2016
 */
public class DaoProduitsImplement implements IDaoProduits {
Logger log =Logger.getLogger("DaoProduitsImplement");
private EntityManager em;

	@Override
	public Produits addProduit(Produits p) {
		em.persist(p);
		log.info("le produit" + p.getIdProduit()+" "+ "a bien été récupéré");
		return p;
	}

	@Override
	public Produits deleteProduit(Long idProduit) {
		Produits p = em.find(Produits.class, idProduit);
		em.remove(p);
		log.info("le produit" + p.getIdProduit()+" "+ "a bien été supprimé");
		return p;
	}

	@Override
	public Produits updateChambre(Produits p) {
		em.merge(p);
		log.info("le produit" + p.getIdProduit() +" "+ "a bien été modifié");
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produits> getAllProduits() {
		Query query = em.createQuery("Select from Produits p");
		log.info("il existe"+ query.getResultList().size()+"produits");
		return query.getResultList();
	}

	@Override
	public Produits getProduitById(Long idProduit) {
		Produits p = em.find(Produits.class, idProduit);
		log.info("le produit" + p.getIdProduit()+"a bien été récupéré");
		return p;
	}

	

}
