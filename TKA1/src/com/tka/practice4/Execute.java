package com.tka.practice4;

public class Execute {

	public static void main(String[] args) {
		Loan l = new HomeLoan();
		double HomeLoan = l.calculateEMI(2000000);
		
		System.out.println(HomeLoan);
	}
}
