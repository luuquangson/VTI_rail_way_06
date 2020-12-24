package backend;

import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

import entyti.StudentGeneric;

public class exe3_generic {
	public void question123() {
		// question1
		StudentGeneric<Integer> student1 = new StudentGeneric<Integer>(1, "tran van a");
		StudentGeneric<Float> student2 = new StudentGeneric<Float>(2.0f, "tran van b");
		StudentGeneric<Double> student3 = new StudentGeneric<Double>(3.0, "tran van c");
		
	}
	// question2; 
			private void printStudent(StudentGeneric student) {
				System.out.println("Mã của học sinh là:" + student.getId());
				System.out.println("Tên của học sinh là:" + student.getName());
			}

	
	}

