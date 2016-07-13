package com.gestionhotel.gestionhotel;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Produits;
import com.gestionhotel.gestionhotel.metier.produit.IMetierProduit;
/**
 * 
 * @author Zineb LAMRANI
 * classe : classe de test Junit de la classe produits
 * version 1.0.0
 * date : 13/07/2016
 *
 */
public class TestProduit {
	private static IMetierProduit metier;
	private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new ClassPathXmlApplicationContext("app.xml");
		metier = (IMetierProduit) context.getBean("serviceProduit");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	@Test
	public void testAddProduit() {
		Produits p = new Produits(15, "repasChaud", "1245588", 3);
		metier.addProduit(p);
		assertNotNull(p);
	}

	/*@Test
	public void testDeleteProduit() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateChambre() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllProduits() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProduitById() {
		fail("Not yet implemented");
	}*/

}
