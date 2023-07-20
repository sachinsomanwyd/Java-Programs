package com.learning;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("before swapping a = " + a + " and b = " + b);
		c = a;
		a = b;
		b = c;
		System.out.println("after swapping a = " + a + " and b = " + b);

	}

}
