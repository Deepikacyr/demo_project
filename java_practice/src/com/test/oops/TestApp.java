package com.test.oops;

import com.test.basics.HelloWorld;

public class TestApp {

	public static void main(String[] args) {

		Student bean = new Student();
		bean.setName("java");
		
		Bank b = new  Bank();
		b.register(bean);
		//System.out.println(bean.getName());
	}

}
