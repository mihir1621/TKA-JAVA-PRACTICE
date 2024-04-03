package com.tka.practice6;

public class Customer {
	int id;
	String name;
	String PhoneNo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", PhoneNo=" + PhoneNo + "]";
	}
	public Customer(int id, String name, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		PhoneNo = phoneNo;
	}
	

}
