package org.jfree.data;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class DataUtilitiesTest extends TestCase {

	private DefaultKeyedValues2D values2D;

	// Initialises variables for test
	@BeforeClass
	public void setUp() throws Exception {
		DefaultKeyedValues2D testValues = new DefaultKeyedValues2D();
		values2D = testValues;
	}

	// Resets all variables before next test is ran
	@After
	public void tearDown() throws Exception {
		values2D = null;
	}

	// ****** Method 1 - Tests for Calculate Column Total *****************

	// Case 1: Column total with all positive values
	@Test
	public void testCalculateColumnTotalPositiveValues() {
		values2D.addValue(1, 0, 0);
		values2D.addValue(5, 1, 0);
		values2D.addValue(10, 2, 0);
		values2D.addValue(15, 3, 0);

		double expected = 31.0;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}

	// Case 2: Column total with all negative values
	@Test
	public void testCalculateColumnTotalNegativeValues() {
		values2D.addValue(-1, 0, 0);
		values2D.addValue(-5, 1, 0);
		values2D.addValue(-10, 2, 0);
		values2D.addValue(-15, 3, 0);

		double expected = -31.0;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 3: Column total with positive and negative values
	@Test
	public void testCalculateColumnTotalNegativeAndPositiveValues() {
		values2D.addValue(-1, 0, 0);
		values2D.addValue(-5, 1, 0);
		values2D.addValue(-10, 2, 0);
		values2D.addValue(16, 3, 0);
		values2D.addValue(20, 4, 0);
		values2D.addValue(2, 5, 0);

		double expected = 22.0;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 4: Column total with all positive fraction values
	@Test
	public void testCalculateColumnTotalPositiveFractionValues() {
		values2D.addValue(1.2, 0, 0);
		values2D.addValue(5.3, 1, 0);
		values2D.addValue(10.5, 2, 0);
		values2D.addValue(15.2, 3, 0);

		double expected = 32.2;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 5: Column total with all negative fraction values
	@Test
	public void testCalculateColumnTotalNegativeFractionValues() {
		values2D.addValue(-1.2, 0, 0);
		values2D.addValue(-5.3, 1, 0);
		values2D.addValue(-10.5, 2, 0);
		values2D.addValue(-15.2, 3, 0);

		double expected = -32.2;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 6: Column total with positive and negative fraction values
	@Test
	public void testCalculateColumnTotalNegativeAndPostiveFractionValues() {
		values2D.addValue(-1.2, 0, 0);
		values2D.addValue(-5.3, 1, 0);
		values2D.addValue(10.5, 2, 0);
		values2D.addValue(15.2, 3, 0);

		double expected = 19.2;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 7: Column total with all positive values
	@Test
	public void testCalculateColumnTotalForOnlyColumnsSpecified() {
		values2D.addValue(1, 0, 0);
		values2D.addValue(5, 1, 0);
		values2D.addValue(10, 0, 1);
		values2D.addValue(15, 1, 1);

		double expected = 6;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 8: Column total with one value totalling 0 
	@Test
	public void testCalculateColumnTotalOneValueTotallingZero() {
		values2D.addValue(0, 0, 0);

		double expected = 0;
		double actualColTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(expected, actualColTotal);
	}
	
	// Case 9: Column total for row that doesn't exist throws exception  
	@Test
	public void testCalculateColumnTotalForColumnNotExisitngThrowsException() {
		values2D.addValue(0, 0, 0);

		try {
		DataUtilities.calculateColumnTotal(values2D, 5);
	    fail("No exception thrown. The expected outcome was: a thrown "
	    		+ "exception of type: IllegalArgumentException");
		} catch (Exception e) {
			assertTrue("Incorrect exception type thrown",  
				    e.getClass().equals(IllegalArgumentException.class));
		}
	}
		
	// Case 10: Test column total with null data 
	@Test
	public void testNullDataColumnTotalThrowsException(){
	try {
	    DataUtilities.calculateColumnTotal(null, 0);
	    fail("No exception thrown. The expected outcome was: a thrown "
	    		+ "exception of type: IllegalArgumentException");
	}
	catch (Exception e){
	    assertTrue("Incorrect exception type thrown",  
	    e.getClass().equals(IllegalArgumentException.class));
	}
	}
	// Method 2 - Tests for Calculate Row Total

	// Method 3 - Tests for Create Number Array

	// Method 4 - Tests for Create Number Array 2D

	// Method 5 - Tests for Get Cumulative Percentages

}
