package com.devops.demo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator calculator  = null;
	@BeforeClass
	public static void init(){
		  calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, calculator.add(10, 0));
	}

	@Test
	public void testDiv() {
		assertEquals(2, calculator.div(10, 5));
	}

	@Test
	public void testSub() {
		assertEquals(8, calculator.sub(10, 2));
	}

}
