package com.gmai.brd.giu;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double c;

		System.out.println("������� ����� a");
		a = sc.nextDouble();
		System.out.println("������� ����� b");
		b = sc.nextDouble();
		System.out.println("������� ����� c");
		c = sc.nextDouble();

		if (a + b >= c && a + c >= b && b + c >= a) {
			System.out.println("����� ����������� ����������");

		} else if (a + b <= c && a + c <= b && b + c <= a) {
			System.out.println("����� ����������� ����������");

		} else {
			System.out.println("������ ������������ �� ����������");
		}
	}
}