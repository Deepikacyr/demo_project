package com.test.multitreading;

public class Testshutdownex1 {
	public class TestShutdown2{  
		public void main(String[] args)throws Exception {  
		  
		Runtime r=Runtime.getRuntime();  
		  
		r.addShutdownHook(new Thread(){  
		public void run(){  
		    System.out.println("shut down hook task completed..");  
		    }  
		}  
		);  
		      
		System.out.println("Now main sleeping... press ctrl+c to exit");  
		try{Thread.sleep(3000);}catch (Exception e) {}  
		}  
		}  
}
