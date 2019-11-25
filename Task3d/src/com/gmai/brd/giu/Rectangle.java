package com.gmai.brd.giu;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int height;
		int width;

		System.out.print("Input height: ");
		height = sc.nextInt();
		System.out.print("Input width: ");
		width = sc.nextInt();

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				// System.out.print("*");
				if (j == 0 || j == width - 1 || i == 0 || i == height - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();

		}
	}
}
