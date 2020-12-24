package backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entyti.Student;

public class exe1_question1 {
	public List<Student> liststudent = new ArrayList<Student>();

	public void khoitao() {
		Student student1 = new Student(1,"NAME",2);
		Student student2 = new Student(2,"NAME",2);
		Student student3 = new Student(3,"NAME",2);
		liststudent.add(student1);
		liststudent.add(student2);
		liststudent.add(student3);
	
		
	}
	public void showSizeOflistStudent() {
		System.out.println(liststudent.size());
	}
	public Student LayRaPhanTuThuI(int i) {
		return liststudent.get(i);
	}
	public void daonguoc() {
		Collections.reverse(liststudent);
	}
}







