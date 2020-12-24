package entity;

public class primarystudent extends Student {
	public static int countPrimarystudent = 0;
	public primarystudent() throws Exception {
		super();
		countPrimarystudent++;
	}
}
