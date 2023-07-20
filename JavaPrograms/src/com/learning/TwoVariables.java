package com.learning;

import java.util.Scanner;

public class TwoVariables {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swapping a = " + a + " and b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping a = " + a + " and b = " + b);

	}

}
