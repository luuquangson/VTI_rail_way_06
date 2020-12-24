package entity;

public class Studnet2 {
	public static int moneygroup = 0 ;
	public static String college = "daihocbachkhoa";
	public int id;
	public String name;
	public Studnet2(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		Studnet2.college = college;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getMoneygroup() {
		return moneygroup;
	}

	public static void setMoneygroup(int moneygroup) {
		Studnet2.moneygroup = moneygroup;
	}

	@Override
	public String toString() {
		return "Studnet2 [id=" + id + ", name=" + name + ", college=" + college + "]";
	}
	
	
}
