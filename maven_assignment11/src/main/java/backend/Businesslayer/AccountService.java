package backend.Businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.Datelayer.Account_repository;
import entity.Account;

public class AccountService {
	Account_repository account_repository = new Account_repository();
	public static List<Account> getListAccount() throws ClassNotFoundException, IOException, SQLException {
		return	Account_repository.getListAccount() ;
	}
	
}
