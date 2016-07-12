package com.gestionhotel.gestionhotel;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.metier.chambres.IMetierChambres;
import com.gestionhotel.gestionhotel.metier.hotel.IMetierHotel;

public class TestChambre {
	private static IMetierChambres metier;
	private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier = (IMetierChambres) context.getBean("serviceChambres");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddChambreSachantHotel() {
		Chambres ch1 = new Chambres(18, 45, 30, 1, 1, 1);
		metier.addChambreSachantHotel(ch1, 1L);
		Chambres ch2 = new Chambres(45, 35, 25, 7, 1, 2);
		metier.addChambreSachantHotel(ch2, 1L);
		Chambres ch3 = new Chambres(112, 28, 15, 3, 2, 2);
		metier.addChambreSachantHotel(ch3, 1L);
		Chambres ch4 = new Chambres(108, 15, 21, 4, 2, 1);
		metier.addChambreSachantHotel(ch4, 2L);
		Chambres ch5 = new Chambres(77, 56, 25, 6, 2, 1);
		metier.addChambreSachantHotel(ch5, 3L);
		assertNotNull(ch1.getIdChambre());
		assertNotNull(ch2.getIdChambre());
		assertNotNull(ch3.getIdChambre());
		assertNotNull(ch4.getIdChambre());
		assertNotNull(ch5.getIdChambre());
	}

	/*@Test
	public void testDeleteChambre() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateChambre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllChambres() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetChambreById() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetchambresDisponibles() {
		fail("Not yet implemented");
	}*/

}
