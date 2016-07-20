package com.gestionhotel.gestionhotel.dao.personnes;
/*
 * Projet: Morphee
 * Classe: DaoPersonneImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;

public class DaoPersonnesImplement implements IDaoPersonnes{
	
	Logger log=Logger.getLogger("DaoPersonnesImplement");
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Personnes addPersonne(Personnes p, Long idHotel) {
		Hotel h=em.find(Hotel.class,idHotel);
		p.setHotelPersonne(h);
		em.persist(p);
		log.info("La personne "+p.getNomPersonne()+" a bien été enregistrée");
		return p;
	}

	@Override
	public void deletePersonne(Long idPersonne) {
		Personnes p=em.find(Personnes.class, idPersonne);
		em.remove(p);
		log.info("La personne "+p.getNomPersonne()+" a bien été supprimée");
		
	}

	@Override
	public Personnes getPersonne(Long idPersonne) {
		Personnes p=em.find(Personnes.class, idPersonne);
		log.info("La personne "+p.getNomPersonne()+" a bien été récupérée");
		return p;
	}

	@Override
	public Personnes updatePersonne(Personnes p) {
		em.merge(p);
		log.info("La personne "+p.getNomPersonne()+" a bien été modifiée");
		return null;
	}

	@Override
	public List<Personnes> getPersonnes() {
		Query query= em.createQuery("from Personnes");
		log.info("Il existe "+query.getResultList().size()+" personnes");
		return query.getResultList();
	}

	@Override
	public List<Personnes> getPersonnesParMc(String mc) throws MyException {
		Query query= em.createQuery("from Personnes p where p.nomPersonne like:x or p.prenomPersonne like:x");
		query.setParameter("x", "%"+mc+"%");
		if(query.getResultList().isEmpty()){
			throw new MyException("Aucune personne n'a été trouvée à partir de ce mot clé");
		}
		log.info("Il existe "+query.getResultList().size()+" personnes trouvées à partir de ce mot clé");
		return query.getResultList();
	}

	@Override
	public List<Personnes> getPersonnesClient() throws MyException {
		Query query= em.createQuery("from Personnes where DTYPE=Client");
		if(query.getResultList().isEmpty()){
			throw new MyException("Il n'existe aucun client");
		}
		log.info("Il existe "+query.getResultList().size()+" personnes");
		return query.getResultList();
	}

	@Override
	public List<Personnes> getPersonnesEmployeCdi() throws MyException {
		Query query= em.createQuery("from Employes where DTYPE=Contractuels");
		if(query.getResultList().isEmpty()){
			throw new MyException("Il n'existe aucun employé en CDI");
		}
		log.info("Il existe "+query.getResultList().size()+" personnes");
		return query.getResultList();
	}

	@Override
	public List<Personnes> getPersonnesEmployeCdd() throws MyException {
		Query query= em.createQuery("from Employes where DTYPE=Saisonniers");
		if(query.getResultList().isEmpty()){
			throw new MyException("Il n'existe aucun employé en CDD");
		}
		log.info("Il existe "+query.getResultList().size()+" personnes");
		return query.getResultList();
	} 

}
