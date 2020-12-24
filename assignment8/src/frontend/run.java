package frontend;
import backend.exe1_question1;
import entyti.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class run {
public static void main(String[] args) {
//	List<Integer> ages = new ArrayList<>();
//	ages.add(12);
//	ages.add(13);
//	ages.add(14);
//	ages.add(15);
//	System.out.println(ages.size());
//	
//	System.out.println(ages.get(3));
//	System.out.println(ages.remove(0));
//	ages.clear();
//	System.out.println(ages.size());
//	exe1_question1 ex1 = new exe1_question1();
//	ex1.showSizeOflistStudent();
//	ex1.khoitao();
//	ex1.showSizeOflistStudent();
//	System.out.println(ex1.LayRaPhanTuThuI(2));
//	System.out.println(ex1.LayRaPhanTuThuI(ex1.liststudent.size() -1));
//	
//	Map<Integer,String> students = new HashMap<>();
//	
//	students.put(1,"nguyen van a");
//	students.put(1,"nguyen van b");
//	students.put(2,"nguyen van b");
//	students.put(3,"nguyen van c");
//
//	System.out.println(students.size());
//	System.out.println(students.get(2));
//	
	List<Student> students = new ArrayList<>();
	Student student1 = new Student(1,"A",9);
	Student student2 = new Student(2,"A",4);
	Student student3 = new Student(3,"A",7);
	Student student4 = new Student(4,"A",8);
	Student student5 = new Student(5,"A",2);
	students.add(student1);
	students.add(student2);
	students.add(student3);
	students.add(student4);
	students.add(student5);

	for (Student student : students) {
		System.out.println(student.toString());
		}
 
	Collections.sort(students);
	for (Student student : students) {
	System.out.println(student.toString());
	}
}
}
