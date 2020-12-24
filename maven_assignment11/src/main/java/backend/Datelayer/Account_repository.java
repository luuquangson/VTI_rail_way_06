package backend.Datelayer;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.ultis.JdbcUtils;

import entity.Account;

public class Account_repository implements IAccountreponsitoryver1{
	
	public static List<Account> getListAccount() throws IOException, SQLException, ClassNotFoundException {
		List<Account> listAccount = new ArrayList<Account>();
		JdbcUtils jdbcUtils = new JdbcUtils();
		Connection connection = jdbcUtils.connect();
		Statement statement = connection.createStatement();

		String querry = " SELECT * FROM Account";
		ResultSet resultSet = statement.executeQuery(querry);
		while (resultSet.next()) {
			listAccount.add(new Account(resultSet.getInt("AccountId"), resultSet.getString("email"),
					resultSet.getString("userName"), resultSet.getString("fullName"), null,
					resultSet.getString("createDate")));
		}
		System.out.println(listAccount);
		return listAccount;
	}

	public List<Account> getListAccounts2() {
		// TODO Auto-generated method stub
		return this.getListAccounts2();
	}

	public Account createAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	public Account getAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAccountExists(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAccountExists(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public Account updateAccountByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteAccount(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
