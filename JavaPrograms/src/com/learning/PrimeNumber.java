package com.learning;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n, a = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 2; i <= n - 1; i++) {
			if (n % i == 0) {
				a = a + 1;
			}
		}

		if (a > 0) {
			System.out.println("Not a Prime Number ");
		} else if (n == 1) {
			System.out.println("Neither prime nor composite");
		} else {
			System.out.println("Prime number");
		}

	}

}
