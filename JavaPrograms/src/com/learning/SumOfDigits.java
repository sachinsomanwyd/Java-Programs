package com.learning;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		int n, sum = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n % 10 != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("The sum of digits is " + sum);
	}
}
