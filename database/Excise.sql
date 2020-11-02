DROP DATABASE IF EXISTS	 Exercise1;
CREATE DATABASE			 Exercise1;
USE 					 Exercise1;

DROP TABLE IF EXISTS 	 Fresher_Trainin_Management ;
CREATE TABLE 			 Fresher_Training_Management (
	Trainee_id				 SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
	Full_name				 VARCHAR (50),
	Birth_date 				 DATE,
	Gender 					 ENUM ('MALE' , 'FEMALE' ,'UNKNOW'),
	ET_IQ			  		 TINYINT UNSIGNED CHECK (ET_IQ  >= 0 && ET_IQ <= 20),
	ET_Gmath				 TINYINT UNSIGNED CHECK (ET_Gmath >=0 && ET_Gmath <= 20),
	ET_ENGLISH        		 TINYINT UNSIGNED CHECK ( ET_ENGLISH >=0 && ET_ENGLISH <= 50 ),
    Trainin_glass 			 TINYINT UNSIGNED,
    Evaluation_notes 		 TEXT,
    Vti_account				 TINYINT UNSIGNED NOT NULL
);





