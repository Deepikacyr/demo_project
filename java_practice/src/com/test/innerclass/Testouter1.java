package com.test.innerclass;
public class Testouter1 {
static int data=30;  
  static class Inner{  
   void msg(){
	   System.out.println("data is "+data);}  
  }  
  public static void main(String args[]){  
  Testouter1 obj=new Testouter1();  
  obj.msg();  
  }
private void msg() {
	
	
}

}  
