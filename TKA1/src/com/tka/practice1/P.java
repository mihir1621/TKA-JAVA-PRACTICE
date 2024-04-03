package com.tka.practice1;

public class P {
	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		int b[]= new int [a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("Print");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
