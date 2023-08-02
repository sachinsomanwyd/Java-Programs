package com.learning;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		int n, sum = 0, prod = 1, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		while (n != 0) {
			d = n % 10;
			sum = sum + d;
			prod = prod * d;
			n = n / 10;
		}
		if (sum == prod) {
			System.out.println("Spy number");
		} else {
			System.out.println("Not a spy number");
		}

	}

}
