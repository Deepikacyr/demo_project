package com.test.multitreading;

public class illigalargumentexceptionex1 {
	public class IllegalArgumentException extends Thread   
	{  
	  
	  
	public void main(String argvs[])  
	{  
	  
	
	Thread.currentThread().setPriority(17);    
	System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
	  
	}  
	}  
}
