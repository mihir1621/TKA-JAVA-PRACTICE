package com.tka.practice1;

public class A {
	public static void main(String[] args) {
		int n = 12;
		int cnt=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(n+"Prime No");
		}
		else {
			System.out.println(n+" is Not a Prime No");
		}
	}
}
