package com.tka.practice1;
//Sum of digit
public class C {
	public static void main(String[] args) {
		int n=125,r,sum=0;
		while(n>0) {
			r=n%10;
			n=n%10;
			sum =sum+r;
		}
		System.out.println("Sum of Digit-->"+sum);
	}
}
