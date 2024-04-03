package com.tka.thread.practice9;

public class X extends Thread {
	public void run() {
		for(int i=1;i<=100;++i)
			System.out.println("Even: "+i);
		try {
			Thread.currentThread().sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
 