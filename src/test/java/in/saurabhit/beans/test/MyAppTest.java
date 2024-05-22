package in.saurabhit.beans.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.saurabhit.beans.MyApp;

public class MyAppTest {
	
	@Test
	public void testAdd() {
		
		MyApp app = new MyApp();
		
		int actualResult= app.add(12, 13);
		int expectedResult = 25;
		assertEquals(expectedResult, actualResult);
	}

}
