package com.gestionhotel.gestionhotel.exception;

import java.util.Date;
import java.util.logging.Logger;

public class MyException extends Exception{

	Logger logger = Logger.getLogger("ExceptionPerso");
	
	public MyException(String msg) {
		super(msg);
		
		logger.warning("Error "+ new Date() +" : " + msg);
	}

}
