package com.gestionhotel.gestionhotel;

import static org.junit.Assert.*;

import java.util.List;

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
//test validé
	/*@Test
	public void testAddProduit() {
		Produits p = new Produits(9, "eau", "154889", 4);
		metier.addProduit(p);
		assertNotNull(p);
	}*/
//test validé
	/*@Test
	public void testDeleteProduit() {
		Produits p = metier.getProduitById(2L);
		metier.deleteProduit(2L);
		System.out.println("le produit"+ " "+ p.getNomProduit()+"a été supprimé");
	}*/

	/*@Test
	public void testUpdateChambre() {
		Produits p = metier.getProduitById(1L);
		p.setPrixProduit(35);
		p.setQuantiteProduit(10);
		metier.updateChambre(p);
		System.out.println("le produit"+ " "+ p.getNomProduit()+ " a bien été modofié");
	}*/

	/*@Test
	public void testGetAllProduits() {
		List<Produits>listeAllProduists = metier.getAllProduits();
		System.out.println("il existe"+" "+ listeAllProduists.size()+"produits");
	}*/

	/*@Test
	public void testGetProduitById() {
		Produits p = metier.getProduitById(1L);
		System.out.println("le produit"+ " "+ p.getNomProduit()+" "+"a bien été récupéré");
	}*/

}
