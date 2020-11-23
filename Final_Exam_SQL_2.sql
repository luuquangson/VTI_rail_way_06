DROP DATABASE IF EXISTS THUCTAP;
CREATE DATABASE THUCTAP;
USE THUCTAP;

DROP TABLE IF EXISTS GiangVien ;
CREATE TABLE GiangVien (
		Magv	  	TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        Ho_Ten	  	VARCHAR(50),
        Luong		BIGINT
        );
        
 DROP TABLE IF EXISTS SinhVien;
 CREATE TABLE SinhVien(
		Masv			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
        Ho_Ten		 	VARCHAR(50),
        Nam_Sinh		DATE,
		Que_Quan		VARCHAR(50)		
        );
        
 DROP TABLE IF EXISTS DeTai;
 CREATE TABLE DeTai(
		Madt			SMALLINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
        Tendt		 	TEXT,
        Kinh_Phi		BIGINT UNSIGNED NOT NULL,
        Noi_Thuc_Tap	TEXT	
        );
        
DROP TABLE IF EXISTS HuongDan;
 CREATE TABLE HuongDan(
		Id				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT ,
        Masv	 		TINYINT UNSIGNED   ,
        Madt			SMALLINT UNSIGNED ,
        magv			TINYINT UNSIGNED 	,	        
        Ket_Qua			ENUM ('DAT','KHONG DAT'),
        FOREIGN KEY(Magv) 	 REFERENCES GiangVien(Magv),
        FOREIGN KEY(Masv)	 REFERENCES SinhVien(Masv)  ON DELETE CASCADE ,
        FOREIGN KEY(Madt)	 REFERENCES DeTai(Madt)
        );
        
 INSERT INTO GiangVien ( 		Ho_Ten					,				Luong		)       
  VALUES               (		'TRAN HOAI PHU'			, 				'5300000' 	),
                       (		'HOANG XUAN DIEU'		, 				'6000000'	),
                       (		'THANH VAN XUAN'		, 				'7000000' 	);	
                       
 INSERT INTO SinhVien( 	Ho_Ten				,			Nam_Sinh			,	Que_Quan		)                      
 VALUES				(	'HOANG THANH HOA'	, 				'1997-02-12'	, 'NAM DINH' 		),                      
 					(	'TRAN VAN NAM'		, 				'1997-04-14' 	, 'HA NAM'			),                      
 					(	'NGUYEN KIM ANH'	, 				'1997-06-15' 	, 'HA NOI'			);
                    
   INSERT INTO DeTai( 		Tendt				,		Kinh_Phi		,			 Noi_Thuc_Tap		)                      
 VALUES				(		'KHOA HOC'			,		'200000'		, 				'THANH XUAN'	),                      
 					(		'VAN HOA'			,		'300000'		, 				'DONG DA' 		),                      
 					(	'CONG NGHE SINH HOC'	,		'350000'		, 				'HOAN KIEM' 	);         
                    
 INSERT INTO HuongDan( 		Masv		,		Madt		,			 magv			, Ket_Qua		)                      
 VALUES				(		1			,		1			, 			1		,		'DAT'			),                      
 					(		2			,		2			, 			2		,		'KHONG DAT'		),                      
 					(		3			,		3			, 			3		,		'DAT'			);
                    
 -- CAU1a : Lấy tất cả các sinh viên chưa có đề tài hướng dẫn.                  
	SELECT s.Ho_Ten, d.Tendt
      FROM  SinhVien s
      JOIN  HuongDan h USING (Masv)
      JOIN  DeTai d	USING (Madt)
      WHERE d.Tendt = NULL;
                    
  -- CAU1b : Lấy ra số sinh viên làm đề tài ‘CONG NGHE SINH HOC’.
  
   SELECT COUNT(Ho_Ten) 
      FROM  SinhVien s
        JOIN  HuongDan h USING (Masv)
		JOIN  DeTai d	USING (Madt)
		WHERE d.Tendt = 'CONG NGHE SINH HOC'
        ;              
                    
  -- CAU3: Tạo view có tên là "SinhVienInfo" lấy các thông tin về học sinh bao gồm:mã số, họ tên và tên đề tài
  --         (Nếu sinh viên chưa có đề tài thì column tên đề tài sẽ in ra "Chưa có")                  
                    
    CREATE OR REPLACE VIEW SinhVienInfo AS (
    SELECT s.Masv , s.Ho_Ten , d.Tendt
    FROM SinhVien s
    JOIN  HuongDan h USING (Masv)
	JOIN  DeTai d	USING (Madt) 

    );
SELECT * FROM  SinhVienInfo  ;
    
 -- CAU4: Tạo trigger cho table SinhVien khi insert sinh viên có năm sinh <= 1900 thì hiện ra thông báo "năm sinh phải > 1900"   
    DROP TRIGGER IF EXISTS Insert_YearofSinhVien;
    DELIMITER $$
    CREATE TRIGGER Insert_YearofSinhVien
    BEFORE INSERT ON SinhVien 
    FOR EACH ROW
    BEGIN
     IF YEAR(Nam_Sinh) <= '1900'  THEN 
		SIGNAL SQLSTATE '12332' 
        SET MESSAGE_TEXT = 'năm sinh phải > 1900' ;
	END IF;
END $$
 DELIMITER ;   

-- CAU5: Hãy cấu hình table sao cho khi xóa 1 sinh viên nào đó thì sẽ tất cả thông tin trong table HuongDan liên quan tới sinh viên đó sẽ bị xóa đi 
  DROP TRIGGER IF EXISTS Delete_SinhVien;
    DELIMITER $$
    CREATE TRIGGER Delete_SinhVien
    BEFORE DELETE ON HuongDan
    FOR EACH ROW
    BEGIN
       DECLARE d_Masv INT;
       SELECT Masv INTO d_Masv
       FROM HuongDan;
      DELETE FROM HuongDan WHERE Masv = d_masv;
      UPDATE SinhVien SET Ho_Ten = NULL WHERE Ho_Ten = d_Masv;
      UPDATE SinhVien SET Nam_Sinh = NULL WHERE Nam_Sinh = d_Masv;
      UPDATE SinhVien SET Que_Quan = NULL WHERE Que_Quan = d_Masv;
	END $$
    DELIMITER ;

