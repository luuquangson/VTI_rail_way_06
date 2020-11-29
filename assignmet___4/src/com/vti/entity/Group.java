package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;

public class Group {
	short id;
	String name;
	Account creator;
	Account[] accounts;
	LocalDate createDate;
	String[] usernames;
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", accounts=" + Arrays.toString(accounts)
				+ ", createDate=" + createDate + "]";
	}
	

	Group(String name, Account creator, Account[] accounts, LocalDate createDate) {
		super();
		this.name = name;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}


	Group(String name, Account creator,String[]usernames, LocalDate createDate) {
		super();
		this.name = name;
		this.creator = creator;
		this.setUsernames(usernames);
		this.createDate = createDate;
	}

	
	

	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}


	public String[] getUsernames() {
		return usernames;
	}


	public void setUsernames(String[] usernames) {
		this.usernames = usernames;
	}
	
}




