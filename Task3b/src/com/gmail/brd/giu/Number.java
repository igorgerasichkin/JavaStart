package com.gmail.brd.giu;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int f = 1;

		System.out.print("¬ведите число и нажмите Enter: ");
		number = sc.nextInt();

		for (int i = 1; i <= number; i++) {
			f = f * i;
		}
		System.out.print("‘акториал введенного числа равен: " + f);

	}
}
