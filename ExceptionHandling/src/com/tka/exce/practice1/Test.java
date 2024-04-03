package com.tka.exce.practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {
	public static void main(String[] args) {
		Product p1= new Product(11,"Book", 20);
		Product p2= new Product(12,"pen", 30);
		Product p3= new Product(13,"bag", 25);
		Product p4= new Product(14,"pencil", 15);
		Product p5= new Product(15,"marker", 10);

		ArrayList<Product>productL= new ArrayList<Product>();

		productL.add(p1);productL.add(p2);productL.add(p3);productL.add(p4);productL.add(p5);

		//		productL.clear();
		//
		//		for(int i=0;i<productL.size();++i) {
		//			System.out.println(productL.get(i));
		//			System.out.println("--------------------------------------");
		//
		//			System.out.println(productL.contains(p1));
		//		}
		//		productL.add(1,p4);
		//		for(int i=0;i<productL.size();++i) {
		//			System.out.println(productL.get(i));
		//			System.out.println("------------------------------------");
		//		}

		System.out.println("1---------------Using Simple for---------------------------");
		for(int i =0;i<productL.size();++i) {
			System.out.println(productL.get(i));
		}

		System.out.println("2-------------------------- Using Enhanced-----------------");
		for(Product t:productL) {
			System.out.println(t);
		}
		System.out.println("3--------------------------Using Iterator for---------------------------");
		Iterator<Product> itr = productL.iterator();
		while(itr.hasNext()) {
			Product t = itr.next();

			System.out.println(t);
		}
		System.out.println("4------------------ Using ListIterator forward----------------------------------");
		ListIterator<Product> litr = productL.listIterator();
		while(litr.hasNext()) {
			Product t = litr.next();
			System.out.println(t);
		}
		System.out.println("5------------------ Using ListIterator previous----------------------------------");
		while(litr.hasPrevious()) {
			Product t = litr.previous();
			System.out.println(t);

		}
		System.out.println("6-------------------------Collection.enumration-----------------------");
		Enumeration<Product> e =  Collections.enumeration(productL);
		while(e.hasMoreElements()) {
			Product t = e.nextElement();
			System.out.println(t);
		}
		System.out.println("7-------------------------Using Foreach Method-----------------------");
		productL.forEach(p->System.out.println(p));
	}

}

