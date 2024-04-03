package com.tka.practice5;

public class FindLargest {
	public static void main(String[] args) {
		int a= 100;
		int b= 101;
	}
	int FindLargestNo(int a, int b) {
		int Largest = a;

		if(b>a) {
			Largest= b;
		}
		else {
			Largest= a;
		}
		return Largest;

	}
}
