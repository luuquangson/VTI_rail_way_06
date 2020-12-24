package entity;

public class Student {
	public static int count = 0;
	public static String classs = "railway06";

	public static void phuongthuc1() {
		System.out.println("phuongthuc1");
	}

	public String Name;
	public String Gender;

	public static String getClasss() {
		return classs;
	}

	public static void setClasss(String classs) {
		Student.classs = classs;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public Student(String name, String gender) throws Exception {
		super();
		count++;
		Name = name;
		Gender = gender;
		this.limitstudent();
	}

	public Student() throws Exception {
		super();
		count++;
		this.limitstudent();
	}

	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Gender=" + Gender + "]";
	}

	public static void limitstudent() throws Exception {
		if (Student.count > 7) {

			throw new Exception("error only maximum 7 student");
		}
	}
}