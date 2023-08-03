package com.learning;

import java.util.Scanner;

public class AbundantNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;

		}
		if (sum > n) {
			System.out.println("Abundant Number"); // Abundant number is a number for which sum of its proper factors is greater than the number itself
		} else {
			System.out.println("Not an Abundant number");
		}

	}

}
