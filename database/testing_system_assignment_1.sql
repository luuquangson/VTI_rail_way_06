DROP DATABASE IF EXISTS testing_system_assignment_1;
CREATE DATABASE testing_system_assignment_1;
USE testing_system_assignment_1;


CREATE TABLE  `Department` (
 DepartmentId   			SMALLINT UNSIGNED PRIMARY KEY  ,
 DepartmentName   		 	VARCHAR(50) UNIQUE KEY
 );
 
 CREATE TABLE `Position` (
 Position_id 				TINYINT UNSIGNED PRIMARY KEY ,
 Position_name 				VARCHAR (50)
 );
 
 CREATE TABLE  `Account` (
  Account_id 				TINYINT UNSIGNED PRIMARY KEY ,
  Email 					VARCHAR(50) ,
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
Category_name				VARCHAR (50)
);

CREATE TABLE Question (
Question_id 				TINYINT UNSIGNED PRIMARY KEY ,
Content						VARCHAR (50),
Category_id 				TINYINT UNSIGNED,
Type_id 					VARCHAR (50),
Creator_id 					TINYINT UNSIGNED,
Create_date 				DATE,
FOREIGN KEY ( Category_id ) REFERENCES Category_question ( Category_id ),
FOREIGN KEY ( Creator_id ) REFERENCES  `Group` ( Creator_id )
);


CREATE TABLE Answer (
Answer_id 					TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Content 					VARCHAR (50),
Question 					VARCHAR (50),
Iscorrect 					ENUM  ('TRUE' , 'FLASE')
);
       
 CREATE TABLE Exam (
 Exam_id 					SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
 Code1 						INT,
 title 						VARCHAR(50),
 category	 				VARCHAR(50),
 duration 					DATE,
 Creator_id 				INT UNSIGNED,
 Create_date 				DATE,
 FOREIGN KEY ( Create_date ) REFERENCES Question ( Create_date )
 );
 
 CREATE TABLE exam_question (
 exam_id 					SMALLINT UNSIGNED PRIMARY KEY,
 question_id 				VARCHAR (50)
 );

 
