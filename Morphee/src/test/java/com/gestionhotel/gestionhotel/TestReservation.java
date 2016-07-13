package com.gestionhotel.gestionhotel;
/*
 * Projet: Morphee
 * Class: TestReservation
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Reservations;
import com.gestionhotel.gestionhotel.exception.MyException;
import com.gestionhotel.gestionhotel.metier.hotel.IMetierHotel;
import com.gestionhotel.gestionhotel.metier.reservation.IMetierReservation;

public class TestReservation {

	private static IMetierReservation metier;
	private static ClassPathXmlApplicationContext context;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier = (IMetierReservation) context.getBean("serviceReservation");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	/*@Test //ok
	public void testAddReservation() throws ParseException, MyException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date madate1=sdf.parse("03/06/2017");
		Date madate2=sdf.parse("14/06/2017");
		Reservations r1=new Reservations(madate1, madate2);
		metier.addReservation(r1, 1L, 1L, 1L);
		assertNotNull(r1.getIdReservation());
	}*/

	/*@Test //ok
	public void testGetReservations() {
		List<Reservations> tab=metier.getReservations();
		assertTrue(tab.size()>0);
	}*/

/*	@Test //ok
	public void testGetReservation() {
		Reservations r1=metier.getReservation(1L);
		assertNotNull(r1.getIdReservation());
	}*/

	/*@Test //ok
	public void testDeleteReservation() {
		List<Reservations> tab=metier.getReservations();
		metier.deleteReservation(2L);
		List<Reservations> tab2=metier.getReservations();
		assertTrue(tab.size()!=tab2.size());
	}*/

	/*@Test //ok
	public void testUpdateReservation() throws ParseException {
		Reservations r1=metier.getReservation(1L);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date madate1=sdf.parse("15/06/2016");
		r1.setDateSortie(madate1);
		metier.updateReservation(r1);
		Reservations r2=metier.getReservation(1L);
		assertTrue(r1.getDateSortie()!=r2.getDateSortie());
	}*/

/*	@Test //ok 
	public void testCoûtReservation() {
		double cout=metier.coûtReservation(1L);
		assertTrue(cout!=0);
	}*/

	@Test //ok mais vérifier avec consommations
	public void testCoûtReservations() {
		double coût=metier.coûtReservations();
		assertTrue(coût!=0);
	}

	/*@Test
	public void testGetStockProduit() {
		fail("Not yet implemented");
	}*/
	
	/*@Test
	public void testGetReservationClient() {
		List<Reservations> tab= metier.getReservationClient(1L);
		assertTrue(tab.size()>0);
	}*/
}
