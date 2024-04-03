package com.tka.exce.practice5;

import java.util.Comparator;

public class ProductNameComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		String i1 = o1.name;
		String i2 = o2.name;
		return i1.compareTo(i2) ;
	}
}
