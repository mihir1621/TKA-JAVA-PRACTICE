package com.tka.practice2;

public class TestC {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		int  r = i.intValue();
		i = new Integer(r);
		System.out.println(i);
	}

}
