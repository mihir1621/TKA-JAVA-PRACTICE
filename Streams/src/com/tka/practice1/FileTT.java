package com.tka.practice1;

import java.io.File;

public class FileTT {
	public static void main(String[] args) {
		File f= new File("aa/bbb/ccc");
		f.mkdirs();
		System.out.println("Directory are created");
	}

}
