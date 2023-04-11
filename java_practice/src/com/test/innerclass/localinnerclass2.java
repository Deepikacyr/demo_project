package com.test.innerclass;

public class localinnerclass2 {
	private int data=30;
	 void display(){  
	  int value=50;
	  class Local{  
	   void msg(){
		   System.out.println(value);}  
	  }  
	  Local l=new Local();  
	  l.msg();  
	 }  
	 public static void main(String args[]){  
	  localinnerclass2 obj=new localinnerclass2();  
	  obj.display();  
	 }  
	}  
