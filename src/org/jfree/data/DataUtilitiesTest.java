package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataUtilitiesTest {
	
	private Values2D values2D;

	@Before
	public void setUp() throws Exception {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D(); 
	    values2D = testValues; 
	    testValues.addValue(1, 0, 0); 
	    testValues.addValue(4, 1, 0); 
	}
	
	@Test 
	  public void testValidDataAndColumnColumnTotal() 
	  { 
	    assertEquals("Wrong sum returned. It should be 5.0",  
	        5.0, DataUtilities.calculateColumnTotal(values2D, 0), 0.0000001d); 
	  } 
	
	public void testNullDataColumnTotal()
	{
	try
	{
	    DataUtilities.calculateColumnTotal(null, 0);
	    fail("No exception thrown. The expected outcome was: a thrown "
	    		+ "exception of type: IllegalArgumentException");
	}
	catch (Exception e)
	{
	    assertTrue("Incorrect exception type thrown",  
	    e.getClass().equals(IllegalArgumentException.class));
	}
	}

	@After
	public void tearDown() throws Exception {
		values2D = null; 
	}
	
	//*********************************************************************
	// Tests for work to be done section of assignment 
	
	// Method 1 - Tests for Calculate Column Total 
	
	// TC 1 ... 
	// TC 2 ... 
	
	// Method 2 - Tests for Calculate Row Total 
	
	// Method 3 - Tests for Create Number Array 
	
	// Method 4 - Tests for Create Number Array 2D 
	
	// Method 5 - Tests for Get Cumulative Percentages 
	
	
}
