package backend;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

import entity.scannerUtils;

public class department {
	private int id;
	private String name;

	public department() throws Exception {
		Scanner scanner = new Scanner(System.in);
		name = inputname();
		id = inputId();
	}

	private int inputId() {
		System.out.println("moi ban nhap vao id cua phong ban");
		int iddepartment = scannerUtils.inputInt("error, please try again!");
		return iddepartment;

	}

	private String inputname() {
		System.out.println("mời bạn nhập vào tên 1 phòng ban");
		String namedepartment = scannerUtils.inputString("error, please try again!");
		return namedepartment;
	}

	public department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "department [id=" + id + ", name=" + name + "]";
	}

}
