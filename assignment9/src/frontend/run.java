package frontend;

import entyti.Student;

public class run {
	public static void main(String[] args) {
		Student student = null;
		print(student);
	}
	/**
	 * 
	 * @deprecated  version cũ.
	 */
	@Deprecated
	private static void print(Student student) {
		System.out.println(student.getName());
	}

	@SuppressWarnings("unused")
	private static void printv2(Student student) {
//		if (student != null) {
//		System.out.println(student.getName());
//		} else {
//			System.out.println("loi null");
//		}
		try {
			System.out.println(student.getName());
		} catch (Exception e) {
			System.out.println("loi null");
		}
	}
}