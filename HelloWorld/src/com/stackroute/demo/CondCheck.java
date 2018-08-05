package com.stackroute.demo;

import java.util.Scanner;

public class CondCheck {
	
	public static void main (String args[]) {
		 int i;    
		  Scanner s = new Scanner(System.in);
		  s.close();
		  System.out.println("Enter any Number");
		  i=s.nextInt();
		  
		  if(i<30 && i>20) {		  
			  if (i%2 != 0) 
			  System.out.println("Tom");
		  
			  else {
				  System.out.println("Jerry");}
	}
	}}


