package com.stackroute.pe2;
import java.util.*;

public class Student {
	
	public int avg(int arr[])
	{
	   int length=arr.length;
	    Arrays.sort(arr);
	    int sum=0;
	    for(int i=0;i<length;i++)
	    {
	        sum=sum+arr[i];
	    }
	    int avg=sum/length;
	    return avg;
	}
	
	public int min(int arr[])
	{
	   int length=arr.length;
	    Arrays.sort(arr);
	    int sum=0;
	    for(int i=0;i<length;i++)
	    {
	        sum=sum+arr[i];
	    }
	
	    return arr[0] ;
	}
	    
	public int max(int arr[])
	{
	   int length=arr.length;
	    Arrays.sort(arr);
	    int sum=0;
	    for(int i=0;i<length;i++)
	    {
	        sum=sum+arr[i];
	    }
	  
	    return arr[length-1];
	}
	
	     
	}