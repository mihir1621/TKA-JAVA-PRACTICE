package com.tka.practice1;

public class B {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c;
		System.out.println(a+" "+b+" ");
		for(int i =1;i<=5;i++) {
			c=a+b;
			System.out.println(c+" ");
			a=b;
			b=c;
		}
	}

}
