package com.tka.practice1;

public class F {
	public static void main(String[] args) {
		int n= 654,sum=0;
		int t=n;
		while(n>0) {
			int r = n%10;
			n=n/10;
			sum= sum+(r*r*r);
		}
		n=t;
		if(n==sum) {
			System.out.print(n + "Armstrong");
		}
		else {
			System.out.print(n + "Not Armstrong");
			}
	}
}
