package com.tka.exce.practice5;

public class Product implements Comparable<Product>{
	int id;
	String name;
	float price;
	public Product() {

	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
//	@Override
//	public int compareTo(Product o) {
//		Product p1 = this;
//		Product p2= o;
//		if(p1.id>p2.id)
//			return 1;
//		else if(p2.id>p1.id)
//			return -1;
//		else 
//			return 0;
//	}
	@Override
	public int compareTo(Product o) {
	Integer i1= this.id;
	Integer i2=o.id;
	return i1.compareTo(i2);
	
	
	
	}
}
