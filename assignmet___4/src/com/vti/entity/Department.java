package com.vti.entity;
public class Department {
	byte id;
	String name;
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
		
	}
	Department(byte id, String name) {
		super();
		this.id = 0;
		this.name = name;
	}
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
