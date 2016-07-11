package com.gestionhotel.gestionhotel.dao.hotel;
/*
 * Projet: Morphee
 * Interface: DaoHotelImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;

public class DaoHotelImplement implements IDaoHotel{

	Logger log=Logger.getLogger("DaoHotelImplement");
	
	@PersistenceContext //pour instancier l'entityManager
	private EntityManager em;
	
	@Override
	public Hotel addHotel(Hotel h) {
		em.persist(h);
		log.info("L'hôtel "+h.getNomHotel()+" a bien été enregistré");
		return h;
	}

	@Override
	public List<Employes> getTabEmploye(Long idHotel) throws MyException {
		Query query= em.createQuery("from Employe where idHotel=:x");
		query.setParameter("x", idHotel);
		Hotel h=em.find(Hotel.class, idHotel);
		if(h == null){
			throw new MyException("Aucun hôtel n'st attribué à cet identifiant");
		}
			
		log.info("Il existe "+query.getResultList().size()+" employés enregistré dans cet hôtel");
		return query.getResultList();
	}

	@Override
	public List<Client> gettabClient(Long idHotel) throws MyException {
		Query query= em.createQuery("from Client where idHotel=:x");
		query.setParameter("x", idHotel);
		Hotel h=em.find(Hotel.class, idHotel);
		if(h == null){
			throw new MyException("Aucun hôtel n'st attribué à cet identifiant");
		}
		log.info("Il existe "+query.getResultList().size()+" client enregistré dans cet hôtel");
		return query.getResultList();
	}

	
}
