package com.tka.practice1;
import java.io.File;
public class Directory {
	public static void main(String[] args) {
		String directoryPath = "inty";
		File directory = new File(directoryPath);
		if(directory.mkdir()) {
			System.out.println("directory create successfully");

		}
		else
			System.out.println("Failed");
	}
}
