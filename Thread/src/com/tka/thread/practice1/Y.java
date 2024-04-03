package com.tka.thread.practice1;

public class Y  extends Thread {
	void m2() {
		for(int i = 0;i<100;++i)
			if(i%2!=0) {
			System.out.println("Odd"+i);	
	
	}
	try {
		Thread.currentThread().sleep(1000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
}
