package com.tka.map.practice1;

import java.util.Collection;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String > hmap= new HashMap<Integer, String>();
		hmap.put(11, "Mihir Chaudhari");
		hmap.put(12, "Darshan Rewatkar");
		hmap.put(13, "Shreyash Dhage");
		hmap.put(12, "Pushpak Chaudhari");
		hmap.put(12, "Vishal Shinde");

		System.out.println(hmap.size());
		System.out.println("------------------------------------------");
		Set<Integer> keys=hmap.keySet();
		for(Integer t : keys)
			System.out.println(t);

		System.out.println("----------------------------------------------");
		Set<Entry<Integer,String>> values = hmap.entrySet();
		for(Entry<Integer, String> s: values)
			System.out.println(s);

		System.out.println("--------------------------------------------");
		Collection<String> e = hmap.values();
		for(String t :e)
			System.out.println(t);

		System.out.println("--------------------------------------------------");

		Set<Entry<Integer,String>> entries = hmap.entrySet();
		for(Entry<Integer, String>entry:entries)
			System.out.println(entry.getKey()+" "+ entry.getValue());

		System.out.println("-----------------------------------------------");
		hmap.forEach((k,v)->System.out.println(k+" "+v));
	}
}
