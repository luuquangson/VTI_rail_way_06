package entyti;

public class Student2 {
	private int id;
	private String name;
	/**
	 * 
	 * @deprecated version đã cũ.
	 */
	@Deprecated
	public int getId() {
		return id;
	}
	public String getIdv2() {
		return "MSV" + id;
	}
	public String getName() {
		return name;
	}
	public Student2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Student2() {
		super();
	}
	
	
}
