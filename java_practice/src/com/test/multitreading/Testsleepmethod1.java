package com.test.multitreading;

public class Testsleepmethod1 {
	public void run(){    
		  for(int i=1;i<5;i++){   
		  
		    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}    
		    System.out.println(i);    
		  }    
		 }    
		 public static void main(String args[]){    
		  Testsleepmethod1 t1=new Testsleepmethod1();    
		  Testsleepmethod1 t2=new Testsleepmethod1();    
		     
		  t1.start();    
		  t2.start();   
		 }
		private void start() {
			
		}
}