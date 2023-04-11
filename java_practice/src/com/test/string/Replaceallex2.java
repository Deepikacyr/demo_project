package com.test.string;

public class Replaceallex2 {
	public static void main(String args[]) {
		String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
		String replaceString = s1.replaceAll("is", "was");
		System.out.println(replaceString);
	}
}