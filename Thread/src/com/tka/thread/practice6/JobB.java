package com.tka.thread.practice6;

public class JobB extends Thread {
	X b;
	public JobB(X b) {
		super ();
		this.b=b;
	}
	public void run() {
		for(int i=1;i<=1000000;++i)
			b.decrement();
	}
}
