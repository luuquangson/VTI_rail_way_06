package backend;

import entity.student2;

public class Istudent {

	private Istudent[] students;

	public Istudent() {
		students = new Istudent[11];
	}

	public void initStudents() {
		students[1] = new Istudent(1, "�?ăng", 1);
		students[2] = new Istudent(2, "Quang Anh", 1);
		students[3] = new Istudent(3, "Duy", 1);
		students[4] = new Istudent(4, "Chiến", 2);
		students[5] = new Istudent(5, "Hữu", 2);
		students[6] = new Istudent(6, "Hi�?n", 2);
		students[7] = new Istudent(7, "Bích", 3);
		students[8] = new Istudent(8, "Thủy", 3);
		students[9] = new Istudent(9, "Phương", 3);
		students[10] = new Istudent(10, "Nam", 3);
	}

	public void caLopDiemDanh() {
		for (int i = 1; i <= 10; i++) {
			students[i].diemDanh();
		}
	}

	public void nhomDiHocBai() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 1) {
				students[i].hocBai();
			}
		}
	}

	public void nhomDiDonVeSinh() {
		for (int i = 1; i <= 10; i++) {
			if (students[i].getGroup() == 2) {
				students[i].diDonVeSinh();
			}
		}
	}
}
