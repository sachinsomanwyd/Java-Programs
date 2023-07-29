package com.learning;

public class Pattern6 {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 3; i++) {
			for (j = i; j <= 3; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("\n");
		}

	}
}
