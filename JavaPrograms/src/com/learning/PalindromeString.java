package com.learning;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		String copy = s;
		int len = s.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		if (rev.equals(copy)) {
			System.out.println("The string is palindrome");
		} else {
			System.out.println("The string is not palindrome");
		}
	}
}
