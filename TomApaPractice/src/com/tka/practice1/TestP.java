package com.tka.practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//import com.tka.practice6.Product;

public class TestP {
	public static void main(String[] args) {

		Product t1 = new Product  (12,"Pen",255.0f, "Stationary");
		Product t2 = new Product  (11,"Milk",25.0f,"Dairy");
		Product t3 = new Product  (14,"Kachori",250.0f, "Grocery");
		Product t4 = new Product  (13,"Laptop",25555.0f,"College");
		Product t5 = new Product  (15,"Earphones",255.0f,"Accesories");

		List<Product>pt=Arrays.asList(t1,t2,t3,t4,t5);
		List<Product>SortedbyUsingComparatorOnPrice;
		SortedbyUsingComparatorOnPrice=pt.stream().sorted(Comparator.comparing(p->p.id)).collect(Collectors.toList());	
		SortedbyUsingComparatorOnPrice.forEach(System.out::println);

				System.out.println("-----------------------------------------------------------------------");
				List<Product> ProductListWithDiscount;	
				ProductListWithDiscount= pt.stream().map(p->{p.price= (float)(p.price*0.9); return p;}).collect(Collectors.toList());
				ProductListWithDiscount.forEach(System.out::println);

	}

}
