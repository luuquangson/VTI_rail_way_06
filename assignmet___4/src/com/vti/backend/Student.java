package com.vti.backend;

public class Student {
	private int properti_Id;
	private String name;
	private String hometown;
	private float diem_hoc_luc;
	private String grade;
	@Override
	public String toString() {
		if (diem_hoc_luc < 4.0) {
			setGrade("Yếu");
		} else if (diem_hoc_luc < 6) {
			setGrade("Trung bình");
		} else if (diem_hoc_luc < 8) {
			setGrade("Khá");
		} else {
			setGrade("Giỏi");
		}
		return "Student [properti_Id=" + properti_Id + ", name=" + name + ", hometown=" + hometown + ", diem_hoc_luc="
				+ diem_hoc_luc,Xeploai= + setGrade + "]"  ;
	}
	Student( String name, String hometown) {
		super();
		this.name = name;
		this.hometown = hometown;
		this.diem_hoc_luc =0;
	}
	public int getProperti_Id() {
		return properti_Id;
	}
	public void setProperti_Id(int properti_Id) {
		this.properti_Id = properti_Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	public float getDiem_hoc_luc() {
		return diem_hoc_luc;
	}
	public void setDiem_hoc_luc(float diem_hoc_luc) {
		this.diem_hoc_luc = diem_hoc_luc;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	} 
	
	

	
	

}
