package com.learning;

import java.util.Scanner;

public class SqrtArray {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array");
		n = in.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Math.sqrt(arr[i]));
		}
	}

}
