package com.stackroute.demo;
import java.util.Scanner;

public class Chara {
	     public static void main(String []args){
	    	 int i=0;
	 		Scanner s = new Scanner(System.in);
	 		
	 		System.out.println("Enter something : ");
	 		String st = s.next();
	 		s.close();
	 		
	 			
	      if(65<=st.charAt(i) && st.charAt(i)<=90)
	      {
	      System.out.println("CAPITAL");
	    }
	      else if(97<=st.charAt(i) && st.charAt(i)<=122)
	    {
	        System.out.println("SMALL");
	    }
	    
	      else if(49<=st.charAt(i) && st.charAt(i)<=57)
	    {
	         System.out.println("DIGIT");
	    }
	    else 
	    {
	        System.out.println("SPECIAL SYMBOL");
	    }
	    
	    }
	}


