package com.vti.frontend;

public abstract class User {
	String name;
	double salary_ratio;
	@Override
	public String toString() {
		return "User [name=" + name + ", salary_ratio=" + salary_ratio + "]";
	}
	User(String name, double salary_ratio) {
		super();
		this.name = name;
		this.salary_ratio = salary_ratio;
	}
	public abstract double calculatePay();
		double pay;
	public void displayInfor() {
		System.out.println("name" + name);
		System.out.println("salary" + salary_ratio);
		System.out.println("tien luong" + pay);
}   
}	
	
	
	