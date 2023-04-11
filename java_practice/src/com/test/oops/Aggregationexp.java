package com.test.oops;

public class Aggregationexp {
	int square(int n)
	{  
return n*n;  
		 }  
		}  
		  class Circle{  
		 Aggregationexp A; 
		 double pi=3.14;  
		    double area(int radius){  
		   A=new Aggregationexp();  
		   int rsquare=A.square(radius);
		   return pi*rsquare;  
		 }  
		  public static void main(String args[]){  
		   Circle c=new Circle();  
		   double result=c.area(5);  
		   System.out.println(result);  
		 }  
		}  
