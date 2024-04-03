package com.tka.thread.practice9;

public class Y extends Thread{

	public void run() {
		for(int i=1;i<100;++i)
			if(i%2!= 0) {
				System.out.println("Odd: "+i);
				try {
					Thread.currentThread().sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
	}
}
