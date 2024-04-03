package com.tka.thread.practice8;

public class Test {
	public static void main(String[] args) {


		X x1= new X ();
		Thread t1 = new Thread(x1);
		Thread t2 = new Thread(x1);
		Thread t3 = new Thread(x1);

		t1.setName("First: ");
		t2.setName("Second: ");
		t3.setName("Third: ");

		t1.start();
		t2.start();
		t3.start();

	}
}
