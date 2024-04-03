package com.tka.practice1;
//Palindrome
public class E {
	public static void main(String[] args) {
		int n =121, sum=0;int t =n;
		while(n>0) {
			int r =n%10;
			n=n/10;
			sum =(sum*10)+r;
		}
		n=t;
		if(n==sum) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not");
		}
	}

}
