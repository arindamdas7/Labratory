package com.junit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class CalculatorTest 
{
	Calculator cal;
	
	@BeforeAll
	static void beforeAllInit()
	{
		System.out.println("Before All: This will execute before all test cases");
	}
	
	@AfterAll
	static void afterAllInit()
	{
		System.out.println("After All: This will execute after all the test cases");
	}
	
	//before each is used which is executed before every test
	@BeforeEach
	void beforeEachInit()
	{
		cal = new Calculator();
		
	}
	
	//after each is used which is executed after every test
	@AfterEach
	void cleanup()
	{
		cal=null;
		System.out.println("Clean up...");
	}
	
	@Test
	//@DisplayName("Testing Addition Method")
	void testAddition()
	{
		//Calculator cal = new Calculator();
		
		assertEquals(10, cal.addition(7, 3), 
				"This test method is to test addition of two int values");
	}
	
	@Test
	void testMultiply()
	{
		//Calculator cal = new Calculator();
		//assertEquals(25, cal.multiply(5, 5));
		assertAll(
				()-> assertEquals(10,  cal.multiply(5, 2)),
				()-> assertEquals(-10, cal.multiply(5, -2)),
				()-> assertEquals(100, cal.multiply(25, 4)));
		
		
	}
	
	@Test
	void testSubtraction()
	{
		assertEquals(8, cal.subtraction(15, 7),
				"This test method is to test subtraction of two int values");
	}
	
	@Test
	//we are disableing this test case to run on mac and linux OS
	@DisabledOnOs(value= {OS.MAC,OS.LINUX})
	//we are enabling that this test case can run only on system that has
	//JRE between 11 and 19
	@EnabledForJreRange(min=JRE.JAVA_11, max=JRE.JAVA_19)
	//we are disabling this test who have system Java 9
	@DisabledOnJre(value= {JRE.JAVA_9})
	void testDivision()
	{
		assertEquals(9, cal.division(45, 5),
				"This test method is to test division of two int values");
		
	}
	
	@Test
	void testDivisionWithException()
	{
		assertThrows(ArithmeticException.class, ()-> cal.division(25, 0),
				"This test method is to test division of two int values while throwing exception");
	}
	
	@Test
	@DisplayName("Testing factorial method")
	void testFactorial()
	{
		System.setProperty("Job", "Dev");
		assumeTrue("Dev".equals(System.getProperty("Job")));
		//assumeFalse("Dev".equals(System.getProperty("Job")),CalculatorTest::message);
		//assertEquals(120, cal.factorial(5));
	}
	
	private static String message()
	{
		return "Test Execution has failed!";
	}
	
	@Test
	@DisplayName("Disable method")
	@Disabled
	void testDisabled()
	{
		fail("This test should be disabled!!");
	}
}
