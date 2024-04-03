package com.tka.iostream.practice2;

import java.io.Serializable;

public class Product implements Serializable {
	int id;
	String name;
	transient double price;
	
	public Product() {
		
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	

}
