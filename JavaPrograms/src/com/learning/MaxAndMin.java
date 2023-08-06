package com.learning;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array");
		n = in.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		System.out.println("Enter the elements ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println(" Max: " + max);
		System.out.println(" Min: " + min);
	}

}
