package com.test.Exception;

import java.io.IOException;

public class Testexceptionpropagationex2 {
	class TestExceptionPropagation2{  
		  void m() throws IOException{  
		    throw new java.io.IOException("device error");//checked exception  
		  }  
		  void n() throws IOException{  
		    m();  
		  }  
		  void p(){  
		   try{  
		    n();  
		   }catch(Exception e){System.out.println("exception handeled");}  
		  }  
		  public void main(String args[]){  
		   TestExceptionPropagation2 obj=new TestExceptionPropagation2();  
		   obj.p();  
		   System.out.println("normal flow");  
		  }  
		}  
}
