package com.tka.thread.practice2;

public class Test {
	public static void main(String[] args) {
		Job j1 = new Job();
		Job j2 = new Job();
		Job j3 = new Job();

		j1.start();
		j2.start();
		j3.start();

	}

}
