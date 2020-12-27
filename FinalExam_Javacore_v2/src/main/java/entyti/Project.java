package entyti;

public class Project {
	private int ProjectId;
	private int TeamSize;
	private int IdManager;
	private int IdEmployees;
	
	public Project(int projectId) {
		super();
		ProjectId = projectId;
	}
	public Project() {
		super();
	}
	public int getProjectId() {
		return ProjectId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public int getTeamSize() {
		return TeamSize;
	}
	public void setTeamSize(int teamSize) {
		TeamSize = teamSize;
	}
	public int getIdManager() {
		return IdManager;
	}
	public void setIdManager(int idManager) {
		IdManager = idManager;
	}
	public int getIdEmployees() {
		return IdEmployees;
	}
	public void setIdEmployees(int idEmployees) {
		IdEmployees = idEmployees;
	}
	@Override
	public String toString() {
		return "Project [ProjectId=" + ProjectId + ", TeamSize=" + TeamSize + ", IdManager=" + IdManager
				+ ", IdEmployees=" + IdEmployees + "]";
	}
	
}
