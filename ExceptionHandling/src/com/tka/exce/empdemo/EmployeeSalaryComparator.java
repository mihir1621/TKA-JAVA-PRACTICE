package com.tka.exce.empdemo;

import java.util.Comparator;



public class EmployeeSalaryComparator implements Comparator <Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		Float i1 = o1.salary;
		Float i2 = o2.salary;
		return i1.compareTo(i2) ;
	}
}