package backend.Datelayer;

import java.util.List;

import entity.Account;

public interface IAccountreponsitoryver1 {
	List<Account> getListAccounts2();
	Account createAccount();
	Account getAccountByID(int id);
	boolean isAccountExists(String username);
	boolean isAccountExists(int id);
	Account updateAccountByID(int id);
	boolean deleteAccount(int id);
}
