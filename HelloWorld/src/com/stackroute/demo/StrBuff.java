package com.stackroute.demo;

public class StrBuff { 
     public static void main(String []args){
    	 
    		 String input="london";      
	         
	         int length = input.length(); // string length
	       for(int i=1;i<input.length()+1;i++) 
	       {
	           char a= input.charAt(length-i);//converting string into char backwards
	         System.out.print(a); 
	       }
	     }
	}