package com.stackroute.demo;
import java.util.*;

public class NonInc {
	 
	      public static void main(String []args){
	        
	 		Scanner s = new Scanner(System.in);
	 		
		 		System.out.println("Enter something : ");
	 		String st = s.next();
	 		
	 		String str;
	        int arr[]=new int[st.length()];                   
	        for(int i=0;i<st.length();i++)
	        {
	            arr[i]=getNumericValue(st.charAt(i));
	           str = arr.toString(); 
	            System.out.println("The Sorted no. is in non-increasing order:"+ str);
	        }
	       int length=arr.length;
	     int rev[]=new int[length];
	        Arrays.sort(arr);   //sort function in java
	        
//	        int sum=0, i=0, temp;
//	        do {
//	        	a[i]= n%10;
//	        	i++;
//	        	n= n/10;
//	        }while
	        
	        
	        int sum=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            rev[i]=arr[length-1-i];  // decreased order
	           
	           if(rev[i]%2==0)       // checking for even
	           {
	               sum=sum+arr[i];     //sum
	              
	           }
	     
	        }
//	        System.out.print("The Sorted no. is in non-increasing order:" + arr.toString());
	        System.out.println("Sum of numbers is:" + sum);
	         if(sum>15)                   
	               {
	                   System.out.print("TRUE"+ " " + sum);
	               }
	               else
	               {
	                   System.out.print("FALSE");
	               }
	        
	     }

		private static int getNumericValue(char charAt) {
			// TODO Auto-generated method stub
			return 0;
		}
	 }

