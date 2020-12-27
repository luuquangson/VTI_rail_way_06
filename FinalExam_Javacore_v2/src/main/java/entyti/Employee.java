package entyti;

public class Employee extends User {
	private int ProjectId;
	private String ProSkill;
	public Employee(int projectId, int id, String fullName, String email, String password, 
			String proSkill) {
		super();
		ProjectId = projectId;
		ProSkill = proSkill;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProjectId() {
		return ProjectId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public String getProSkill() {
		return ProSkill;
	}
	public void setProSkill(String proSkill) {
		ProSkill = proSkill;
	}
	@Override
	public String toString() {
		return "Employee [ProjectId=" + ProjectId + ", ProSkill=" + ProSkill + "]";
	}
	
	
}
