package com.learning;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		System.out.print("The factors of " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}
}
