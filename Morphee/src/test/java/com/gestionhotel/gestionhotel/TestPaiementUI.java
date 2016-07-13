package com.gestionhotel.gestionhotel;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gestionhotel.gestionhotel.entities.Factures;
import com.gestionhotel.gestionhotel.entities.Paiements;
import com.gestionhotel.gestionhotel.metier.paiement.IMetierPaiement;

public class TestPaiementUI {
	
private static IMetierPaiement metier;
private static ClassPathXmlApplicationContext context;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context=new ClassPathXmlApplicationContext("app.xml");
		metier= (IMetierPaiement) context.getBean("servicePaiement");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.close();
	}

	/*@Test
	public void testAddPaiements() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date datePaiement = sdf.parse("15/07/2016");
		Paiements p = new Paiements(datePaiement);
		metier.addPaiements(p);
		System.out.println("le paiemement" + " "+ p.getDatePaiement()+"a bien été enregistré");
		assertNotNull(p);
	}*/

   /* @Test
	public void testCalculerBeneficeAnnuel() throws ParseException {
    	double coutBenefAnnuel;
    	Calendar c = Calendar.getInstance();
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
    	Date date = sdf.parse("2016");
    	c.setTime(date);
    	int annee = c.get(Calendar.YEAR);
    	coutBenefAnnuel=metier.calculerBeneficeAnnuel(1L, 1L, annee, 1L);
    	System.out.println("le bénéfice de l'année"+ " "+ annee+ " " + "vaut" +" " +coutBenefAnnuel);
    	
	}*/

}
