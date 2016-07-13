package com.gestionhotel.gestionhotel;
/*
 * Projet: Morphee
 * Class: TestFactures
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.metier.factures.IMetierFactures;
import com.gestionhotel.gestionhotel.metier.hotel.IMetierHotel;

public class TestFactures {

	private static IMetierFactures metier;
	private static ClassPathXmlApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier =   (IMetierFactures) context.getBean("serviceFacture");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	
	/*@Test //ok
	public void testAddFactures() {
		Factures f1= new Factures(new Date(), 0.05);
		metier.addFactures(f1);
		assertNotNull(f1.getIdFacture());
		
	}*/

	/*@Test //ok
	public void testAddReservationFacture() {
		Factures f1=metier.getFacture(1L);
		List<Reservations> tab1=f1.getTabReservationsFactures();
		metier.addReservationFacture(1L, 1L);
		List<Reservations> tab2=f1.getTabReservationsFactures();
		assertTrue(tab1.size()!=tab2.size());
	}*/

	/*@Test //ok
	public void testGetFactures() {
		List<Factures> tab1= metier.getFactures(1L);
		assertTrue(tab1.size()>0);
	}*/

	/*@Test //ok mais voir avec consommations
	public void testGetCoutAnnuelClient() {
		double cout=metier.getCoutAnnuelClient(2016, 1L);
		assertTrue(cout!=0);
	}*/

/*	@Test //ok mais voir avec consommations
	public void testGetCoutSemestrielClient() throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date madate1=sdf.parse("01/01/2016");
		Date madate2=sdf.parse("30/06/2016");
		double cout=metier.getCoutSemestrielClient(madate1, madate2, 1L);
		assertTrue(cout!=0);
	}*/
	
/*	@Test //ok
	public void testGetFacture() {
		Factures f1=metier.getFacture(2L);
		assertNotNull(f1.getIdFacture());
	}*/

}
