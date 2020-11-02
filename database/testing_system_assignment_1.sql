DROP DATABASE IF EXISTS testing_system_assignment_1;
CREATE DATABASE testing_system_assignment_1;
USE testing_system_assignment_1;


CREATE TABLE  `Department` (
 DepartmentId   			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
 DepartmentName   		 	VARCHAR(50) NOT NULL
 );
 
 CREATE TABLE `Position` (
 Position_id 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
 Position_name 				ENUM ('DEV' , 'TEST' , 'SRCUM MASTER' , 'PM' )
 ); 
 
 CREATE TABLE  `Account` (
  Account_id 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
  Email 					VARCHAR(50) NOT NULL,
  Username 					VARCHAR (50),
  Fullname 					VARCHAR (50),
  DepartmentId 				SMALLINT UNSIGNED ,
  Position_id 				TINYINT UNSIGNED,
  Create_date  				DATE ,
  FOREIGN KEY ( DepartmentId ) REFERENCES `Department` ( DepartmentId ),
  FOREIGN KEY ( Position_id ) REFERENCES `Position` ( Position_id )
  );
  
  CREATE TABLE `Group` (
  Group_id     				TINYINT UNSIGNED  ,
  Creator_id 				TINYINT UNSIGNED PRIMARY KEY ,
  Group_name 				VARCHAR (50),
  Create_date 				DATE
  );
  
 CREATE TABLE Group_account (
 Group_id    				TINYINT UNSIGNED PRIMARY KEY ,
 Account_id 			  	TINYINT UNSIGNED,
 John_date 					DATE,
 FOREIGN KEY ( Account_id  ) REFERENCES `Account` ( Account_id )
 );
  
CREATE TABLE Type_question (
Type_id 					TINYINT UNSIGNED PRIMARY KEY ,
Type_name 					VARCHAR (50)
);

CREATE TABLE Category_question (
Category_id 				TINYINT UNSIGNED PRIMARY KEY ,
Category_name				ENUM ( 'JAVA' , 'NET' , ' SQL ' , 'POSTMAN ' , 'RUBY ' )
);

CREATE TABLE Question (
Question_id 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
Content						TEXT,
Category_id 				TINYINT UNSIGNED,
Type_id 					TINYINT UNSIGNED,
Creator_id 					TINYINT UNSIGNED,
Create_date 				DATE,
FOREIGN KEY ( Category_id ) REFERENCES Category_question ( Category_id ),
FOREIGN KEY ( Creator_id ) REFERENCES  `Group` ( Creator_id ),
FOREIGN KEY ( Type_id ) REFERENCES  Type_question ( Type_id )
);


CREATE TABLE Answer (
Answer_id 					TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Content 					VARCHAR (50),
Question 					VARCHAR (50),
Iscorrect 					ENUM  ('TRUE' , 'FLASE')
);
       
 CREATE TABLE Exam (
 Exam_id 					SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
 Code1 						TINYINT UNSIGNED,
 Title 						VARCHAR(50),
 Category	 				VARCHAR(50),
 Duration 					DATE,
 Creator_id 				TINYINT UNSIGNED,
 Create_date 				DATE
 );
 
 CREATE TABLE Exam_question (
 Exam_id 					SMALLINT UNSIGNED ,
 Question_id 				TINYINT UNSIGNED,
 PRIMARY KEY ( Exam_id , Question_id ) ,
 FOREIGN KEY ( Exam_id ) REFERENCES Exam ( Exam_id ),
 FOREIGN KEY ( Question_id ) REFERENCES Question ( Question_id )
 );

 
