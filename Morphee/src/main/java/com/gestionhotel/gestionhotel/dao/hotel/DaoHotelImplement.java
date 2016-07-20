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
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Hotel addHotel(Hotel h) {
		em.persist(h);
		log.info("L'hôtel "+h.getNomHotel()+" a bien été enregistré");
		return h;
	}

	@Override
	public List<Personnes> getTabEmployeCdi(Long idHotel) throws MyException {
		Query query= em.createQuery("from Employes e where DTYPE=Contractuels and idHotel=:x");
		query.setParameter("x", idHotel);
		Hotel h=em.find(Hotel.class, idHotel);
		if(query.getResultList().isEmpty()){
			throw new MyException("Aucun employé contractuel ne travail dans cet hotel");
		}
		log.info("Il existe "+query.getResultList().size()+" employés enregistré dans cet hôtel");
		return query.getResultList();
	}

	@Override
	public List<Personnes> gettabClient(Long idHotel) throws MyException {
		Query query= em.createQuery("from Personnes p where DTYPE=Client and idHotel=:x");
		query.setParameter("x", idHotel);
		Hotel h=em.find(Hotel.class, idHotel);
		if(query.getResultList().isEmpty()){
			throw new MyException("Cet hotel ne possède aucun client");
		}
		log.info("Il existe "+query.getResultList().size()+" clients enregistré dans cet hôtel");
		return query.getResultList();
	}

	@Override
	public Hotel getHotel(Long idHotel) {
		Hotel h1=em.find(Hotel.class, idHotel);
		log.info("L'hotel "+h1.getNomHotel()+" a bien été récupéré");
		return h1;
	}

	@Override
	public List<Hotel> getHotels() {
		Query query= em.createQuery("from Hotel");
		log.info("Il existe "+query.getResultList().size()+" hotels");
		return query.getResultList();
	}

	@Override
	public List<Personnes> getTabEmployeCdd(Long idHotel) throws MyException {
		Query query= em.createQuery("from Employes e where DTYPE=Saisonniers and idHotel=:x");
		query.setParameter("x", idHotel);
		Hotel h=em.find(Hotel.class, idHotel);
		if(query.getResultList().isEmpty()){
			throw new MyException("Aucun employé saisonnier ne travail dans cet hotel");
		}
		log.info("Il existe "+query.getResultList().size()+" employés enregistré dans cet hôtel");
		return query.getResultList();
	}

	
}
