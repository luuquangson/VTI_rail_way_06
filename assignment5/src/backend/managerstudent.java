package backend;

import java.util.Scanner;

import entity.person;
import entity.student3;

public class managerstudent extends managerperson {
	@Override
	public void inputinfo() {
		student3 person1 = new student3();

		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten");
		person1.setName(scanner.nextLine());

		System.out.println("nhap gioitinh");
		person1.setGioitinh(scanner.nextLine());

		System.out.println("nhap ngaysinh");
		person1.setNgaysinh(scanner.nextLine());

		System.out.println("nhap diachi");
		person1.setDiachi(scanner.nextLine());

		System.out.println("nhap diemtrungbinh");
		person1.setDiemtrungbinh(scanner.nextLine());

		persons.add(person1);
	}

	@Override
	public void showifo() {

		for (person person : persons) {
			System.out.println(((student3) person).toString());
		}
	}
}
