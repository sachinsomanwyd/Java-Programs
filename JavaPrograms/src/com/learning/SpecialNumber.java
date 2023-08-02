package com.learning;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		int n, sum = 0, m, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		m = n;
		while (n != 0) {
			d = n % 10;
			int fact = 1;
			for (int i = 1; i <= d; i++)
				fact = fact * i;
			sum = sum + fact;
			n = n / 10;
		}
		if (sum == m) {
			System.out.println("Special number");
		} else {
			System.out.println("Not a special number");
		}

	}

}
