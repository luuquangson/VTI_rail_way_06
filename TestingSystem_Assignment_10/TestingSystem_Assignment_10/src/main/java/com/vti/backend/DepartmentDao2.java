package com.vti.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.vti.entity.Department;
import com.vti.ultis.JdbcUtils;


		// question1 :Tạo method để lấy ra danh sách tất cả các Department,
public class DepartmentDao2 {
	public static List<Department> getDepartments() throws IOException, SQLException, ClassNotFoundException {
		List<Department> listDepartment = new ArrayList<Department>();
		JdbcUtils jdbcUtils = new JdbcUtils();
		Connection connection = jdbcUtils.connect();
		Statement statement = connection.createStatement();

		String querry = " SELECT * FROM department";
		ResultSet resultSet = statement.executeQuery(querry);
		while (resultSet.next()) {
			listDepartment.add(new Department(resultSet.getInt("DepartmentId"), resultSet.getString("DepartmentName")));
		}
		// System.out.println(listDepartment);
		return listDepartment;
	}
// quesytion2: read data – get department by id Tạo method để lấy ra Department có id = 5
	public Department searchById(int id) throws ClassNotFoundException, IOException, SQLException {
		List<Department> listDepartment = new ArrayList<Department>();
		listDepartment = getDepartments();
		// tim thay duoc department thi bao true, k thay thi la false.
		boolean timthayDepartment = false;
		for (Department department : listDepartment) {

			if (department.getId() == id) {
				timthayDepartment = true;
				return department;
			}
		}
		if (!timthayDepartment) {
			System.out.println("k tim thay department phu hop");
		}

		return null;
	}
	
	// question4
	public Department searchByName(String name) throws ClassNotFoundException, IOException, SQLException {
		List<Department> listDepartment = new ArrayList<Department>();
		listDepartment = getDepartments();		
		boolean timthayDepartment = false;
		for (Department department : listDepartment) {
			if (department.getName().equals(name) ) {
				timthayDepartment = true;
				return department;
			}
		}
		if (!timthayDepartment) {
			System.out.println("k tim thay department phu hop");
		}
		return null;
	}
	
	public  void createDepartment ( String name) throws IOException, ClassNotFoundException, SQLException {
		JdbcUtils jdbcUtils = new JdbcUtils();
		Connection connection = jdbcUtils.connect();
		Statement statement = connection.createStatement();
		if (searchByName(name)== null) {
		String querry = " INSERT INTO Department(DepartmentName) " 
				 			+ "Values ('"+ name +"')";
		System.out.println(statement.executeUpdate(querry));
		
		} else {
			System.out.println("da ton tai department nay!");
		}
	}
	
	public void updateDepartmentName (int id ,String newname) throws ClassNotFoundException, IOException, SQLException {
		JdbcUtils jdbcUtils = new JdbcUtils();
		Connection connection = jdbcUtils.connect();
		Statement statement = connection.createStatement();
		if (searchById(id)== null) {
			System.out.println("khong ton tai");
		} else if(searchByName(newname)!= null) {
			System.out.println("ten da ton tai");
		}else {
			String querry = " UPDATE Department  SET DepartmentName = '" + newname + "'  WHERE DepartmentID = " + id;		

		int effectrecordamont = statement.executeUpdate(querry);
		System.out.println(effectrecordamont);
		System.out.println("department sau khi update" + searchById(id));
		}
		
	}
	public void deleteDepartment (int id ) throws ClassNotFoundException, IOException, SQLException {
		JdbcUtils jdbcUtils = new JdbcUtils();
		Connection connection = jdbcUtils.connect();
		Statement statement = connection.createStatement();
		if (searchById(id)== null) {
			System.out.println("khong ton tai"); 
		}else {
			String querry = " DELETE Department  SET DepartmentId = Id  WHERE DepartmentID = " + id;		

		int effectrecordamont = statement.executeUpdate(querry);
		System.out.println(effectrecordamont);
		System.out.println("department sau khi update" + searchById(id));
		}
		
	}
}


