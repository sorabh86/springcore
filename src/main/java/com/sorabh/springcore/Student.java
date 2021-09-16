package com.sorabh.springcore;

public class Student {
	private int id;
	private String name;
	private String address;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public Student() {
		super();
		System.out.println("Default constructer: "+this.name);
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		System.out.println("Param constructer: "+this.name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setid: "+id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setname: "+name);
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		System.out.println("setaddress: "+address);
		this.address = address;
	}
}
