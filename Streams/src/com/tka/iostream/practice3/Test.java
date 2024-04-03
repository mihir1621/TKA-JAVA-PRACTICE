package com.tka.iostream.practice3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args)throws IOException {
		Student s1= new Student (12,"Bhushan","ME");
		Student s2= new Student (13,"Mihir","MCA");
		Student s3= new Student (14,"Vikas","BCA");
		
		ArrayList<Student> a1= new ArrayList<Student>();
		a1.add(s1);
		a1.add(s3);
		a1.add(s2);
		
		FileOutputStream fos = new FileOutputStream("target.txt");
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		ois.writeObject(a1);
		
		System.out.println("-----------------------");
		ois.close();
		fos.close();
		
	}

}
