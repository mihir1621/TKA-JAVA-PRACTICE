package com.tka.thread.practice8;

public class X extends Thread {
	public void run() {
		for(int i=1; i<=10;++i)
			System.out.println(Thread.currentThread().getName()+" "+i);
	}

}
