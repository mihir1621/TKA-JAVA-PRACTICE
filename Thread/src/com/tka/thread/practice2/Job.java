package com.tka.thread.practice2;

public class Job extends Thread {
	@Override
	public void run() {
		for(int i =1;i<100;i++) {
			if(i%2==0)
				System.out.println("Even Numbers"+i);
		}
		try {
			Thread.currentThread();
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		for(int i =1;i<100;i++) {
			if(i%2==0)
				System.out.println(i);
		}
	}

}
