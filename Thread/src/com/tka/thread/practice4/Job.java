package com.tka.thread.practice4;

public class Job  implements Runnable{
	@Override
	public void run() {
		
		for(int i=0;i<10;++i) {
			System.out.println(Thread.currentThread().getName()+" "+i+": Hello");
			try {
			Thread.currentThread().sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
