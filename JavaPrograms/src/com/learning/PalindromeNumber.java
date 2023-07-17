package com.learning;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num, copy, rev = 0, digit;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		copy = num;
		while (num != 0) {
			digit = num % 10;
			rev = (rev * 10) + digit;
			num = num / 10;
		}
		if (rev == copy) {
			System.out.println("The number is palindrome");
		} else {
			System.out.println("The number is not palindrome");
		}

	}
}
