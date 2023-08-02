package com.learning;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		int n, count = 0, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		while (n != 0) {
			d = n % 10;
			if (d == 0) {
				count++;
			}
			n = n / 10;
		}
		if (count > 0) {
			System.out.println("Duck number");
		} else {
			System.out.println("Not a duck number");
		}

	}

}
