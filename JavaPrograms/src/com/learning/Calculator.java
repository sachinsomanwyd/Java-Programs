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
		System.out.println("Multiplication : "+ c.multiplication(a, b));
		System.out.println("Division : "+ c.division(a, b));
	}
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public int subtraction(int a, int b) {
		return a-b;
	}
	public int multiplication(int a, int b) {
		return a*b;
	}
	public float division(float a, float b) {
		if(b==0) {
			System.out.println("Division by zero not possible ");
			return 0;
		}
		return (a/b);
   }
}