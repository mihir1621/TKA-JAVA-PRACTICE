package com.tka.practice1;

public class M {
	public static void main(String[] args) {
		
		        int limit = 100; // Change this to the limit you want to check up to
		        
		        for (int l = 2; l <= limit; l++) {
		            int i;
		            for (i = 2; i <= Math.sqrt(l); i++) {
		                if (l % i == 0) {
		                    break;
		                }
		            }
		            
		            if (i > Math.sqrt(l)) {
		                System.out.println(l);
		            } else {
		                System.out.println();
		            }
		        }
	}
}
