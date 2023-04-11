package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Testsortex1 {
	public static void main(String args[]){  
		  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("Viru");  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Tahir");  
		  
		Collections.sort(al);  
		java.util.Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		}  
		}  
