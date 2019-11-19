package com.gmail.brd.giu;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Введите кол-во дней и нажмите Enter.");

		int number = sc.nextInt();

		if (number % 4 == 0 && number % 400 == 0) {
			System.out.println("Этот год високосный, в нем 366 дней.");

		} else if (number % 100 == 0) {
			System.out.println("Этот год не високосный, в нем 365 дней.");

		} else if (number % 4 == 0 && number % 100 > 0) {
			System.out.println("Этот год високосный, в нем 366 дней.");

		} else {
			System.out.println("Этот год не високосный, в нем 365 дней.");

		}
	}
}
