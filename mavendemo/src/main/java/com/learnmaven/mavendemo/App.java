package com.learnmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger LOGGER = Logger.getLogger(App.class);
    public static void main( String[] args )
    {
    	Calculator calc = new Calculator();
    	LOGGER.debug(calc.add(1, 5));
    	LOGGER.debug(calc.subtract(1, 2));
    	LOGGER.debug(calc.multiply(1, 2));
    	LOGGER.debug(calc.divide(1, 2));
    }
}
