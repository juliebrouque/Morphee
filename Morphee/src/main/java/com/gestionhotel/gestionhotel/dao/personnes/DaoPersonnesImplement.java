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

public class DaoPersonnesImplement implements IDaoPersonnes{
	
	Logger log=Logger.getLogger("DaoPersonnesImplement");
	
	@PersistenceContext //pour instancier l'entityManager
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
		Query query= em.createQuery("from Personne");
		log.info("Il existe "+query.getResultList().size()+" personnes");
		return query.getResultList();
	}

	@Override
	public List<Personnes> getPersonnesParMc(String mc) {
		Query query= em.createQuery("from Personne p where p.nomPersonne like:x");
		query.setParameter("x", "%"+mc+"%");
		log.info("Il existe "+query.getResultList().size()+" personnes trouvées à partir de ce mot clé");
		return query.getResultList();
	}

}
