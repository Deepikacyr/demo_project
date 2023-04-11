package com.test.oops;

public class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}

	class TestAbstraction1 {
		public void main(String[] args) {
			Shape s = new Circle1();
			s.draw();
		}
	}
}
