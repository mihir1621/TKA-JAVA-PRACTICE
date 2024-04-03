package com.tka.exce.practice5;

import java.util.Comparator;

public class ProductPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		Float f1 = o1.price;
		Float f2 = o2.price;

		return f1.compareTo(f2);
	}

}