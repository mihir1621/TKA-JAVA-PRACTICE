package com.tka.practice7;

public class A {

	public static void main(String[] args) {
		int count = 0; 	    
		long sum = 0;  
		int num = 2;  

		while (count < 1000) {
			if (isPrime(num)) {
				sum += num;
				count++;
			}
			num++;
		}

		System.out.println("The sum of 1000  prime no is: " + sum);
	}


	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}



