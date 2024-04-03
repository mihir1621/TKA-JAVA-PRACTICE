package com.tka.map.practice2;

public class Employee {
	int id;
	String name;
	float Salary;
	String Role;
	public Employee(int id, String name, float salary, String role) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Role = role;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", Role=" + Role + "]";
	}
	
	

}
