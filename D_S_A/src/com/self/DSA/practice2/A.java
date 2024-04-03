package com.self.DSA.practice2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {

		//		First Problem
		//		Scanner sc = new Scanner(System.in);	
		//		int age = sc.nextInt();
		//		if(age>18) {
		//			System.out.println("Adult");
		//		}else {
		//			System.err.println("Not Adult");
		//		}

		//		Second Problem
		//		Scanner sc = new Scanner(System.in);
		//		int x = sc.nextInt();
		//		if(x % 2 == 0) {
		//			System.out.println("Even");	
		//		}else {
		//			System.out.println("Odd");
		//		}

		//Third Problem

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a==b) {
			System.out.println("Equal");
		}
		//		else {
		//			if(a>b) {
		//				System.out.println("a is Greater");
		//			}

		else if(a>b) {
			System.out.println("a is Greater");
		}
		else {
			System.out.println("a is lesser");
		}

	}
}
//}