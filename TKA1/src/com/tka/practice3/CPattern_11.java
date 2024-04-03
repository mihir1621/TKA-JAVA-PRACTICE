package com.tka.practice3;

public class CPattern_11 {
	public static void main(String[] args) {
		for(int i =1;i<=5;i++) {
			for(int j =1;j<=5;j++) {
				if(i>j && i!=2) {
					for(int p= 1;p<=i;p++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}

}
