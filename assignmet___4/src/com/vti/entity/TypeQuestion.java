package com.vti.entity;
public class TypeQuestion {
	byte id;
	TypeName name;
	@Override
	public String toString() {
		return "TypeQuestion [id=" + id + ", name=" + name + "]";
	}
	public byte getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public TypeName getName() {
		return name;
	}
	
	public void setName(TypeName name) {
		this.name = name;
	}
	
	
}
