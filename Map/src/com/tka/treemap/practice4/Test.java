package com.tka.treemap.practice4;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

//import com.tka.map.practice3.Product;


public class Test {
	public static void main(String[] args) {
		TreeMap<Integer, String> hmap= new TreeMap<Integer, String>();

		hmap.put(12, "Ashish");
		hmap.put(15, "Shryash");
		hmap.put(11, "Darshan");
		hmap.put(14, "Mihir");
		hmap.put(13, "Pushpak");

		//		System.out.println("----------------------------------");
		hmap.keySet().forEach(k->System.out.println(k));

		System.out.println("----------------------------------");
		hmap.values().forEach(v->System.out.println(v));

		System.out.println("----------------------------------");
		Set<Entry<Integer,String>>entries=hmap.entrySet();
		for(Entry<Integer,String>entry:entries)
			System.out.println(entry.getKey()+" "+entry.getValue());
	}

}
