package com.tka.practice1;

public class H {
	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("");
			}
			for(int k =1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
