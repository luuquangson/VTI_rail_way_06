package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	
	public Account(int id, String email, String userName, String firstName, String lastName) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName+ "" +lastName;
	}
	
	public Account(int id, String email, String userName, String firstName, String lastName,Position position) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName+ "" +lastName;
		this.createDate = LocalDate.now();
	}
	
	public Account(int id, String email, String userName, String firstName, String lastName,Position position,LocalDate createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = firstName+ "" +lastName;
		this.createDate = createDate;
	}




	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	public LocalDate getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public Group[] getGroups() {
		return groups;
	}


	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;
	Group[] groups;
	
	
	public Account() {
		
	}


	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}
	}
	

