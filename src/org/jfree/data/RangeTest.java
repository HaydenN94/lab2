package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RangeTest {
	
	private Range rangeObjectUnderTest;

	@Before
	public void setUp() throws Exception {
		rangeObjectUnderTest = new Range(-1, 1);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test 
	 public void testCentralValueShouldBeZero() { 
	  assertEquals("The central value of -1 and 1 should be 0", 
	     0, rangeObjectUnderTest.getCentralValue(), 0.000000001d); 
	 } 
	
	//*********************************************************************
	// Tests for work to be done section of assignment 
	
	// Method 1 - Tests for Combine 
		
	// Method 2 - Tests for Constrain
		
	// Method 3 - Tests for Contains
		
	// Method 4 - Tests for Expand
		
	// Method 5 - Tests for Get Central Value 
	
	
}
