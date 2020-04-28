package com.learnmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	final static Logger logger = logger.getlogger(App.class);
    public static void main( String[] args )
    {
    	Calculator calc = new Calculator();
    	logger.debug(calc.add(1, 7));
    	logger.debug(calc.subtract(1, 2));
    	logger.debug(calc.multiply(1, 2));
    	logger.debug(calc.divide(1, 2));
    }
}
