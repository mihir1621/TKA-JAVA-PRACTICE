package com.tka.thread.practice3;

public class Test {
	public static void main(String[] args) {
		X obj = new X();
		for(int i =1;i<=10;++i)
			obj.increment();
		System.out.println(obj.counter);
		
		for(int i =1;i<=1000000;++i)
			obj.decrement();
		System.out.println(obj.counter);
	}
	

}
