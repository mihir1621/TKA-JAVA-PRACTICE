package com.tka.exce.practice2;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;


import com.tka.exce.practice1.Product;

public class Test {
	public static void main(String[] args) {
		Product p1= new Product(11,"Shine", 200000);
		Product p2= new Product(11,"Honda", 400000);
		Product p3= new Product(11,"Activa", 65000);
		Product p4= new Product(11,"Ninja", 890000);
		Product p5= new Product(11,"Supra", 80000);

		HashSet<Product> p= new HashSet<Product>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		System.out.println("1__--------------------------__ Using Enhanced_-----------------__");
		for(Product t:p) {
			System.out.println(t);
		}
		System.out.println("2--------------------------Using Iterator for---------------------------");
		Iterator<Product> itr = p.iterator();
		while(itr.hasNext()) {
			Product t = itr.next();
			System.out.println(t);
		}
		System.out.println("3-------------------------Collection.enumration-----------------------");
		Enumeration<Product> e =  Collections.enumeration(p);
		while(e.hasMoreElements()) {
			Product t = e.nextElement();
			System.out.println(t);
		}
		System.out.println("4------------------------Using Foreach Method-----------------------");
		p.forEach(q->System.out.println(p));
	}

}

