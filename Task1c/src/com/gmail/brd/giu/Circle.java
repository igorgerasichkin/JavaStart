package com.gmail.brd.giu;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double r;

		System.out.println("Input circle radius and press Enter");

		r = sc.nextDouble();

		double s = 2 * Math.PI * r;

		System.out.println(s);

	}

}
