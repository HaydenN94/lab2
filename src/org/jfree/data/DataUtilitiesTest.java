package org.jfree.data;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class DataUtilitiesTest extends TestCase {

	private DefaultKeyedValues2D values2D;

	// Initialises variable for test 
	@Before
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
		
		double colTotal = DataUtilities.calculateColumnTotal(values2D, 0);

		assertEquals(31.0, colTotal);
	}

	// Case 2: Column total with all negative values
		@Test
		public void testCalculateColumnTotalNegativeValues() {			
			values2D.addValue(-1, 0, 0);
			values2D.addValue(-5, 1, 0);
			values2D.addValue(-10, 2, 0);
			values2D.addValue(-15, 3, 0);
			
			double colTotal = DataUtilities.calculateColumnTotal(values2D, 0);

			assertEquals(-31.0, colTotal);
		}
	// Method 2 - Tests for Calculate Row Total

	// Method 3 - Tests for Create Number Array

	// Method 4 - Tests for Create Number Array 2D

	// Method 5 - Tests for Get Cumulative Percentages

}
