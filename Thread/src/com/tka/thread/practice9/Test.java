package com.tka.thread.practice9;

public class Test {
	public static void main(String[] args) {
		X x= new X();
		Y y= new Y();
		Z z= new Z();
		
		z.start();
		y.start();
		x.start();
	
//	System.out.println("---------------Exit From Main---------------------");
	}
	
}
