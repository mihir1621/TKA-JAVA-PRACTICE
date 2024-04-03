package com.tka.exce.practice2;

public class Product {
	int pid;
	String pname;
	float pprice;
	public Product() {

	}
	public Product(int id, String name, float price) {
		super();
		this.pid = id;
		this.pname = name;
		this.pprice = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + pid + ", name=" + pname + ", price=" + pprice + "]";
	}


}
