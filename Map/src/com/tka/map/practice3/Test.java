package com.tka.map.practice3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Product p1= new Product(11,"Pen",30);
		Product p2= new Product(12,"Pencil",35);
		Product p3= new Product(13,"Book",40);
		Product p4= new Product(14,"Bag",50);
		Product p5= new Product(15,"Basket",40);

		HashMap<Integer, Product> hmap= new HashMap<Integer, Product>();
//		System.out.println("----------------------------------");
		hmap.put(11, p1);
		hmap.put(12, p2);
		hmap.put(13, p3);

		System.out.println("----------------------------------");
		hmap.keySet().forEach(k->System.out.println(k));

		System.out.println("----------------------------------");
		hmap.values().forEach(v->System.out.println(v));

		System.out.println("----------------------------------");
		Set<Entry<Integer,Product>>entries=hmap.entrySet();
		for(Entry<Integer,Product>entry:entries)
			System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
