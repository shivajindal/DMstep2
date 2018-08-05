package com.stackroute.demo;
import java.util.*;

public class ScannerAdd {
	public static void main(String []args){
   	 int sum=0;
		Scanner s = new Scanner(System.in);
		s.close();
		System.out.println("Enter something : ");
		String st = s.nextLine();	
		
		String []arr = st.split(" " );
		
		for(int i=0; i<arr.length; i++)
			sum=sum +(Integer.parseInt(arr [i]));
			
		System.out.println(sum);
	}
}
