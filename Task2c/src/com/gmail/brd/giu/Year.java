package com.gmail.brd.giu;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("������� ���-�� ���� � ������� Enter.");

		int number = sc.nextInt();

		if (number % 4 == 0 && number % 400 == 0) {
			System.out.println("���� ��� ����������, � ��� 366 ����.");

		} else if (number % 100 == 0) {
			System.out.println("���� ��� �� ����������, � ��� 365 ����.");

		} else if (number % 4 == 0 && number % 100 > 0) {
			System.out.println("���� ��� ����������, � ��� 366 ����.");

		} else {
			System.out.println("���� ��� �� ����������, � ��� 365 ����.");

		}
	}
}
