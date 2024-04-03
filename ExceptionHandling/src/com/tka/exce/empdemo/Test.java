package com.tka.exce.empdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(11,"Mihir",120000,"manager");
		Employee e2 = new Employee(12,"Jonny",90000,"tester");
		Employee e3 = new Employee(31,"Push",100000,"developer");
		Employee e4 = new Employee(81,"Palak",120010,"manager");
		Employee e5 = new Employee(98,"Rutvik",1000000,"bar tender");

		ArrayList<Employee>p = new ArrayList<Employee>();
		p.add(e1);
		p.add(e2);     
		p.add(e3);
		p.add(e4);
		p.add(e5);

		ArrayList<Employee> q = new ArrayList<Employee>();
		q.addAll(p);
		Collections.sort(q, new EmployeeSalaryComparator());
		q.forEach(s -> System.out.println(s));


		System.out.println(" ROLE MANAGER");
		for(int i =0;i<p.size();i++) {
			if(p.get(i).getRole().equals("manager")){
				System.out.println(p.get(i));
			}

		}
	}
}
