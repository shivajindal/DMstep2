package com.stackroute.demo;

public class Value {
	
	     public static void main(String []args){
	         String input="Shivangi";    //input 1
	         int number=3;               //input 2
	         int length=input.length();  //string length
	         int trump=length-number;   // trump = starting number for substring process
	        String repeated=input.substring(trump,length); 
	        System.out.print(input);
	    for(int i=0;i<number;i++)  // repeating 
	    {
	        System.out.print(repeated);
	     
	    }
	    }
	}


