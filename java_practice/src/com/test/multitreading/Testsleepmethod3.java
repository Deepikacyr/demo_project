package com.test.multitreading;

public class Testsleepmethod3 {
	public static void main(String[]args){
	try  
	{  
	for (int j = 0; j < 5; j++)   
	{  
	  
	
	Thread.sleep(-100);  
	  
	
	System.out.println(j);  
	}  
	}  
	catch (Exception expn)   
	{  
	  
	
	System.out.println(expn);  
	}  
	}  
	}  
