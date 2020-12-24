package frontend;
import com.vti.backend.DepartmentDao2;
import com.vti.entity.Department;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.vti.ultis.JdbcUtils;

public class run {
	private static JdbcUtils jdbcUtils;
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
//		JdbcUtils jdbcUtils = new JdbcUtils();
//		jdbcUtils.connectForTesting();
		DepartmentDao2 departmentDao2 = new DepartmentDao2();
//		DepartmentDao2.getDepartments();		
		
//		Department department1 = departmentDao2.searchById(5);
//		System.out.println(department1);
		
//		Department department11 = departmentDao2.searchByName("Bán hàng");
//		System.out.println(department11);	
		
//		departmentDao2.createDepartment("Phong ban ");
		
//		departmentDao2.updateDepartmentName(2, "Nhan vien");
		
		
		departmentDao2.deleteDepartment(3);
	}

}
