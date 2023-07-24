package com.learning;

public class Pattern2 {

	public static void main(String[] args) {
		int i, j;
		char ch = '*';
		for (i = 5; i >= 1; i--) {
			System.out.println("\n");
			for (j = 1; j <= i; j++)
				System.out.print(ch);
		}
	}

}
