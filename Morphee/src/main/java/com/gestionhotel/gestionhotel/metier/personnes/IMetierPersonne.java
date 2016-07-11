package com.gestionhotel.gestionhotel.metier.personnes;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Personnes;

/*
 * Projet: Morphee
 * Interface: IMétierPersonnes
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
public interface IMetierPersonne {

	public Personnes addPersonne(Personnes p, Long idHotel);
	public void deletePersonne(Long idPersonne);
	public Personnes getPersonne(Long idPersonne);
	public Personnes updatePersonne(Personnes p);
	public List<Personnes> getPersonnes();
	public List<Personnes> getPersonnesParMc(String mc);
}
