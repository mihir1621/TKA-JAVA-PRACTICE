package com.tka.practice1;

public class S {

	public static void main(String[] args) {
		int [] numbers= {1,2,3,4,5};
		int count = countNumbers(numbers);
		System.out.println("Count: "+count);
	}

	private static int countNumbers(int[] numbers) {
	int count=0;
	for(var num:numbers) {
		count++;
	}
		return count;
	}
}
