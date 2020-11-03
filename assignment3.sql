USE testing_system_assignment_1;


-- them du lieu vao trong department
INSERT INTO `Department` (DepartmentName)
VALUES               
							('GIAM DOC'		 	),
							('PHO GIAM DOC'		),
                            ('TRUONG PHONG'		),
                            ('KE TOAN'			),
                            ('NHAN SU'			),
                            ('QUAN LY'			),
                            ('PHO QUAN LY'		),
                            ('GIAM SAT'			),
                            ('NHAN VIEN 1'		),
                            ('NHAN VIEN 2'		),
                            ('NHAN VIEN 3'		);
                            
-- add data position table
INSERT INTO `Position` ( Position_name )
VALUES		 				('Dev'			),
							('Test'			),
							('Scrum_Master'	),
							('PM'			); 

-- add data account table
INSERT INTO `Account`		 (Email					,	 Username		,	 FullName		,	 DepartmentId	,	 Position_Id		,   Create_date)
VALUES						('acc1@gmail.com' 		, 		'HOA'		, 	'HAI HOA'		, 		'5'			,		' 2 ' 			, '2020-02-01' ),
							('acc2@gmail.com'		, 		'NAM'		, 	'TRAN NAM'		, 		'2'			,		' 3 ' 			, '2020-03-02' ),
                            ('acc3@gmail.com'		, 		'HIEN'		, 	'NGUYEN HIEN'	, 		'3'			,		' 4 ' 			, '2020-03-06' ),
                            ('acc4@gmail.com'		, 		'KHOA'		, 	'TRAN KHOA'		, 		'6'			,		' 5 ' 			, '2020-04-05' ),
                            ('acc5@gmail.com'		, 		'HOAN'		, 	'TRAN HOAN'		, 		'1'			,		' 6 ' 			, '2020-01-06' ),
                            ('acc6@gmail.com'		, 		'SON'		, 	'LUU SON'		, 		'7'			,		' 7 ' 			, '2020-03-08' ),
                            ('acc7@gmail.com'		, 		'THAI'		, 	'NGOC THAI'		, 		'8'			,		' 8 ' 			, '2020-01-01' ),
                            ('acc8@gmail.com'		, 		'TRANG'		, 	'THU TRANG'		, 		'9'			,		' 8 ' 			, '2020-02-09' ),
                            ('acc9@gmail.com'		, 		'LY'		, 	'TRAN LY'		, 		'1'			,		' 1 ' 			, '2020-03-12' ),
                            ('acc22@gmail.com'		, 		'THONG'		, 	'HUY THONG'		, 		'2'			,		' 1 ' 			, '2020-03-11' );
                            
-- add data  group table
INSERT INTO `Group` 		( Group_id 			, Group_name			, Creator_id		, Create_date )
VALUES						( '1'				, '	hoa hoc  '			, '2'				, 2020-02-02  ),		
							( '3'				, '	van hoc  '			, '3'				, 2020-02-01  ),
                            ( '12'				, '	toan hoc '			, '5'				, 2020-02-04  ),		
                            ( '9'				, '	vat ly	 '			, '6'				, 2020-04-01  ),		
                            ( '7'				, '	khoa hoc '			, '8'				, 2020-05-01  ),		
                            ( '4'				, '	tam ly	 '			, '1'				, 2020-10-02  ),		
                            ( '67'				, '	tinh cam '			, '9'				, 2020-10-11  ),		
                            ( '5'				, '	xa hoi	 '			, '2'				, 2020-10-11  ),		
                            ( '87'				, '	tu nhien '			, '3'				, 2020-04-02  ),
                            ( '41'				, '	doi song '			, '9'				, 2020-07-03  );
				
-- add data Group_account
INSERT INTO Group_account   ( Group_id   		, Account_id			, John_date						)
VALUES						('1'				, '2'					, '2021-02-09'					),
							('3'				, '4'					, '2021-04-09'					),
							('12'				, '23'					, '2021-03-03'					),
							('9'				, '4'					, '2021-02-05'					),
							('7'				, '8'					, '2021-05-02'					),
							('4'				, '5'					, '2021-03-01'					),
							('67'				, '7'					, '2021-06-02'					),
							('5'				, '9'					, '2021-12-11'					),
                            ('87'				, '1'					, '2021-12-19'					),
                            ('41'				, '3'					, '2021-01-09'					);

-- add data Type_question table
INSERT INTO Type_question 	( 						Type_name											)  
VALUES						( 						'	NORMAL	 	'									),
							( 						'	BASIC 		'									),
                            ( 						'	DIFFICULT	'									);
						
-- add data Category_question table
INSERT INTO Category_question   ( 					Category_name										)
VALUES							(					' JAVA			'									),
								(					' NET			'									),
                                (					' SQL			'									),
                                (					' RUBY			'									),
                                (					' POSTMAN		'									);
                                
-- add data Question table
INSERT INTO Question 		( Content					,	Category_id 	, 	Type_id 	,	 Creator_id 	,	 Create_date )
VALUES             			('how about JAVA'  			,		'1'			, 	'8'			, 		'2'			,	'2020-11-11' ),
							('how about PHP'  			,		'2'			, 	'7'			, 		'3'			,	'2020-11-11' ),
                            ('how about NET'  			,		'3'			, 	'6'			, 		'5'			,	'2020-11-11' ),
                            ('how about PYTHON'  		,		'4'			, 	'5'			, 		'6'			,	'2020-11-11' ),
                            ('how about C+'  			,		'5'			, 	'3'			, 		'8'			,	'2020-11-11' ),
                            ('how about C++'  			,		'2'			, 	'1'			, 		'1'			,	'2020-11-11' ),
                            ('how about SQL'  			,		'3'			, 	'4'			, 		'9'			,	'2020-11-11' ),
                            ('how about RUBY'  			,		'6'			, 	'3'			, 		'2'			,	'2020-11-11' ),
                            ('how about POSTMAN'  		,		'8'			, 	'2'			, 		'3'			,	'2020-11-11' ),
                            ('how about ADO.NET'		,       '9'    		,	'3'         ,       '9'			,	'2020-12-12' );
			
