package com.gestionhotel.gestionhotel.metier.personnes;

import java.util.List;
import java.util.logging.Logger;

import com.gestionhotel.gestionhotel.dao.personnes.IDaoPersonnes;
import com.gestionhotel.gestionhotel.entities.Personnes;

/*
 * Projet: Morphee
 * Classe: MétierPeronneImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public class MetierPersonnesImplement implements IMetierPersonne{

	//Attributs
	
	private IDaoPersonnes dao;
	Logger log=Logger.getLogger("MetierPersonnesImplement");
	
	//Set
	
	public void setDao(IDaoPersonnes dao) {
		this.dao = dao;
		log.info("<----------daoPersonne injected-------->");
	}
	
	@Override
	public Personnes addPersonne(Personnes p, Long idHotel) {
		// TODO Auto-generated method stub
		return dao.addPersonne(p, idHotel);
	}

	

	@Override
	public void deletePersonne(Long idPersonne) {
		dao.deletePersonne(idPersonne);
		
	}

	@Override
	public Personnes getPersonne(Long idPersonne) {
		// TODO Auto-generated method stub
		return dao.getPersonne(idPersonne);
	}

	@Override
	public Personnes updatePersonne(Personnes p) {
		// TODO Auto-generated method stub
		return dao.updatePersonne(p);
	}

	@Override
	public List<Personnes> getPersonnes() {
		// TODO Auto-generated method stub
		return dao.getPersonnes();
	}

	@Override
	public List<Personnes> getPersonnesParMc(String mc) {
		// TODO Auto-generated method stub
		return dao.getPersonnesParMc(mc);
	}

}
