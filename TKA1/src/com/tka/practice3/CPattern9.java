package com.tka.practice3;

public class CPattern9 {
	public static void main(String[] args) {
		for(int i= 2;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.println(1);
				}
				else {
					System.out.print(0);
				}
				System.out.println();
			}
		}
	}
}
