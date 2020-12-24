package backend;
import entity.invalidageException;
import entity.scannerUtils;
public class Account {
	String name;
	String email;
	int age;
	public Account() throws invalidageException {
		input();
}
	private void input() throws invalidageException {		
		System.out.println("Nhập tuổi của bạn: ");
		age = inputAge();
	}
	// question11
	
//	public int inputAge() throws invalidageException {
//		int age = scannerUtils.inputInt("Please input an age as int, please input again.");
//
//		if (age < 0) {
//			throw new invalidageException("The age must be greater than 0, please input again.");
//		}
//		return age;
//	}
	// question12
	public int inputAge() throws invalidageException {
		while( true) {
			try {
		int age = scannerUtils.inputInt("Please input an age as int, please input again.");

		if (age < 18) {
			throw new invalidageException("The age must be greater than 0, please input again.");
		}else return age;
	} catch (invalidageException e) {
		System.out.println(e.getMessage());
	}
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Account [name=" + name + ", email=" + email + ", age=" + age + "]";
	}	
}
