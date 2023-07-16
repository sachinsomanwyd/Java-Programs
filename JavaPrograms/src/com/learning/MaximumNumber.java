package com.learning;

import java.util.Scanner;

public class MaximumNumber {

	public static void main(String[] args) {
		int a = 0;
		System.out.println("Please enter a number ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int arr[] = new int[a];
		System.out.println("Please enter " + a + " numbers");
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i = 1; i < a; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Maximum Number is : " + max);
	}

}
