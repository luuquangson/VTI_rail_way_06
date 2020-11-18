DROP DATABASE IF EXISTS THUCTAP;
CREATE DATABASE THUCTAP;
USE THUCTAP;

DROP TABLE IF EXISTS COUNTRY ;
CREATE TABLE COUNTRY (
		Country_Id	  	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        Country_Name  	VARCHAR(50)
        );
        


 DROP TABLE IF EXISTS LOCATION;
 CREATE TABLE LOCATION(
		Location_Id		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
        Street_Address 	TEXT,
        Postal_Code		SMALLINT UNSIGNED NOT NULL,
        Country_Id		TINYINT UNSIGNED NOT NULL	,	
		FOREIGN KEY(Country_Id) 	 REFERENCES COUNTRY(Country_Id)
 );
 
 DROP TABLE IF EXISTS EMPLOYEE;
CREATE TABLE EMPLOYEE (
	Employee_Id		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	Full_Name		VARCHAR(100),
	Email			VARCHAR(100),
	Location_Id		TINYINT UNSIGNED,
	FOREIGN KEY(Location_Id) 	 REFERENCES LOCATION(Location_Id) 

 );
 
 INSERT INTO COUNTRY  (			Country_Name 	)
 VALUES				  (			'VIET NAM'	 	),	
					  (			'NAM DINH' 		),
					  (			'LANG SON' 		),
					  (			'THAI NGUYEN' 	),	
					  (			'BAC NINH' 		);
                      
INSERT INTO LOCATION( 		Street_Address		,		Postal_Code		,			Country_Id		)
VALUES				(		'TRAN PHU'			,		'12'			, 				1 			),
					(		'HOANG DIEU' 		,		'23'			, 				2			),
					(		'THANH XUAN'		,		'33'			, 				3 			),
					(		'DONG DA'			,		'44'			, 				4 			),
                    (		'HOAN KIEM'			,		'56'			, 				5			);

INSERT INTO EMPLOYEE ( 			Full_Name		,	Email				,		Location_Id			)		
VALUES				 (		'HOANG THANH HOA'	,	'HUONG12@GMAIL.COM'	, 		1					),
                     (		'TRAN THANH TUNG'	,	'nn03@GMAIL.COM'	, 		2					),
                     (		'LAM THU HUYEN'		,	'HONG77@GMAIL.COM'	, 		2					),
                     (		'KHUONG HUY THONG'	,	'TRANG44@GMAIL.COM'	, 		5					),
                     (		'VU LAN PHUONG'		,	'MAI434@GMAIL.COM'	, 		4					);
							
       -- cau 2a: viet lenh lay ra thong tin thuoc viet nam.
       
        SELECT Full_Name 
        FROM EMPLOYEE
        JOIN LOCATION USING (Location_Id)
        JOIN COUNTRY USING (Country_Id)
        WHERE Country_Name LIKE 'VIET NAM' ;
        
	 -- B: Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
        
    SELECT Country_Name
	FROM COUNTRY
	JOIN LOCATION USING (Country_Id)
	WHERE Country_Id = ( SELECT Country_Id
							FROM EMPLOYEE
							JOIN LOCATION USING (Location_Id)
							WHERE Email = 'nn03@GMAIL.COM' );
    
    
    
    
    -- C: Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
		SELECT COUNT(Country_Name), COUNT(Street_Address)
		FROM  EMPLOYEE
        JOIN LOCATION USING (Location_Id)
        JOIN COUNTRY USING (Country_Id)
		GROUP BY Full_Name;
	
		
       
       -- cau3 : Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee
       DROP TRIGGER IF EXISTS CAU3;
       DELIMITER $$
       CREATE TRIGGER CAU3
       BEFORE INSERT ON EMPLOYEE
       FOR EACH ROW 
       BEGIN
		   SELECT COUNT(*)
           FROM EMPLOYEE
			JOIN LOCATION USING (Location_Id)
			GROUP BY Country_Id
            HAVING COUNT(*) <= 10 ;
       
       END $$
       DELIMITER ;
       
	-- cau4 :Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
     
    DROP PROCEDURE IF EXISTS CAU4;
    DELIMITER $$
    CREATE PROCEDURE CAU4()
    BEGIN
        DELETE  Street_Address , Postal_Code, Country_Id	
        FROM LOCATION
        SET Location_Id IS NULL ;
        
        
	END $$
    DELIMITER ;
    
    
    
    