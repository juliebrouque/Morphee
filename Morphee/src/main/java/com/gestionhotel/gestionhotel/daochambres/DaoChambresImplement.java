package com.gestionhotel.gestionhotel.daochambres;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import javax.persistence.Query;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;

/**
 * 
 * @author Zineb
 *Classe : classe qui définit les méthodes de dao de l'interface chambre
 *version:1.0.0
*date: 11/07/2016
 */
public class DaoChambresImplement implements IDaoChambres {
	
	Logger log = Logger.getLogger("DaoChambresImplement");
	
	@PersistenceContext
	private EntityManager em;


	@Override
	public Chambres addChambreSachantHotel(Chambres ch, Long idHotel) {
		Hotel h = em.find(Hotel.class, idHotel);
		ch.setHotel(h);
		em.persist(ch);
		log.info("la chambre numéro:"+" "+ ch.getNumChambre()+"a bien été enregistrée");
		return ch;
		
	}

	@Override
	public Chambres deleteChambre(Long idChambre) {
		Chambres ch=em.find(Chambres.class, idChambre);
		em.remove(ch);
		log.info("la chambre numéro:"+" "+ ch.getNumChambre()+"a bien été supprimée");
		return ch;

	}

	@Override
	public Chambres updateChambre(Chambres ch) {
		em.merge(ch);
		log.info("la chambre numéro:"+" "+ ch.getNumChambre()+"a bien été modifiée");
		return ch;

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chambres> getAllChambres() {
		Query query = em.createQuery("from Chambres ");
		log.info("il existe" + query.getResultList().size()+"chambres");
		return query.getResultList();
	}

	@Override
	public Chambres getChambreById(Long idChambre) {
		Chambres ch= em.find(Chambres.class, idChambre);
		log.info("la chambre" + ch.getNumChambre()+" "+ "a bien été récupérée");
		return ch;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Chambres> getchambresDisponibles(Date dateArrivee, Date dateSortie) {
		List<Chambres>listeChambresDispo = new ArrayList<Chambres>();
		List<Chambres> listeDesChambres =getAllChambres();
		for (Chambres chambres : listeDesChambres) {
			List<Reservations>listereservationParChambre=chambres.getTabReservationChambre();
			if(listereservationParChambre.isEmpty()){
				listeChambresDispo.add(chambres);
			}else{
			for (Reservations reservations : listereservationParChambre) {
				if((reservations.getDateArrivee().before(dateArrivee) && reservations.getDateSortie().after(dateSortie)) 
						|| (reservations.getDateArrivee().before(dateArrivee) && reservations.getDateSortie().after(dateSortie))){
             	;
		}else if(listeChambresDispo.contains(chambres.getIdChambre())){
			
			}else{
				listeChambresDispo.add(chambres);
			}
	}
			}
			}
				
		return listeChambresDispo;
	}
		
}
