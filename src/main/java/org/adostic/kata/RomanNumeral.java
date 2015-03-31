package org.adostic.kata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adostic
 * @since 31.03.2015 10:41:58 AM
 */
public class RomanNumeral {

	private List<Mapping> mappings = new ArrayList<>(13);

	public RomanNumeral() {
		mappings.add(new Mapping(1000, "M"));
		mappings.add(new Mapping(900, "CM"));
		mappings.add(new Mapping(500, "D"));
		mappings.add(new Mapping(400, "CD"));
		mappings.add(new Mapping(100, "C"));
		mappings.add(new Mapping(90, "XC"));
		mappings.add(new Mapping(50, "L"));
		mappings.add(new Mapping(40, "XL"));
		mappings.add(new Mapping(10, "X"));
		mappings.add(new Mapping(9, "IX"));
		mappings.add(new Mapping(5, "V"));
		mappings.add(new Mapping(4, "IV"));
		mappings.add(new Mapping(1, "I"));

	}

	@SuppressWarnings("AssignmentToMethodParameter")
	public String toRoman(int arabic) {
		String result = "";
		if (arabic < 0) {
			result += "-";
			arabic *= -1;
		}
		for (Mapping mapping : mappings) {
			while (arabic >= mapping.arabic) {
				result += mapping.roman;
				arabic -= mapping.arabic;
			}
		}
		return result;
	}

}

class Mapping {

	int arabic;
	String roman;

	public Mapping(int arabic, String roman) {
		this.arabic = arabic;
		this.roman = roman;
	}

}
