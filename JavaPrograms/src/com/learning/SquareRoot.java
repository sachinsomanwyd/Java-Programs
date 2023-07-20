package com.learning;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("The square root of " + n + " is " + Math.sqrt(n));

	}

}
