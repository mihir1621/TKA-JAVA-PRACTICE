package com.tka.thread.practice5;

public class Job1 implements Runnable {
	@Override
	public void run() {
		for(int i =1; i<100;++i)
			if(i%5==0)
				System.out.println(i+" "+Thread.currentThread().getState());
	}

}
