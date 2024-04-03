package com.tka.exce.empdemo;

public class Employee {
	int id;
	String name;
	float salary;
	String role;
	public Employee(int id, String name, float salary, String role) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", role=" + role + "]";
	}



}
