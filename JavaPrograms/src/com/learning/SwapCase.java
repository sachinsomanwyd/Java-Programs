package com.learning;

import java.util.Scanner;

public class SwapCase {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the string");
		Scanner in=new Scanner(System.in);
        s=in.nextLine();
        String s2="";
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
        	if(Character.isUpperCase(ch)) {
        		s2=s2+Character.toLowerCase(ch);
        	}else if(Character.isLowerCase(ch)) {
        		s2=s2+Character.toUpperCase(ch);
        	}else{
        		s2+=ch;
        	}
        	}
        System.out.println("New String: "+s2);
	}

}
