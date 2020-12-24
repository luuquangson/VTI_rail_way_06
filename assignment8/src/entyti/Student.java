package entyti;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private float diem;
	
	
	public Student() {
		super();
	}
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", diem=" + diem + "]";
	}
	public Student(int id, String name, float diem) {
		super();
		this.id = id;
		this.name = name;
		this.setDiem(diem);
	}
	public float getDiem() {
		return diem;
	}
	public void setDiem(float diem) {
		this.diem = diem;
	}
	@Override
	public int compareTo(Student other) {
		// sắp xếp các học sinh theo thuộc tính điểm
		if (this.diem > other.diem) {
			return -2;
		} else if (this.diem < other.diem) {
		return 2;
	}
		return 0;
}
	
}