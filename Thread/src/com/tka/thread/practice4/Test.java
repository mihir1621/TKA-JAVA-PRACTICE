package com.tka.thread.practice4;

public class Test {
	public static void main(String[] args) {
		
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		
		
		Job j1= new Job();
		
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j1);
		Thread t3 = new Thread(j1);
		t1.setName("a: "); t2.setName("b: "); t3.setName("c: ");
		
		t2.setPriority(1);
		t1.setPriority(1);
		t3.setPriority(10);
		
//		t1.run();// simple method calling not as 
//		t1.run();// can call multiple times
//		t1.run();// can call multiple times
		
		t1.start();t2.start();t3.start();
		try {
		t1.join();  t2.join();   t3.join();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Exit from Main");
	}

}
