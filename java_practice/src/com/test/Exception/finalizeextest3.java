package com.test.Exception;

public class finalizeextest3 {
	public static void main(String[] args)     
    {     
		finalizeextest3 obj = new finalizeextest3();        
           
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;    
        
        System.gc();     
        System.out.println("End of the garbage collection");     
    }     
   
    protected void finalize()     
    {     
        System.out.println("Called the finalize() method");     
    }     
}    
