package com.learning;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int n, sum;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sum = (n * (n + 1)) / 2;
		System.out.println("The sum is " + sum);
	}

}
