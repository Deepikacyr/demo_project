package com.test.innerclass;

public class Testmemberouter1 {
private int data=30;
class inner{
	void msg()
	{
		System.out.println("data is"+data);
	}
	public void main(String[]args){
	Testmemberouter1 obj=new Testmemberouter1();
	Testmemberouter1.inner in=obj.new inner();
	in.msg();
	
	}
}
}
