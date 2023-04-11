package com.test.features;
interface sayable{  
    void say(String msg);  
}  
public class Functionalinterfaceex1 {
	public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        Functionalinterfaceex1 fie = new Functionalinterfaceex1();  
        fie.say("Hello there");  
    }  
}  
