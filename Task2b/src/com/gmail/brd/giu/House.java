package com.gmail.brd.giu;

import java.util.Scanner;

public class House {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input number flat and press Enter.");

		int number = sc.nextInt();
		int a = (number - 1) / 36 + 1;
		int b = (number - 36 * (a - 1) - 1) / 4 + 1;

		if (number >= 1 && number <= 144) {
			System.out.println("Front door number: " + a + " Flor number: " + b);
		} else {
			System.out.println("Here is no flat with this number. Repeat input! ");

		}
	}
}
		
