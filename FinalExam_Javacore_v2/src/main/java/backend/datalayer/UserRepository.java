package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.Utils.JdbcUltils;

import entyti.Employee;
import entyti.Manager;
import entyti.User;

public class UserRepository {
	JdbcUltils jdbcUltils;
	public static Connection connection;

	public UserRepository() throws FileNotFoundException, ClassNotFoundException, IOException, SQLException {
		jdbcUltils = new JdbcUltils();
		connection = jdbcUltils.connect();
	}

	public static ArrayList<User> users = new ArrayList<User>();

	public static void ShowUsersByProjectId(int projectId) throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM User WHERE ProjectId = " + projectId + ";";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			if (resultSet.getString("Role").equals("Manager")) {
				users.add(new Manager(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
						resultSet.getInt("ExpInYear")));
			} else {
				users.add(new Employee(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
						resultSet.getString("proSkill")));
			}
		}

		for (User user : users) {
			if (user instanceof User) {
				System.out.println(user);
			} else if (user instanceof Employee) {
				Employee employee = (Employee) user;
				System.out.println(employee.toString());
			} else if (user instanceof Manager) {
				Manager manager = (Manager) user;
				System.out.println(manager.toString());
			}

		}

	}

	public static void ShowManager(int ExpInYear) throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String query = "SELECT * FROM User WHERE `Role` = 'Manager';";
		ResultSet resultSet = statement.executeQuery(query);
		while (resultSet.next()) {
			users.add(new Manager(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
					resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
					resultSet.getInt("ExpInYear")));
		}
		for (User user : users)
			System.out.println(user);
	}

	public static boolean checkEmail(String email) {
		boolean checkemail = false;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				checkemail = true;
			}
		}
		if (email.length() >= 2 && checkemail) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean checkPassword(String password) {
		boolean checkpass = false;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
				checkpass = true;
			}
		}
		if (password.length() >= 6 && password.length() <= 12) {
			return true;
		} else {
			return false;
		}
	}

	public static void ShowUsers() throws SQLException {
		users = new ArrayList<User>();
		Statement statement = connection.createStatement();
		String querry = "SELECT * FROM User";
		ResultSet resultSet = statement.executeQuery(querry);
		while (resultSet.next()) {
			if (resultSet.getString("Role").equals("Manager")) {
				users.add(new Manager(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
						resultSet.getInt("ExpInYear")));
			} else {
				users.add(new Employee(resultSet.getInt("ProjectID"), resultSet.getInt("UserID"),
						resultSet.getString("FullName"), resultSet.getString("Email"), resultSet.getString("password"),
						resultSet.getString("proSkill")));
			}
		}

		for (User user : users) {
			if (user instanceof User) {
				System.out.println(user);
			} else if (user instanceof Employee) {
				Employee employee2 = (Employee) user;
				System.out.println(employee2.toString());
			} else if (user instanceof Manager) {
				Manager manager = (Manager) user;
				System.out.println(manager.toString());
			}

		}

	}

	public static void Login() throws SQLException {
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Moi ban nhap email login");
			String email = scanner.nextLine();
			System.out.println("Moi ban nhap password login");
			String pass = scanner.nextLine();

			if (!checkEmail(email)) {
				System.out.println("Ban nhap sai email, vui long dang nhap lai");
				continue;
			}

			if (!checkPassword(pass)) {
				System.out.println("Ban nhap sai password, vui long dang nhap lai");
				continue;
			}
			if (checkEmail(email) && checkPassword(pass)) {
				ShowUsers();
				for (User us : users) {
					if (us.getEmail().equals(email) && us.getPassword().equals(pass)) {
						System.out.println("Dang nhap thanh cong");
						return;
					} else {
						System.out.println("Tai khoan khong ton tai, vui long dang nhap lai");
						break;
					}

				}
			}
		}
	}
}
