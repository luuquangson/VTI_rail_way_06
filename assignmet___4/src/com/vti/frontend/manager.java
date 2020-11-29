package com.vti.frontend;

public abstract class manager extends User {

	manager(String name, double salary_ratio) {
		super(name, salary_ratio);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calculatePay() {
	return salary_ratio * 120 ;
	}
}
