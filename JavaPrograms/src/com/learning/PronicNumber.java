package com.learning;

import java.util.Scanner;

public class PronicNumber {

	public static void main(String[] args) {
		int n, fact = 0;
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				if (i * (i + 1) == n)
					fact = i;
		}
		if (fact != 0) {
			System.out.println("Pronic Number"); // Pronic number is the product of two consecutive integers
		} else {
			System.out.println("Not a Pronic number");
		}

	}

}
