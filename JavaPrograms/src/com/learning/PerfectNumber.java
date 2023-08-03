package com.learning;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;

		}
		if (sum == n) {
			System.out.println("Perfect Number"); // Perfect number is equal to sum of its factors except itself
		} else {
			System.out.println("Not a Perfect number");
		}

	}
}
