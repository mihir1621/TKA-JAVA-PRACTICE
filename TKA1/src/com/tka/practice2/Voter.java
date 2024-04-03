package com.tka.practice2;

public class Voter {
	int id;
	String name;
	int age;
	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Voter(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
