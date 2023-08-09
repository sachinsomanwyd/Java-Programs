package com.learning;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		int count = 0;
		String s;
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			ch=Character.toLowerCase(ch);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				count++;
		}
		System.out.println(count);
	}
}
