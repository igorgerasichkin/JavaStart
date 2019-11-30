package com.gmail.brd.giu;

import java.util.Arrays;
import java.util.Scanner;

public class StringS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0;
		System.out.println("Введите строку текста и нажмите Enter:");
		String s = sc.nextLine();

		char[] t = s.toCharArray();
		System.out.println(Arrays.toString(t));

		for (int i = 0; i < t.length; i++) {
			if (t[i] == 'b') {
				a = a + 1;
			}

		}

		System.out.print("В веденной строке колличество символов 'b' состовляет: " +  a);

	}

}
