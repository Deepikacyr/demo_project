package com.test.oops;

public class statickeyword {
	int rollno;
	   String name;  
	   static String college ="ITS";
	  
	   statickeyword(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   
	   void display (){System.out.println(rollno+" "+name+" "+college);}    
	 public static void main(String args[]){  
	 statickeyword s1 = new statickeyword(111,"Karan");  
	 statickeyword s2 = new statickeyword(222,"Aryan");  
	 s1.display();  
	 s2.display();  
	 }  
	}  
