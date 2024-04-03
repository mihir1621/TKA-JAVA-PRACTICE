package com.tka.thread.practice2;

public class Job2 {
	public static void main(String[] args) {


		Job1 j1= new Job1();
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j1);
		Thread t3 = new Thread(j1);

		Job1 j2= new Job1();
		Thread t4 = new Thread(j2);
		Thread t5 = new Thread(j2);

		t1.setName("t1:");
		t2.setName("t2:");
		t3.setName("t3:");
		t4.setName("t4:");
		t5.setName("t5:");

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
		}catch(InterruptedException e) {
			e.printStackTrace();
		}


		System.out.println("-----------------Exit From Main---------------------");
	}		

}
