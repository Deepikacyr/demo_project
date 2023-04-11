package com.test.innerclass;

public class localinnerclass {
	private int data=30; 
	 void display(){  
	  class Local{  
	   void msg(){
		   System.out.println(data);
		   }  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  localinnerclass obj=new localinnerclass();  
	  obj.display();  
	 }  
	}  
