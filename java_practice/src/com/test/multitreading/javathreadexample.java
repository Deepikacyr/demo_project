package com.test.multitreading;

public class javathreadexample {
	class Multi extends Thread{  
		public void run(){  
		System.out.println("thread is running...");  
		}  
		public void main(String args[]){  
		Multi t1=new Multi();  
		t1.start();  
		 }  
		}  
}
