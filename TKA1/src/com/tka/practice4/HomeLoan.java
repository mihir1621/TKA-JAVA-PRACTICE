package com.tka.practice4;

public class HomeLoan extends Loan {
	public double calculateEMI(double principal) {
		int additionTax=200;
		double emi= super.calculateEMI(principal);
		return emi + additionTax;
	}

}
