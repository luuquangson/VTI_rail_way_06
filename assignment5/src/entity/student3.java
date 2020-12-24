package entity;

public class student3 extends person{
	private String masinhvien;
	private String diemtrungbinh;
	private String email;
	public String getMasinhvien() {
		return masinhvien;
	}
	public void setMasinhvien(String masinhvien) {
		this.masinhvien = masinhvien;
	}
	public String getDiemtrungbinh() {
		return diemtrungbinh;
	}
	public void setDiemtrungbinh(String diemtrungbinh) {
		this.diemtrungbinh = diemtrungbinh;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "student3 [masinhvien=" + masinhvien + ", diemtrungbinh=" + diemtrungbinh + ", email=" + email
				+ ", getMasinhvien()=" + getMasinhvien() + ", getDiemtrungbinh()=" + getDiemtrungbinh()
				+ ", getEmail()=" + getEmail() + ", getName()=" + getName() + ", getGioitinh()=" + getGioitinh()
				+ ", getNgaysinh()=" + getNgaysinh() + ", getDiachi()=" + getDiachi() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public student3(String name, String gioitinh, String ngaysinh, String diachi, String masinhvien,
			String diemtrungbinh, String email) {
		super(name, gioitinh, ngaysinh, diachi);
		this.masinhvien = masinhvien;
		this.diemtrungbinh = diemtrungbinh;
		this.email = email;
	}
	public student3() {
	}
	
	
}
