package com.mavendemo.log4j;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.apache.log4j.Logger;

/**
 * Unit test for simple App.
 */
public class AppTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

	private static Logger logger = Logger.getLogger(AppTest.class);

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println( "This is a test console message." );
        logger.debug("This is a test debug message.");
        logger.info("This is a test info message.");
        logger.warn("This is a test warn message.");
        logger.error("This is a test error message.");

    }
}
