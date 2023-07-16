package com.learning;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");

		}
	}
}