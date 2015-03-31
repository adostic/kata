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

		Assert.assertEquals("I",romanNumeral.toRoman(1));
		Assert.assertEquals("II",romanNumeral.toRoman(2));
		Assert.assertEquals("III",romanNumeral.toRoman(3));

		Assert.assertEquals("IV",romanNumeral.toRoman(4));

		Assert.assertEquals("V",romanNumeral.toRoman(5));
		Assert.assertEquals("VI",romanNumeral.toRoman(6));
		Assert.assertEquals("VII",romanNumeral.toRoman(7));
		Assert.assertEquals("VIII",romanNumeral.toRoman(8));

		Assert.assertEquals("IX",romanNumeral.toRoman(9));

		Assert.assertEquals("X",romanNumeral.toRoman(10));
		Assert.assertEquals("XX",romanNumeral.toRoman(20));
		Assert.assertEquals("XXX",romanNumeral.toRoman(30));
		Assert.assertEquals("XL",romanNumeral.toRoman(40));

		Assert.assertEquals("L",romanNumeral.toRoman(50));

		Assert.assertEquals("XC",romanNumeral.toRoman(90));
		Assert.assertEquals("C",romanNumeral.toRoman(100));
		Assert.assertEquals("CC",romanNumeral.toRoman(200));

		Assert.assertEquals("CD",romanNumeral.toRoman(400));
		Assert.assertEquals("D",romanNumeral.toRoman(500));
		Assert.assertEquals("CM",romanNumeral.toRoman(900));
		Assert.assertEquals("M",romanNumeral.toRoman(1000));


		Assert.assertEquals("MCMXCIX",romanNumeral.toRoman(1999));
		Assert.assertEquals("-MCMXCIX",romanNumeral.toRoman(-1999));

		Assert.assertEquals("-I",romanNumeral.toRoman(-1));





	}

}