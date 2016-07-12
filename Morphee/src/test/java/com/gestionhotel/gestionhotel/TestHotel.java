package com.gestionhotel.gestionhotel;
/*
 * Projet: Morphee
 * Class: TestHotel
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Employes;
import com.gestionhotel.gestionhotel.entities.Hotel;
import com.gestionhotel.gestionhotel.entities.Personnes;
import com.gestionhotel.gestionhotel.exception.MyException;
import com.gestionhotel.gestionhotel.metier.hotel.IMetierHotel;

public class TestHotel {

	private static IMetierHotel metier;
	private static ClassPathXmlApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier =  (IMetierHotel) context.getBean("serviceHotel");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	/*@Test //ok
	public void testAddHotel() {
		Hotel h1= new Hotel("Ibis", 3, "4 rue des moines", "75 013", "France", "01 77 56 89 63", "01 77 56 89 75", "hotel-ibis@paris.fr");
		metier.addHotel(h1);
		Hotel h2= new Hotel("Ritz", 5, "65 rue de LaFayette", "75 001", "France", "01 95 95 64 03", "01 95 95 64 75", "hotel-ritz@paris.fr");
		metier.addHotel(h2);
		Hotel h3= new Hotel("Campanile", 5, "5 rue des chênes", "33 000", "France", "05 52 65 89 02", "05 52 65 89 03", "hotel-campanile@bordeaux.fr");
		metier.addHotel(h3);
		assertNotNull(h1.getIdHotel());
	}*/

	/*@Test //ok
	public void testGetTabEmploye() throws MyException {
		List<Personnes> tab1= metier.getTabEmploye(1L);
		assertTrue(tab1.size()>0);
	}*/

	/*@Test //ok
	public void testGettabClient() throws MyException {
		List<Personnes> tab1= metier.gettabClient(1L);
		assertTrue(tab1.size()>0);
	}*/

}
