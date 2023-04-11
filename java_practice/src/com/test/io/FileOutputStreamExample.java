package com.test.io;

import java.io.FileInputStream;

public class FileOutputStreamExample {
	  public static void main(String args[]){    
          /*try{    
            FileOutputStream fout=new FileOutputStream("C:\\JAVA_PRACTICE\\testout.txt");    
            String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);     
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}    
     }    */
		  
		  try{    
	            FileInputStream fin=new FileInputStream("C:\\JAVA_PRACTICE\\testout.txt");    
	            int i=0;    
	            while((i=fin.read())!=-1){    
	             System.out.print((char)i);    
	            }    
	            fin.close();    
	          }catch(Exception e){System.out.println(e);}    
	         }    
}

