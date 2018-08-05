package com.stackroute.demo;
import java.util.Scanner;

public class Guessed {
	int x=30;
	void Number() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter some number" );
		int n = s.nextInt();
		
		if(n>x) {
			System.out.println("Guessed no. is more than original no.");
			Number();}
		
		else if (n<x) {
			System.out.println("Guessed no. is less than original no.");
			Number();}
		
		else 
			System.out.println("Guessed no. matches the  original no.");
		s.close();
	}
	public static void main(String args[]) {
		Guessed g = new Guessed();
		g.Number();
	}

}
