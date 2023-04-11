
package com.test.multitreading;

public class Testsleepmethod2 {
	public static void main(String argvs[])  
	{  
	try {  
	for (int j = 0; j < 5; j++)  
	{  
	Thread.sleep(1000);  
	System.out.println(j);  
	}  
	}  
	catch (Exception expn)   
	{  
	System.out.println(expn);  
	}  
	}  
	} 
