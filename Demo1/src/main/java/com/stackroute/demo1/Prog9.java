package com.stackroute.demo1;

import java.util.Scanner;

public class Prog9 {
	public String reverse(String a)
	{
		String str= "";
		for(int i=a.length()-1;i>=0;i--) {
			str=str+a.charAt(i);
		}
		return str;
	}
	
	public static void main(String args[]) {
		String n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		n= s.next();
		
		Prog9 p = new Prog9();
		System.out.print(p.reverse(n));
		s.close();
	}
}