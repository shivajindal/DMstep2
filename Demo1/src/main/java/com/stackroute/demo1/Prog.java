package com.stackroute.demo1;

import java.util.Scanner;

public class Prog {
	public String Out(String st)
	{
		String s ="";
		int n=3;
		for(int i=0;i<n;i++)
		{ 
			for(int j=st.length()-n;j<st.length();j++)
			{
				s=s+(st.charAt(j));
			}
		}
		return st+s;
	}
	public static void main(String args[])
	{
		String n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number");
		n=s.next();
		
		Prog p = new Prog();
		System.out.println(p.Out(n));
		s.close();
	}
}
