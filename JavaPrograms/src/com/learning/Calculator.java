package com.learning;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a=0,b=0;
		System.out.println("Enter two numbers");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		Calculator c = new Calculator();
		System.out.println("Addition : "+ c.add(a, b));
		
		System.out.println("Subtraction : "+ c.subtraction(a, b));
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return a-b;
	}
	

}
