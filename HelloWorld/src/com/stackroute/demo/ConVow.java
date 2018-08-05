package com.stackroute.demo;
import java.util.*;

public class ConVow {
	
		public static void main(String[ ] arg)
		{
		int i=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter either character or word : ");
		String st = s.next();
		s.close();
		
		
		for(i=0; i< st.length(); i++)
		if(st.charAt(i) =='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u')
		{
		System.out.print("Vowel"); 
		}
		else if((st.charAt(i)>='a'&&st.charAt(i)<='z')||(st.charAt(i)>='A'&&st.charAt(i)<='Z'))
			System.out.print("Consonant");
		else
			System.out.print("Errorrrrrrrrr");		
		}
	}
