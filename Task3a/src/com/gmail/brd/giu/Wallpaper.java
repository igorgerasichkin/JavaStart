package com.gmail.brd.giu;

import java.util.Scanner;

public class Wallpaper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Введите количество полос и нажмите Enter:");
		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				if (j % 2 == 0) {
					System.out.print("+++");
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}
	}
}
