package com.gmail.brd.giu;

public class Triangle {

	public static void main(String[] args) {

		double a = 2.8;
		double b = 4.6;
		double c = 3.4;

		double p = (a + b + c) / 2;

		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println(s);

	}

}
