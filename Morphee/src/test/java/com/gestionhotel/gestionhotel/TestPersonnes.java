package com.gestionhotel.gestionhotel;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Client;
import com.gestionhotel.gestionhotel.entities.Contractuels;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.entities.Saisonniers;
import com.gestionhotel.gestionhotel.metier.hotel.IMetierHotel;
import com.gestionhotel.gestionhotel.metier.personnes.IMetierPersonne;

public class TestPersonnes {

	private static IMetierPersonne metier;
	private static ClassPathXmlApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier =   (IMetierPersonne) context.getBean("servicePersonnes");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	/*@Test //ok
	public void testAddPersonne() {
		Personnes p1=new Client("Brouqué", "Julie", new Date(), "2 rue Maurice Berteau", "julie.brouque@live.fr", "06 09 22 39 79", new Date(), 1, 0.2);
		metier.addPersonne(p1, 1L);
		Personnes p2=new Contractuels("Bourdois", "Guirec", new Date(), "2 rue Maurice Bertaux", "bourdois.guirec@adresse.fr", "06 52 32 63 63", new Date(), 2000, 300);
		metier.addPersonne(p2, 2L);
		assertNotNull(p1.getIdPersonnes());
	}*/

	/*@Test //ok
	public void testDeletePersonne() {
		List<Personnes> tab1=metier.getPersonnes();
		metier.deletePersonne(6L);
		List<Personnes> tab2=metier.getPersonnes();
		assertTrue(tab1.size()!=tab2.size());
		
	}*/

	/*@Test //ok
	public void testGetPersonne() {
		Personnes p1=metier.getPersonne(1L);
		assertNotNull(p1.getIdPersonnes());
	}*/

/*	@Test //ok
	public void testUpdatePersonne() {
		Personnes p1=metier.getPersonne(1L);
		p1.setNomPersonne("Madame");
		metier.updatePersonne(p1);
		Personnes p2=metier.getPersonne(1L);
		assertTrue(p1.getNomPersonne()!=p2.getNomPersonne());
	}*/

	/*@Test //ok
	public void testGetPersonnes() {
		List<Personnes> tab=metier.getPersonnes();
		assertTrue(tab.size()>1);
	}*/

	/*@Test //ok
	public void testGetPersonnesParMc() {
		List<Personnes> tab=metier.getPersonnesParMc("Br");
		assertTrue(tab.size()>0);
	}*/

}
