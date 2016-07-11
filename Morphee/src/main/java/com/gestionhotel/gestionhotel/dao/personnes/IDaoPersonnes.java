package com.gestionhotel.gestionhotel.dao.personnes;
/*
 * Projet: Morphee
 * Classe: MétierPersonneImplement
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import java.util.List;

import com.gestionhotel.gestionhotel.entities.Personnes;

public interface IDaoPersonnes {
	
	public Personnes addPersonne(Personnes p, Long idHotel);
	public void deletePersonne(Long idPersonne);
	public Personnes getPersonne(Long idPersonne);
	public Personnes updatePersonne(Personnes p);
	public List<Personnes> getPersonnes();
	public List<Personnes> getPersonnesParMc(String mc);

}
