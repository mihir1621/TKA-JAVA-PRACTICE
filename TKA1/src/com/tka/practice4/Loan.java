package com.tka.practice4;

public class Loan {
public double calculateEMI(double principal) {
	double simpleIntrest= (principal*8.5*5)/1000;
	
	return (simpleIntrest + principal)/5;
}
}
