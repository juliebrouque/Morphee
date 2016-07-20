package com.gestionhotel.gestionhotel;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	    TestHotel.class,
	    TestChambre.class,
	    TestPersonnes.class,
	    TestConsommations.class,
	    TestFactures.class,
		TestProduit.class,
		 TestReservation.class
		 })
public class AllTests {

}
