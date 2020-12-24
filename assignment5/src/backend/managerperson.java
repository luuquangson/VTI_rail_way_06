package backend;

import java.util.ArrayList;
import java.util.Scanner;

import entity.person;

public class managerperson {
	
	public ArrayList<person> persons = new ArrayList<person>();

	public void inputinfo() {
		person person1 = new person();
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap ten");
		person1.setName(scanner.nextLine());

		System.out.println("nhap gioitinh");
		person1.setGioitinh(scanner.nextLine());

		System.out.println("nhap ngaysinh");
		person1.setNgaysinh(scanner.nextLine());

		System.out.println("nhap diachi");
		person1.setDiachi(scanner.nextLine());

		persons.add(person1);
	}

	public void showifo() {

		for (person person : persons) {
			System.out.println(person.toString());
		}
	}
}