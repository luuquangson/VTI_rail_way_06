package entity;

import backend.Istudent;

public abstract  class student2  extends Istudent {
	int id;
	String name;
	int group;
	
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

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public void diemdanh() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "diem danh");
		
	}
	
	public void hocbai() {
		// TODO Auto-generated method stub
		System.out.println(this.name + "dang hoc bai");
		
	
	}
	public void didonvesinh() {
		// TODO Auto-generated method stub
		System.out.println(this.name+"di don ve sinh");
		
	
	}

	public student2(int id, String name, int group) {
		super();
		this.id = id;
		this.name = name;
		this.group = group;
	}
	

}
