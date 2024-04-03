package com.tka.practice6;

import java.util.ArrayList;

public class Order {
	int id;
	Customer c;
	ArrayList<Product> list;
	
	public Order(int id, Customer c, ArrayList<Product> list) {
		super();
		this.id = id;
		this.c = c;
		this.list = list;
	}

	public Order(int id2, Customer c2, Object product) {
		// TODO Auto-generated constructor stub
	}

	float calTotal() {
		float totalbill= 0.0f;
		for(int i= 0; i<list.size();++i) {
			Product t = list.get(i);
			totalbill= calTotal()+ t.price;
		}
		return totalbill;
	}
	

}
