USE testing_system_assignment_1;
-- them du lieu vao trong department

INSERT INTO Department (DepartmentName)
VALUE  ("PHONG BAN 1");

-- them nhieu du lieu thi dung VALUES
INSERT INTO Department (DepartmentName)
VALUES 	 ( "PHONG BAN 2"),
		 ( "PHONG BAN 3");
        
SELECT DepartmentName,DepartmentId FROM Department 
WHERE DepartmentId = 1 OR DepartmentId = 2 ;
        