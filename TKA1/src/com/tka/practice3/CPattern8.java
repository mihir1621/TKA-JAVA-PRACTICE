package com.tka.practice3;

public class CPattern8 {
	public static void main(String[] args) {
		for(int i =5;i>1;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
					System.out.print(i);
				}else {
					System.out.print(0);
				}
				System.out.println();
			}
		}
	}

}