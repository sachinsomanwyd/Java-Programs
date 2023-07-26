package com.learning;
import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		int i, j, col,n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		char ch = '*';
		for (i = 1; i <= (2*n)-1; ++i) {
			if (i > n) {
				col = (2*n) - i;
			} else {
				col = i;
			}
			System.out.println("\n");
			for (j = 1; j <=col; j++)
				System.out.print("\t" + ch);
		}

	}
}
