package com.gestionhotel.gestionhotel.dao.personnes;

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
