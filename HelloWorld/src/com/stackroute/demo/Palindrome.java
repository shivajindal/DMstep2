package com.stackroute.demo;

import java.util.*;

public class Palindrome { 
		

		public static void main(String args[]){  
		  int r,sum=0,num, n, su=0;    
		 Scanner s = new Scanner(System.in);
		 s.close();
		  System.out.println("Enter any Number");
		  n=s.nextInt();
		  num=n;   
		  
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;  
		   
		   if(r%2==0) {
			   su = su + r;
		   }
			   
		  }   
		  
		  if(sum == num)  {  
			  if(sum > 25)
		   System.out.println("It is a palindrome number and Sum of even nos. is greater than 25");
			  else
		   System.out.println("It is a palindrome number and Sum OF even nos. is less than 25 ");	  
		  }
		  else    
		   System.out.println("It's not palindrome"); 
		  
		}  
		}  