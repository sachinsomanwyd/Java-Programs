package com.learning;

import java.util.Scanner;

public class DeficientNumber {

	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum = sum + i;

		}
		if (sum < n) {
			System.out.println("Deficient Number"); // sum of its factors is less than the number itself
		} else {
			System.out.println("Not a Deficient number");
		}

	}

}
