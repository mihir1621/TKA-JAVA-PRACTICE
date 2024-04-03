package com.tka.map.practice3;

public class Product {
int id;
String name;
float Price;
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", Price=" + Price + "]";
}
public Product(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	Price = price;
}


}
