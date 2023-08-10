package com.learning;

import java.util.Scanner;

public class DigitCharacters {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string");
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
        String l="",d="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isDigit(c))
				d=d+c;
			else
				l=l+c;
		}
        String sen=d+l;
        System.out.println(sen);
	}

}
