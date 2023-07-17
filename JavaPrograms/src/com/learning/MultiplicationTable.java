package com.learning;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i, n;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (i = 1; i <= 10; ++i) {
			System.out.println(i + "*" + n + "=" + i * n);
		}
	}

}
