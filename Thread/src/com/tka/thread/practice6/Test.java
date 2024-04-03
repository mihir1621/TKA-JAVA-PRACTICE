package com.tka.thread.practice6;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		X x = new X();
		JobA ja = new JobA(x);
		JobB jb = new JobB(x);
		
		ja.start();
		jb.start();
		ja.join();
		jb.join();
		System.out.println(x.counter);
	}

}
