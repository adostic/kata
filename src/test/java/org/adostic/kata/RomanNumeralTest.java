package org.adostic.kata;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author adostic
 * @since 31.03.2015 10:42:03 AM
 */
public class RomanNumeralTest {

    public RomanNumeralTest() {
    }

	@Test
	public void test() {
		RomanNumeral romanNumeral = new RomanNumeral();

		Assert.assertEquals("I",romanNumeral.convert(1));
		Assert.assertEquals("II",romanNumeral.convert(2));
		Assert.assertEquals("III",romanNumeral.convert(3));

		Assert.assertEquals("IV",romanNumeral.convert(4));

		Assert.assertEquals("V",romanNumeral.convert(5));
		Assert.assertEquals("VI",romanNumeral.convert(6));
		Assert.assertEquals("VII",romanNumeral.convert(7));
		Assert.assertEquals("VIII",romanNumeral.convert(8));

		Assert.assertEquals("IX",romanNumeral.convert(9));

		Assert.assertEquals("X",romanNumeral.convert(10));
		Assert.assertEquals("XX",romanNumeral.convert(20));
		Assert.assertEquals("XXX",romanNumeral.convert(30));
		Assert.assertEquals("XL",romanNumeral.convert(40));

		Assert.assertEquals("L",romanNumeral.convert(50));

		Assert.assertEquals("XC",romanNumeral.convert(90));
		Assert.assertEquals("C",romanNumeral.convert(100));
		Assert.assertEquals("CC",romanNumeral.convert(200));

		Assert.assertEquals("CD",romanNumeral.convert(400));
		Assert.assertEquals("D",romanNumeral.convert(500));
		Assert.assertEquals("CM",romanNumeral.convert(900));
		Assert.assertEquals("M",romanNumeral.convert(1000));


		Assert.assertEquals("MCMXCIX",romanNumeral.convert(1999));
		Assert.assertEquals("-MCMXCIX",romanNumeral.convert(-1999));

		Assert.assertEquals("-I",romanNumeral.convert(-1));





	}

}