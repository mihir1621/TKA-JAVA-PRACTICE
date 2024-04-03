package com.tka.exce.practice3;

import java.util.Collections;
import java.util.Enumeration;                
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


import com.tka.exce.practice1.Product;

public class Test {
	public static void main(String[] args) {
		Product p1= new Product(11,"Shine", 200000);
		Product p2= new Product(12,"Honda", 400000);
		Product p3= new Product(13,"Activa", 65000);
		Product p4= new Product(14,"Ninja", 890000);
		Product p5= new Product(15,"Supra", 80000);

		LinkedList<Product> p= new LinkedList<Product>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);

		//			p.remove(p3);// yes it works
		//			p.clear();//yes it works
		//			p.add(2, p4); //yes it works
		//			System.out.println(p.contains(p1));// yes it works

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
		p.forEach(System.out::println);

		System.out.println("5------------------ Using ListIterator forward----------------------------------");
		ListIterator<Product> litr = p.listIterator();
		while(litr.hasNext()) {
			Product t = litr.next();
			System.out.println(t);

		}
		System.out.println("6------------------ Using ListIterator previous----------------------------------");
		while(litr.hasPrevious()) {
			Product t = litr.previous();
			System.out.println(t);}
		System.out.println("7-------------------------Collection.enumration-----------------------");
		Enumeration<Product> r =  Collections.enumeration(p);
		while(r.hasMoreElements()) {
			Product t = r.nextElement();
			System.out.println(t);
		}
		System.out.println("8----------------Usiing Simple for--------------");
		for(int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
	}
}
