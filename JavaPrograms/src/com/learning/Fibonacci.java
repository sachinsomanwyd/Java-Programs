package com.learning;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int f = 0, s = 1, t, n;
		System.out.println("Enter the number of terms in the series");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(f + "\t" + s);
		for (int i = 3; i <= n; i++) {
			t = f + s;
			System.out.print("\t" + t);
			f = s;
			s = t;
		}
	}

}
