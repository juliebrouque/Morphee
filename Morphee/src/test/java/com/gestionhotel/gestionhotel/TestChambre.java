package com.gestionhotel.gestionhotel;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Chambres;
import com.gestionhotel.gestionhotel.metier.chambres.IMetierChambres;
/**
 * 
 * @author Zineb LAMRANI
 * classe de Test de l'entité Chambre
 * version 1.0.0
 * date : 12/07/2016
 *
 */
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

	/*@Test
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
	}*/

	/*@Test
	public void testDeleteChambre() {
		Chambres ch = metier.getChambreById(3L);
		metier.deleteChambre(3L);
		assertNotNull(ch.getIdChambre());

	}

	@Test
	public void testUpdateChambre() {
		Chambres ch = metier.getChambreById(2L);
	//ch.getHotel().setIdHotel(2L);
	ch.setPrixChambre(180);
	metier.updateChambre(ch);

	}*/

	/*@Test
	public void testGetAllChambres() {
		List<Chambres>listeAllChambres = metier.getAllChambres();
		for (Chambres chambres : listeAllChambres) {
			System.out.println("il existe" + listeAllChambres.size()+ "chambres");
		}
	}*/

	/*@Test
	public void testGetChambreById() {
		Chambres ch=metier.getChambreById(1L);
		System.out.println("la chambre" +" "+ ch.getIdChambre()+ " "+ "a été récupérée");
		assertNotNull(ch.getIdChambre());
	}*/

	@Test
	public void testGetchambresDisponibles() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date dateArrivee = sdf.parse("01/01/2017");
		Date dateSortie = sdf.parse("15/01/2017");
		List<Chambres>listeChambresDispo = metier.getchambresDisponibles(dateArrivee, dateSortie);
		System.out.println("liste des chambres dispo:" +" "+ listeChambresDispo.size());
	}

}
