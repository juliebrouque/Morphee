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
	
	@Test //ok
	public void testAddReservation() throws ParseException, MyException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date madate1=sdf.parse("04/06/2016");
		Date madate2=sdf.parse("10/06/2016");
		Reservations r1=new Reservations(madate1, madate2);
		metier.addReservation(r1, 1L, 1L, 2L);
		assertNotNull(r1.getIdReservation());
	}

	/*@Test
	public void testGetReservations() {
		List<Reservations> tab=metier.getReservations();
		assertTrue(tab.size()>0);
	}*/

	/*@Test
	public void testGetReservation() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteReservation() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateReservation() {
		fail("Not yet implemented");
	}

	@Test
	public void testCoûtReservation() {
		fail("Not yet implemented");
	}

	@Test
	public void testCoûtReservations() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetStockProduit() {
		fail("Not yet implemented");
	}
*/
}
