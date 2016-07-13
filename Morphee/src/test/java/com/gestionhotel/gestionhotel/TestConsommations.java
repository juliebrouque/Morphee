package com.gestionhotel.gestionhotel;
/*
 * Projet: Morphee
 * Class: TestConsommations
 * Date: 11/07/2016
 * Version: 1.0.0
 * Author: Julie Brouqué
 */
import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Consommation;
import com.gestionhotel.gestionhotel.metier.consommation.IMetierConsommation;
import com.gestionhotel.gestionhotel.metier.factures.IMetierFactures;

public class TestConsommations {

	private static IMetierConsommation metier;
	private static ClassPathXmlApplicationContext context;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier =    (IMetierConsommation) context.getBean("serviceConsommation");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}
	
	@Test
	public void testAddconsommationSachantProduit() {
		Consommation c1= new Consommation(3);
		metier.addconsommationSachantProduit(c1, 1L, 1L);
		assertNotNull(c1.getIdConsommation());
	}

}
