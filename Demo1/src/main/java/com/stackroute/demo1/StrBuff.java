package com.stackroute.demo1;

public class StrBuff {

    public int reverse(int num)
    {
    	int n;
    	int r=0;
    	while(num>0) {
    		n=num%10;
    		r=r*10+n;
    		n=num/10;
    	}
    		return r;
    	}
}
    

    
   