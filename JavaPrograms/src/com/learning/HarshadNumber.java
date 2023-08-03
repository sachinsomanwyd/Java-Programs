package com.learning;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		int n, sum = 0, m, d;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		n = in.nextInt();
		m = n;
		while (n != 0) {
			d = n % 10;
			sum = sum + d;
			n = n / 10;
		}
		if (m % sum == 0) {
			System.out.println("Harshad number");// A number which is divisible by sum of its digits
		} else {
			System.out.println("Not a harshad number");
		}

	}

}
