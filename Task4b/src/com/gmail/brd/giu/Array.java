package com.gmail.brd.giu;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n;
		System.out.println("Введите размер массива и нажмите Enter: ");
		n = sc.nextInt();
		System.out.println("Размер массива равен:  " + n);

		int[] array = new int[n];
		System.out.println();
		System.out.println("Введите элементы массива нажимая Enter: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();

		}
		System.out.println("Вы ввели массив: " + Arrays.toString(array));
	}

}
