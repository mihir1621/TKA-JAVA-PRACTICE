package com.tka.thread.practice9;

public class Z extends Thread{
	public void run() {
		while(true) {
			System.out.println("Hello");
			try {
				Thread.currentThread();
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
