package com.tka.practice2;

import java.util.ArrayList;

public class TestA {

	public static void main(String[] args) {

		Voter v1= new Voter (11,"Mihir",22 );
		Voter v2 = new Voter (12,"Aman",19 );
		Voter v3= new Voter (13,"Pushpak",18 );

		ArrayList<Voter> nv= new ArrayList<>();

		nv.add(v1);
		nv.add(v2);
		nv.add(v3);

		for(int i = 0;i<nv.size();i++) {

			System.out.println(nv.get(i));
		}
	}

}
