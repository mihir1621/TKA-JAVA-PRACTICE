package com.tka.exce.practice4;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;


import com.tka.exce.practice1.Product;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1= new Product(11,"Shine", 200000);
		Product p2= new Product(12,"Honda", 400000);
		Product p3= new Product(13,"Activa", 65000);
		Product p4= new Product(14,"Ninja", 890000);
		Product p5= new Product(15,"Supra", 80000);

		LinkedHashSet<Product> p = new LinkedHashSet();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);

		//		p.remove(p3);yes
		//		p.clear();yes
		//		System.out.println(p.contains(p5));yes

		System.out.println("1-----------------Using Enhanced -------------------");
		for(Product t:p) {
			System.out.println(t);
		}System.out.println("                                                                    ");
		System.out.println("2---------------Using Iterator for--------------");

		Iterator<Product> itr= p.iterator();
		while(itr.hasNext()) {
			Product t  = itr.next();
			System.out.println(t);
		}
		System.out.println("3-------------------Collection .enumaration---------------------");
		Enumeration<Product> e =  Collections.enumeration(p);
		while(e.hasMoreElements()) {
			Product t = e.nextElement();
			System.out.println(t);
		}
		System.out.println("4------------------------Using Foreach Method-----------------------");
		p.forEach(System.out::println);

	}
}


