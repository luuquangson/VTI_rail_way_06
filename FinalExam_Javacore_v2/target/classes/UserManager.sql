/*============================== CREATE DATABASE =======================================*/
/*======================================================================================*/

DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/


CREATE TABLE Project(
	ProjectId TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    TeamSize TINYINT UNSIGNED,
    IdManager TINYINT UNSIGNED,
	IdEmployees TINYINT UNSIGNED
    
); 
CREATE TABLE `User`(
	UserID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50)  NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role`		VARCHAR(50),
    EnplxYear 	TINYINT,
    ProjectId	TINYINT UNSIGNED ,
    ProSkill 	VARCHAR(100),
    FOREIGN KEY (ProjectId) REFERENCES Project (ProjectId)
);




/*============================== INSERT DATABASE =======================================*/
/*======================================================================================*/
INSERT INTO  Project	(ProjectId,	TeamSize,	IdManager	,	IdEmployees	)       
 VALUES					(3			,	2		,		3		,		4		),
						(4			,	3		,		7		,		6		),
                        (6			,	2		,		9		,		7		),
                        (7			,	4		,		8		,		8		),
                        (9			,	2		,		3		,		9		);
INSERT INTO `User`  (UserID ,FullName			,Email					,`Password`	, 	`Role`	, EnplxYear ,	ProSkill,	ProjectId	) 
VALUES                                                                                                                  			
					(1,'Nguyễn Thị Mỵ'	,'mynt2407@gmail.com'	, 'Mynguyen123'		,'Employee'		,1			, 'dev'		,	3			),
					(2,'Nguyễn Ngọc Duy'	,'duynn03@gmail.com'	, 'duyNguyen'	,'Manager'		,3			, 'php'		,	4			),
                    (3,'Nguyễn Hùng Mạnh'	,'hungmanh@gmail.com'	, 'hunGmanh1'	,'Employee'		,2			, 'java'	,	6			),
                    (4,'Tống   Thị Nhung'	,'nhung@gmail.com'		, 	'nhungtOng'	,'Manager'		,2			, 'dev'		,	7			),
                    (5,'Trần Thị Kim Anh'	,'kimoanh.tran@gmail.com', 'tran.kim'	,'Manager'		,3			, 'dev'		,	9			);