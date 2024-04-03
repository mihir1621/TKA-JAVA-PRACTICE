package com.tka.iostream.practice1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Test1 {
	public static void main(String[] args)throws IOException {
		String s ="GoodMorning";
		FileOutputStream fos = new FileOutputStream(s);
		fos.write(s.getBytes());
		System.out.println("data is written n: ");


		File file = new File("Source.txt");
		FileInputStream fis= new FileInputStream(file);
		byte[] data = new byte[(int )file.length()];
		fis.read(data);

		FileOutputStream fos1 = new FileOutputStream("target.txt");
		fos1.write(data);

		fis.close();
		fos1.close();
		System.out.println("Data is written n: ");

		BufferedReader buf= new BufferedReader (new FileReader("source.txt"));
		BufferedWriter bud= new BufferedWriter (new FileWriter("target.txt"));
		String s1 = null;
		while((s1 =buf.readLine())!= null) {
			bud.write(s1);
		}
		System.out.println("Data is Written in Disk");
		buf.close();
		bud.close();
	}

}
