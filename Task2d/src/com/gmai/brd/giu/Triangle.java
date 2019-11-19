package com.gmai.brd.giu;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;

		System.out.println("Введмте число a");
		a = sc.nextDouble();
		System.out.println("Введмте число b");
		b = sc.nextDouble();
		System.out.println("Введмте число c");
		c = sc.nextDouble();

		if (a + b >= c && a + c >= b && b + c >= a) {
			System.out.println("Такой треугольник существует");

		} else if (a + b <= c && a + c <= b && b + c <= a) {
			System.out.println("Такой треугольник существует");

		} else {
			System.out.println("Такого треугольника не существует");
		}
	}
}