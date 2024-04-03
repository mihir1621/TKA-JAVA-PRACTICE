package com.tka.exce.practice5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Product p1 = new Product(14, "Shine", 35000);
		Product p2 = new Product(15, "Honda", 45000);
		Product p3 = new Product(13, "Activa", 65000);
		Product p4 = new Product(11, "Ninja", 55000);
		Product p5 = new Product(12, "Supra", 75000);

		TreeSet<Product> p = new TreeSet<Product>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		//	 p.remove(p3);yes
		// p.clear(); yes
		// System.out.println(p.contains(p4));yes

		System.out.println("-----------------------sorted by name using comparator-------------------------");
		ArrayList<Product> q = new ArrayList<Product>();
		q.addAll(p);
		Collections.sort(q, new ProductNameComparator());
		q.forEach(s -> System.out.println(s));

		System.out.println("-----------------sorted by price using comparator---------------------");
		ProductPriceComparator ppc = new ProductPriceComparator();

		Collections.sort(q, ppc);
		q.forEach(s -> System.out.println(s));

		//		System.out.println("2-------------Using Iterator--------------");
		//		Iterator<Product> itr= p.iterator();
		//		while(itr.hasNext()) {
		//			Product t= itr.next();
		//			System.out.println(t);
		//		}
		//		System.out.println("3-------------ForEach-------------");
		//		p.forEach(q->System.out.println(p));
		//		System.out.println("4---------------Collection.enumration------------------");
		//		Enumeration<Product> e =  Collections.enumeration(p);
		//		while(e.hasMoreElements());
		//		System.out.println(p);
	}
}
