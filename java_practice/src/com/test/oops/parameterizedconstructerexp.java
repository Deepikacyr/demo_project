package com.test.oops;

public class parameterizedconstructerexp {  
	    int id;  
	    String name;  
	     parameterizedconstructerexp(int i,String n)
	    {  
	    id = i;  
	    name = n;  
	    }  
	      void display(){System.out.println(id+" "+name);
	    }  
	    public static void main(String args[]){  
	   parameterizedconstructerexp s1 = new parameterizedconstructerexp(111,"Karan");  
	   parameterizedconstructerexp s2 = new parameterizedconstructerexp(222,"Aryan");  
	    s1.display();  
	    s2.display();  
	   }  
	}  
