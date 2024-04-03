package com.tka.map.practice2;

import java.util.HashMap;
import java.util.Collection;
import java.util.Set;


public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(12,"Mihir",450000,"Developer");
		Employee e2= new Employee(15,"Praful",250000,"Developer");
		Employee e3 = new Employee(14,"Darshan",300000,"Developer");
		Employee e4 = new Employee(11,"Shreyash",350000,"Developer");
		Employee e5 = new Employee(13,"Amit",400000,"Developer");

		HashMap<Integer, Employee > hmap= new HashMap<Integer, Employee>();
		hmap.put(12, e1);
		hmap.put(11, e2);
		hmap.put(13, e3);

		Set<Integer> key= hmap.keySet();
		for(Integer t: key)
			System.out.println(t);

		System.out.println("----------------------------------------------");
		Collection<Employee> values = hmap.values();
		for(Employee s :values)
			System.out.println(s);

		System.out.println("----------------------------------------------");
		hmap.keySet().forEach(k->System.out.println(k));

		System.out.println("----------------------------------------------");
		hmap.values().forEach(v->System.out.println(v));

		System.out.println("----------------------------------------------");
		hmap.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));

	}
}
