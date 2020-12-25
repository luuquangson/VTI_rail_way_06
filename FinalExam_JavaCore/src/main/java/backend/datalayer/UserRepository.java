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
				users.add(new Manager(resultSet.getInt("ProjectID"), 
										resultSet.getInt("UserID"),
										resultSet.getString("FullName"), 
										resultSet.getString("Email"), 
										resultSet.getString("password"),
										resultSet.getInt("ExpInYear")));
			} else {
				users.add(new Employee(resultSet.getInt("ProjectID"), 
										resultSet.getInt("UserID"),
										resultSet.getString("FullName"), 
										resultSet.getString("Email"), 
										resultSet.getString("password"),
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
			users.add(new Manager(resultSet.getInt("ProjectID"),
									resultSet.getInt("UserID"),
									resultSet.getString("FullName"), 
									resultSet.getString("Email"), 
									resultSet.getString("password"),
									resultSet.getInt("ExpInYear")));
		}
		for (User user : users)
			System.out.println(user);
	}
}
