import java.io.IOException;
import java.sql.SQLException;

import com.vti.ultis.JdbcUtils;

import backend.Businesslayer.AccountService;
import backend.Datelayer.Account_repository;


public class Run {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		JdbcUtils jdbcUtils = new JdbcUtils();
		jdbcUtils.connectForTesting();
		
		Account_repository account_reponsitory = new Account_repository();
		Account_repository.getListAccount();
		AccountService.getListAccount();
	}
}














