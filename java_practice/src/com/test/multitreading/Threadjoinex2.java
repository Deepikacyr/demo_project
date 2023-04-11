package com.test.multitreading;

public class Threadjoinex2 {
	class ABC extends Thread  
	{  
	Thread threadToInterrupt;  
	public void run()  
	{  
	threadToInterrupt.interrupt();  
	}  
	}  
	public class ThreadJoinExample1  
	{  
	public void main(String[] argvs)  
	{  
	try  
	{  
	ABC th1 = new ABC();  
	th1.threadToInterrupt = Thread.currentThread();  
	th1.start();  
	th1.join();  
	}  
	catch (InterruptedException ex)  
	{  
	System.out.println("The exception has been caught. " + ex);  
	}  
	}  
	}  
}
