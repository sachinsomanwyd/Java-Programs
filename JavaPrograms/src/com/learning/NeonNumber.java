package com.learning;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		int n, sum = 0, m, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		m = n;
		n = n * n;
		while (n != 0) {
			d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		if (sum == m) {
			System.out.println("Neon number");// A number where sum of digits of square of the no. is equal to the no.
		} else {
			System.out.println("Not a neon number");
		}

	}

}
