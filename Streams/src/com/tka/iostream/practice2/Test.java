package com.tka.iostream.practice2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Test {
	public static void main(String[] args) throws IOException {
		Product p1= new Product(12,"Darshan",12);
		Product p2= new Product(13,"Vikas",11);
		Product p3= new Product(14,"Bhushan",13);

		ArrayList<Product> a1 = new ArrayList<Product>();
		a1.add(p1);a1.add(p2);a1.add(p3);

		FileOutputStream fos = new FileOutputStream("target.txt");
		ObjectOutputStream ois= new ObjectOutputStream(fos);
		ois.writeObject(a1);

		System.out.println("-------OK--------");
		System.out.println(fos);

		ois.close();
		fos.close();
	}
}
