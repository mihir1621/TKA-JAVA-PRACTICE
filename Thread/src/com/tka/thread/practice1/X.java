package com.tka.thread.practice1;

public class X extends Thread {
	void m1() {
		for(int i = 0;i<100;++i)
			if(i%2==0) {
			System.out.println("Even"+i);	
		
	}
	try {
		Thread.currentThread().sleep(1000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
