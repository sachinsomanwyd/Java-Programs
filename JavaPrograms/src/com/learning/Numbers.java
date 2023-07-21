package com.learning;

public class Numbers {
	public static void main(String[] args) {
		int i, j;

		for (i = 1; i <= 3; ++i) {
			System.out.println("\n");
			for (j = 1; j <= i; j++)
				System.out.print("\t" + j);
		}
	}
}
