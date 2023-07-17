package com.learning;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		int n, i, d, sum = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			d = i * i;
			sum += d;
		}
		System.out.println("The sum of squares is " + sum);

	}

}
