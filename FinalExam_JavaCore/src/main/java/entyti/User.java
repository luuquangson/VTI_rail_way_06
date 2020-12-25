package entyti;

public class User extends Project {
	private int Id;
	private String FullName;
	private String Email;
	private String Password;
	
	
	public User(int projectId, int id, String fullName, String email, String password) {
		super(projectId);
		Id = id;
		FullName = fullName;
		Email = email;
		Password = password;
	}
	public User() {
		super();
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
