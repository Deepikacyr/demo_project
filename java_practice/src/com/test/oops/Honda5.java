package com.test.oops;

public class Honda5 extends Bike1 {

	public static void main(String[] args) {
		Honda5 obj = new Honda5();
		obj.run();
	}

	@Override
	void run() {
		System.out.println("bike is running...");
		
	}

}
