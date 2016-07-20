package com.gestionhotel.gestionhotel.metier.personnes;

import java.util.List;

import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;

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
	public List<Personnes> getPersonnesParMc(String mc) throws MyException;
	public List<Personnes> getPersonnesEmployeCdi() throws MyException;
	public List<Personnes> getPersonnesEmployeCdd() throws MyException;
	public List<Personnes> getPersonnesClient() throws MyException;
}
