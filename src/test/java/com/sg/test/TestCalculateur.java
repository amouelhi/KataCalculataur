package com.sg.test;

import com.sg.impl.Calculateur;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class TestCalculateur {

	private Calculateur calc;

	@Before
	public void init() {
		calc = new Calculateur();
	}

	@Test
	public void emptyString() throws Exception {
		assertEquals(calc.calculateSum(""), 0);
	}

	@Test
	public void singleValueReplaied() throws Exception {
		assertEquals(calc.calculateSum("1"), 1);
	}

	@Test
	public void sumTowNumbersCommaDelimited() throws Exception {
		assertEquals(calc.calculateSum("3,2"), 5);
	}

	@Test
	public void sumTowNumberDelimited() throws Exception {
		assertEquals(calc.calculateSum("4\n5"), 9);
	}

	@Test
	public void sumThreeNumbersDelimitedBothWays() throws Exception {
		assertEquals(calc.calculateSum("1,4,7"), 12);
	}

	@Test(expected = Exception.class)
	public void negativeNumber() throws Exception {
		calc.calculateSum("-3");
	}

	@Test
	public void ignoresNumbers() throws Exception {
		assertEquals(calc.calculateSum("15,60,1001"), 75);
	}
}
