package com.v2soft.namegen;

import java.util.Locale;

public class VisualTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HumanNameGenerator generator = new HumanNameGenerator(Locale.US);
		for ( int  i = 0 ; i< 10; i++ ) {
			System.out.println(generator.getMaleName());
			System.out.println(generator.getFemaleName());
		}
	}

}
