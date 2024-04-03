package com.tka.practice1;

public class EvenNoDivi5 {
	
	    public static void main(String[] args) {
	        int[] a = {10, 32, 23, 44, 32, 55, 65, 75, 70, 12};

	        System.out.println("Even numbers divisible by 5:");
	        for (int number : a) {
	            if (number % 2 == 0 &&number % 5 == 0) {
	                System.out.println(number);
	            }
	        }
	    }
	}



