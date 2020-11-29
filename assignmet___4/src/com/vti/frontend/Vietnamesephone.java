package com.vti.frontend;

public abstract class Vietnamesephone extends phone {
	public Vietnamesephone() {
		name = "hao tuan kiet";
	}	
	@Override
	public void insertContact(String name, int phone) {
		// TODO Auto-generated method stub
		System.out.println("them vao lien he"+ name + "so dien thoai" + phone);
	}
	
	@Override
	public void removeContact(String name) {
		// TODO Auto-generated method stub
	  System.out.println("di chuyen lien he"+ name);	
	}
	@Override
		public void searchContact(String name) {
			// TODO Auto-generated method stub
	 System.out.println("tim lien he" + name);		
		}
	@Override
	public void updateContact(String name, int newPhone) {
		// TODO Auto-generated method stub
	System.out.println("them moi" + name + "so dien thoai"+ newPhone);	
	}
}

