package com.tka.iostream.practice3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//import javax.imageio.stream.FileCacheImageInputStream;

public class ReadCode {
public static void main(String[] args)
	throws IOException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("target.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Object obj = ois.readObject();
	ArrayList <Student > temp = (ArrayList<Student>)obj;	
	temp.forEach(s->System.out.println(s));
	}
}

