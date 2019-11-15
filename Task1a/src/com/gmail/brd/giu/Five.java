package com.gmail.brd.giu;

import java.util.Scanner;

public class Five {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input five numbers and press Enter");

		int number = sc.nextInt();

		int a = number / 10000;
		int b = number % 10000 / 1000;
		int c = number % 1000 / 100;
		int d = number % 100 / 10;
		int e = number % 10 / 1;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
