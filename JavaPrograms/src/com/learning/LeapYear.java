package com.learning;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		System.out.println("Enter the year");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("The year is a leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}

}
