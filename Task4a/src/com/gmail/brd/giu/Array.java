package com.gmail.brd.giu;

public class Array {

	public static void main(String[] args) {

		int[] arrayA = { 0, 5, 2, 4, 7, 1, 3, 19 };

		int a = 0;
		for (int i = 0; i < arrayA.length; i++) {
			if (arrayA[i] % 2 != 0) {
				a = a + 1;

			}

		}
		System.out.println("В массиве нечетных чисел: " + a);

	}

}
