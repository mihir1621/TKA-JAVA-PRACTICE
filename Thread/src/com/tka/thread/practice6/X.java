package com.tka.thread.practice6;

public class X {
	int counter =0;

	synchronized void increment() {
		counter =counter +1;
	}

	synchronized void decrement() {
		counter =counter -1;
	}

}
