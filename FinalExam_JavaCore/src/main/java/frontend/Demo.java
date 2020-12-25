package frontend;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import backend.datalayer.UserRepository;
import com.vti.Utils.JdbcUltils;




public class Demo {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		JdbcUltils jdbcUltils = new JdbcUltils();
		jdbcUltils.connect();
		System.out.println("connect success");
		
		UserRepository userRepository = new UserRepository();
		
		
		// Viết function để user nhập vào id project, sau đó in ra tất cả các employee & Manager trong project đó 
			userRepository.showUsersByProjectId(3);

		//Viết function để user có thể lấy ra tất cả Manager của các project.
		userRepository.ShowManager(1);
	}
}
