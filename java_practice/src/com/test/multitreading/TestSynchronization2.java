package com.test.multitreading;

public class TestSynchronization2 {
	public static void main(String args[]) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}

class Table4 {
	synchronized void printTable(int n) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread6 extends Thread {
	Table t;

	MyThread6(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread7 extends Thread {
	
		Table t;
		MyThread7(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}
