package com.tka.thread.practice6;

public class JobA extends Thread {
	X a;
	public JobA(X a) {
		super();
		this.a=a;

	}
	public void run() {
		for(int i=1;i<=1000000;++i)
			a.increment();
	}

}
