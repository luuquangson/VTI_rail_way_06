package entity;

public class person { 
	
	
	
	
	
	
	private String name;
	private String gioitinh;
	private String ngaysinh;
	private String diachi;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public person(String name, String gioitinh, String ngaysinh, String diachi) {
		super();
		this.name = name;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.diachi = diachi;
	}
	public person() {
		super();
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", gioitinh=" + gioitinh + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi
				+ "]";
	}
	
}
