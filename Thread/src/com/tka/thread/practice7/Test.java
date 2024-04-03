package com.tka.thread.practice7;

public class Test {
	public static void main(String[] args) {

		X x1= new X();
		Thread t1= new Thread(x1);
		Thread t2= new Thread(x1);
		Thread t3= new Thread(x1);

		X x2= new X();
		Thread t4= new Thread(x2);
		Thread t5= new Thread(x2);

		t1.setName("t1: ");
		t2.setName("t2: ");
		t3.setName("t3: ");
		t4.setName("t4: "); 
		t5.setName("t5: ");

		t1.start();
		t2.start();
		t3.start();
		t4.start(); 
		t5.start();

		try {
			t1.join();
			t2.join(); 
			t3.join(); 
			t4.join(); 
			t5.join();

		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-----------------Exit from Main---------------------");
	}
}
