package com.test.Exception;

public class Trycatchex4 {
	public static void main(String[]args){
		int i=20;
		int j=10;
		int data;
		try{
			data=i/j;
		}catch(Exception e)
		{
			System.out.println(i/(j+2));
		}
	}

}
