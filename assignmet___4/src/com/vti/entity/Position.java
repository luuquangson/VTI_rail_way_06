package com.vti.entity;
public class Position {
	short id;
	PositionName name;
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
	public short getId() {
		return id;
	}
	public void setId(short id) {
		this.id = id;
	}
	public PositionName getName() {
		return name;
	}
	public void setName(PositionName name) {
		this.name = name;
	}
	
}
