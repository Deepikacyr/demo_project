package com.test.multitreading;

public class threadnamingex {
	class ThreadName extends Thread  
	{  
	  
	
	ThreadName(String threadName)  
	{  
	
	super(threadName);  
	}  
	  
	
	public void run()  
	{  
	System.out.println(" The thread is executing....");  
	}  
	}  
	 public class ThreadNamingExample  
	{  
	public void main (String argvs[])  
	{  
	ThreadName th1 = new ThreadName("JavaTpoint1");  
	ThreadName th2 = new ThreadName("JavaTpoint2");  
	System.out.println("Thread - 1: " + th1.getName());  
	System.out.println("Thread - 2: " + th2.getName());  
	  th1.start();  
	th2.start();  
	}  
	}  
}
