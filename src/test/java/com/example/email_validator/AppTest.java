package com.example.email_validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

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

    /**
     * Rigourous Test :-)
     */
    public void testApp1()
    {
    	String testEmail = new String("rod.naugler@gmail.com"); //This should pass 4 tests
    	int result = App.main(testEmail);
    	assertEquals( 4,result );
    }
    public void testApp2()
    {
     	String testEmail = new String("rod@example.com");       //This should pass 4 tests
    	int result = App.main(testEmail);
    	assertEquals( 4,result );
    }
    public void testApp3()
    {
     	String testEmail = new String("rod@com");               //This should pass 2 tests
    	int result = App.main(testEmail);
    	assertEquals( 2,result );
    }
    public void testApp4()
    {
     	String testEmail = new String("rod");                   //This should pass 0 tests
    	int result = App.main(testEmail);
    	assertEquals( 0,result );
    }
    public void testApp5()
    {
     	String testEmail = new String(".com");                  //This should pass 0 tests
    	int result = App.main(testEmail);
    	assertEquals( 0,result );
    }
}
