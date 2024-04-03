package com.tka.practice1;

public class D {
	public static void main(String[] args) {
		int n =12345, sum=0;
		while(n>0) {
			int r=n%10;
			n=n/10;
			sum=(sum*10)+r;
		}
		System.out.println("Reverse=>"+sum);
	}

}
