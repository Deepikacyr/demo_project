package com.test.ctrlstmts;

public class patternprex4 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--){
			for(int j=5;j>i;j--){
				System.out.println(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
