package com.vti.frontend;

public abstract class phone {
		 String [] contact;
		 int number;
		 String name;
		
	public abstract void insertContact(String name, int phone);

	public abstract void removeContact(String name);

	public abstract void updateContact(String name, int newPhone);

	public abstract void searchContact(String name);

	public String[] getContacts() {
	return getContacts();
	}

	public String[] getContact() {
		return contact;
	}

	public void setContact(String[] contact) {
		this.contact = contact;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
