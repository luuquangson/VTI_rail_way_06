package entyti;

public class Manager extends User {
	int ExpInYear;

	public Manager(int projectId, int id, String fullName, String email, String password, int expInYear) {
		super();
		ExpInYear = expInYear;
	}

	public Manager() {
		super();
	}

	public int getExpInYear() {
		return ExpInYear;
	}

	public void setExpInYear(int expInYear) {
		ExpInYear = expInYear;
	}

	@Override
	public String toString() {
		return "Manager [ExpInYear=" + ExpInYear + "]";
	}

}
