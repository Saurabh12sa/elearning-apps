package in.saurabhit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.saurabhit.beans.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator ca = new Calculator();
	       int actualResult = ca.add(12,14);
	       int expectedResult = 26;
	       assertEquals(expectedResult, actualResult);
	}
	
	public void testMultiply() {
		Calculator ca = new Calculator();
		int actualResult = ca.multiply(12, 15);
		int ecpectedResult = 180;
		assertEquals(ecpectedResult, actualResult);
		
		
	}

}
