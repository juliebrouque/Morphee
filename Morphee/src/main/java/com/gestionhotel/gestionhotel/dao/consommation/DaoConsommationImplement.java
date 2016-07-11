package com.gestionhotel.gestionhotel.dao.consommation;

import java.util.logging.Logger;

import javax.persistence.EntityManager;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Produits;

/**
 * 
 * @author inti0298
 *classe : classe qui définit les méthodes de l'interface consommation
 *version: 1.0.0
 *date: 11/07/2016
 */
public class DaoConsommationImplement implements IDaoConsommation{
Logger log = Logger.getLogger("DaoConsommationImplement");
private EntityManager em;
	@Override
	public Consommation addConsommation(Consommation c) {
		em.persist(c);
		log.info("la consommation" + c.getIdConsommation()+ "a bien été enregistrée");
		return c;
	}

	@Override
	public Consommation addconsommationSachantProduit(Consommation c,
			Long idProduit) {
		Produits p = em.find(Produits.class, idProduit);
		c.setProduit(p);
		em.persist(c);
		log.info("la consommation " + c.getIdConsommation()+ 
				"avec le produit" + p.getIdProduit()+"a bien été enregistrée" );
		return c;
	}

	

}
