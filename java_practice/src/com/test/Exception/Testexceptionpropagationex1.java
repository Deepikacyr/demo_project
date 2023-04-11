package com.test.Exception;

public class Testexceptionpropagationex1 {
	class TestExceptionPropagation1{  
		  void m(){  
		    int data=50/0;  
		  }  
		  void n(){  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handled");}  
		  }  
		  public void main(String args[]){  
		   TestExceptionPropagation1 obj=new TestExceptionPropagation1();  
		   obj.p();  
		   System.out.println("normal flow...");  
		  }  
		}  
}
