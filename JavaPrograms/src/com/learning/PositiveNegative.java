package com.learning;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		int n = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if (n > 0) {
			System.out.println("number is positive");
		} else if (n < 0) {
			System.out.println("number is negative");
		} else {
			System.out.println("number is zero");
		}
	}
}
