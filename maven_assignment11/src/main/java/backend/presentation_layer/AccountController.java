package backend.presentation_layer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.Businesslayer.AccountService;
import backend.Datelayer.Account_repository;
import entity.Account;

public class AccountController {
	AccountService accountService = new AccountService();
	public  static List<Account> getListAccount() throws ClassNotFoundException, IOException, SQLException {
		return	Account_repository.getListAccount();
	}
}
