package com.self.DSA.practice2;
import java.util.*;
public class B {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();

		//		Problem solving type 1
		//		if(button ==1) {
		//			System.out.println("Hello");
		//		}
		//		else if(button ==2) {
		//			System.out.println("Namaste");
		//		}
		//		else if(button ==3) {
		//			System.out.println("Bonjour");
		//		}
		//		else {
		//			System.out.println("Invalid Button Clicked");
		//		}

		//		Problem solving type 2

		switch(button) {
		case 1: 
			System.out.println("Hello");
			break;
		case 2: 
			System.out.println("Namaste");
			break;
		case 3: 
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("Invalid Button Clicked");
		}

	}

}
