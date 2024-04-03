package com.tka.practice6;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args, Object product) {
		ArrayList <Product> p = new ArrayList <Product>();

		Customer c = new Customer (11,"Shreyash", "8999760729");
		Product t1 = new Product  (12,"Pen",255.0f);
		Product t2 = new Product  (13,"Books",25.0f);
		Product t3 = new Product  (14,"Bag",250.0f);
		Product t4 = new Product  (15,"Laptop",25555.0f);

		p.add(t1);
		p.add(t2);
		p.add(t3);
		p.add(t4);

		Order o = new Order (1,c,product);
		System.out.println(c.getName()+"your Total Bill is "+o.calTotal()+" ");
		//		System.out.println(+o.calTotal()+"");

	}
}
