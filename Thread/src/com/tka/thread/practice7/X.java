package com.tka.thread.practice7;

public class X implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=10;++i)
			System.out.println(Thread.currentThread().getName());
	}
}