-- add data Answer table
INSERT INTO Answer      	( Content					,			Question	,			Icorrect								)
VALUES						('Answer1'					,			'Question1' ,			'TRUE'									),                                
							('Answer2'					,			'Question2' ,			'TRUE'									),
                            ('Answer3'					,			'Question3' ,			'TRUE'									),
                            ('Answer4'					,			'Question4' ,			'TRUE'									),
                            ('Answer5'					,			'Question5' ,			'TRUE'									),
                            ('Answer6'					,			'Question6' ,			'FALES'									),
                            ('Answer7'					,			'Question7' ,			'FALSE'									),
                            ('Answer8'					,			'Question8' ,			'FALSE'									),
                            ('Answer9'					,			'Question9' ,			'FALSE'									),
                            ('Answer10'					,			'Question10',			'FALSE'									);
                            
INSERT INTO Exam   			(`Code`			, Title					, Category_id	, Duration	,		Creator_id		, Create_date )	
VALUES						('VTIQ001'		,'EXAM11'				,	'1'			,	02		,		  	'2'			,'2020-02-06'),
                            ('VTIQ002'		,'EXAM22'				,	'2'			,	12		,   		'3'			,'2020-04-01'),
                            ('VTIQ003'		,'EXAM33'				,	'3'			,	245		,   		'5'			,'2020-05-02'),
                            ('VTIQ004'		,'EXAM44'				,	'4'			,	67		,   		'6'			,'2020-08-08'),
                            ('VTIQ005'		,'EXAM55'				,	'5'			,	51		,   		'8'			,'2020-06-13'),
                            ('VTIQ006'		,'EXAM66'				,	'2'			,	21		,   		'1'			,'2020-07-05'),
                            ('VTIQ007'		,'EXAM77'				,	'3'			,	20		, 			'9'			,'2020-08-08'),
                            ('VTIQ008'		,'EXAM88'				,	'6'			,	77		,   		'2'			,'2020-08-08'),
                            ('VTIQ009'		,'EXAM99'				,	'8'			,	47		,   		'3'			,'2020-04-01'),
                            ('VTIQ010'		,'EXAM10'				,	'9'			,	44		,   		'9'			,'2020-04-01');
                            
-- add data Exam_question table
INSERT INTO Exam_question   (Exam_id		, Question_id		)
VALUES 						('1'			, '3'				),
							('2'			, '5'				),
                            ('1'			, '3'				),
                            ('1'			, '3'				),
                            ('1'			, '3'				),
                            ('2'			, '5'				),
                            ('2'			, '5'				),
                            ('2'			, '5'				),
                            ('2'			, '5'				),
                            ('2'			, '5'				);
                            
                            
-- question2: lay ra tat ca cac phong ban.
SELECT * FROM `Department`		;
SELECT * FROM `Position`		;
SELECT * FROM `Account` 		;
SELECT * FROM `Group`  			;
SELECT * FROM Group_account		;
SELECT * FROM Type_question 	;
SELECT * FROM Category_question ;
SELECT * FROM Question 			;
SELECT * FROM Answer 			;
SELECT * FROM Exam 				;
SELECT * FROM Exam_question		;	

-- question3: lay ra id cua phong ban sale.

SELECT * 
FROM `Department` 
WHERE DepartmentName = 'sale' ;

-- question6 : lay ra ten group da tham gia truoc ngay 20/12/2019.

SELECT Group_name FROM `Group` 
WHERE Create_date  > "2020-12-20" ;

-- question7 : lay ra id cua question >= 4 cau tra loi.
SELECT * FROM Answer
WHERE Question >= "4" ;

-- question 8 : lay ra ma de thi >= 60 phut va tao truoc ngay 20/12/2019
SELECT * FROM Exam
WHERE Duration >= "60" && Create_date < "2019-12-20" ;

-- question 9: lay ra 5 group duoc tao gan nhat.
SELECT * FROM `Group`
WHERE Create_date < "2020-11-03" ;

-- question10: dem so nhan vien thuoc department co id=2
SELECT * FROM `Department` 
WHERE Departmnetid <> "2" ;

-- question 11: lay ra ten nhan vien bat dau bang chu D va ket thuc bang chu O.
SELECT User_name FROM `Account`
WHERE User_name LIKE "D%0" ;

-- question12 : xoa tat ca cac exam duoc tao truoc ngay 20/12/2019.

SET FOREIGN_KEY_CHECK = 0;
DELETE Create_date FROM Exam 
WHERE Create_date < "2019-12-20" ;

-- question13 : xoa tat ca cac question co noi dung bang tu 'cau hoi'.

SET FOREIGN_KEY_CHECK = 0;
DELETE Content FROM Question
WHERE Content LIKE " cau hoi% " ;

-- question14 : update thong tin account co id=5 thanh ten " nguyen ba loc " va update thanh email loc.nguyenba@gmail.com
 

 UPDATE `Account`  
 SET FullName  = " NGUYEN BA LOC " ,
     Email		= ' loc.nguyenba@gmail.com ' 
 WHERE Position_id = '5' ; 











                         
                         
                         