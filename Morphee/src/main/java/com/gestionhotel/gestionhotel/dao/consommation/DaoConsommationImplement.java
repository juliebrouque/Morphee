package com.gestionhotel.gestionhotel.dao.consommation;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.entities.Reservations;

/**
 * 
 * @author inti0298
 *classe : classe qui définit les méthodes de l'interface consommation
 *version: 1.0.0
 *date: 11/07/2016
 */
public class DaoConsommationImplement implements IDaoConsommation{
Logger log = Logger.getLogger("DaoConsommationImplement");
    
   @PersistenceContext
	private EntityManager em;

	@Override
	public Consommation addconsommationSachantProduit(Consommation c,
			Long idProduit, Long idReservation) {
		Produits p = em.find(Produits.class, idProduit);
		c.setProduit(p);
		
		Integer quantite=c.getProduit().getQuantiteProduit();
		Reservations r=em.find(Reservations.class, idReservation);
		c.setReservation(r);
		r.getTabConsommationreservation().add(c);
		quantite=quantite-c.getQuantiteConsomee();
		c.getProduit().setQuantiteProduit(quantite);
		em.merge(c.getProduit());
		em.persist(c);		
		log.info("la consommation " + c.getIdConsommation()+ 
				"avec le produit" + p.getIdProduit()+"a bien été enregistrée pour la réservation "+r.getIdReservation() );
		return c;
	}
	@SuppressWarnings("unchecked")
	public List<Consommation> getAllConsommation() {
		Query query = em.createQuery("from Consommation ");
		log.info("il existe" + query.getResultList().size()+"consommation");
		return query.getResultList();	
		
		
	}
}
