package in.saurabhit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.saurabhit.beans.Calculator;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator ca = new Calculator();
		Integer actualResult = ca.add(12, 18);
		Integer expectedResult = 30;
		assertEquals(expectedResult, actualResult);
	}

}
