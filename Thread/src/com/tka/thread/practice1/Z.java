package com.tka.thread.practice1;

public class Z  extends Thread {
	void m3() {
		while(true) {

			System.out.println(" Hello");
			try {
				Thread.currentThread().sleep(1000);
	}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}




