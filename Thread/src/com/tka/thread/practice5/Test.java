package com.tka.thread.practice5;

public class Test {
	public static void main(String[] args) {
		Job1 j = new Job1();
		Thread t1= new Thread(j);

		System.out.println(t1.getState());

		t1.start();
		System.out.println(t1.getState());

		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(t1.getState());
	}

}
