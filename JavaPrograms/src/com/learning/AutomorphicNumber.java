package com.learning;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		int n, flag = 0, q, d1, d2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		q = n * n;
		while (n != 0) {
			d1 = n % 10;
			d2 = q % 10;
			if (d1 != d2)
				flag = 1;
			n = n / 10;
			q = q / 10;
		}
		if (flag == 0) {
			System.out.println("Automorphic Number"); // It is a number contained in the last digit(s) of its square
		} else {
			System.out.println("Not an Automorphic Number");
		}

	}

}
