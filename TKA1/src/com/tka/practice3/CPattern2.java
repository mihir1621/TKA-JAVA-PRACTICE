package com.tka.practice3;

public class CPattern2 {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j = 1;j<=5;j++) {
				if(i<3||j==5) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
