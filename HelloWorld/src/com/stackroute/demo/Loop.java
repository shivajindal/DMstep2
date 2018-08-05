package com.stackroute.demo;

import java.util.Scanner;

public class Loop {
	public static void main(String[ ] arg)
	{
	int n;
	Scanner s = new Scanner(System.in);
	s.close();
	System.out.println("Enter No. : ");
	n = s.nextInt();
	
	for(int i=1; i<=n; i++ )
		for(int j=1; j<=i; j++) {
			System.out.print(i);
		}
	}

}
