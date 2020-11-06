USE testing_system_assignment_1;

-- question 1 : viet lenh de lay ra danh sach nhan vien va phong ban cua ho.

SELECT *
FROM `Account` 
JOIN Department USING ( DepartmentId ); 

-- question 2 : viet lenh de lay thong tin cac account dc tao sao ngay 20/12/2010.

SELECT *
FROM `Account` 
WHERE Create_date > 2010-12-20 ;

-- question 3 : viet lenh de lay ra cac developer.

SELECT *
FROM Position
JOIN `Account` USING (Position_id) 
WHERE Position_id LIKE 'DEV' ;

-- question 4 : viet lenh de lay ra phong ban co > 3 nhan vien 

SELECT  COUNT(1)
FROM Department
JOIN `Account` USING (DepartmentId )
GROUP BY Department
HAVING COUNT(1) >= 3 ;

-- question 5 : viet lenh de lay ra danh sach cau hoi dc su dung trong nhieu de thi nhat.

SELECT * ,COUNT(1)
 FROM Exam_question
 GROUP BY Question_id
 HAVING COUNT(1)= (   SELECT COUNT(1)
							FROM Exam_question
							Group BY Question_id
							ORDER BY COUNT(1) DESC 
							LIMIT 1 
                            );


-- question 6 : thong ke moi category question duoc su dung trong bao nhieu question

SELECT (Category_id),(Category_name) 
FROM Category_question
RIGHT JOIN Question USING (Category_id)
GROUP BY Category_id
HAVING COUNT(Category_id) ;

-- question7 : thong ke moi question duoc su dung trong bao nhieu exam.
 SELECT (Question_id),(Exam_id)
 FROM Exam_question
 RIGHT JOIN Exam USING (Exam_id)
 GROUP BY Question_id
 HAVING COUNT(Question_id)
 ;

-- question8 :lay ra question co nhieu cau tra loi nhat.
SELECT * ,(q.Question_id) 
FROM Question
LEFT JOIN Answer ON a.Question_id 
GROUP BY q.Question_id
HAVING COUNT(q.Question_id) = ( 
                               SELECT COUNT(1)
                               FROM Answer 
                               GROUP BY a.Question_id 
                               ORDER BY (a.Question_id) DESC
                               LIMIT 1 )
;

-- question 9 : thong ke moi account trong moi group

SELECT COUNT(Account_id),Group_id,Group_name
FROM Group_account
RIGHT JOIN `Group` USING (Group_id)
GROUP BY Group_id ;

-- question10 : tim chuc vu co it nguoi nhat
SELECT COUNT(1)
FROM  `Account`
GROUP BY Position_id
HAVING COUNT(1) = 2;

-- question 11 : thong ke moi phong ban co bao nhieu nnhan vien  thuoc 1 trong 4 chuc vu ( dev,test, master , pm )
 
 SELECT * , COUNT(DepartmentId)
 FROM `Account`
 JOIN `Position` USING (Position_id)
 WHERE Position_name IN( 'DEV', 'TEST' , 'SCRUM MASTER', 'PM')
 GROUP BY DepartmentId ; 
 
 -- question 13 lay ra so luong cau hoi cua moi loai tu luan hay trac nghiem
 
 SELECT (Type_id),(Type_name) AS 'loai cau hoi' ,COUNT(Type_id) AS 'SO LUONG CAU HOI',
 GROUP_CONCAT(q_Content) AS 'CAU HOI CU THE'
 FROM Type_question
 JOIN Question USING (Type_id)
 GROUP BY Type_id ;
 
 -- question 14 + 15: lay ra group khong co account nao.
 
 SELECT *
 FROM Group_account
 JOIN `Group` USING (Group_id)
 WHERE Account_id IS NULL ;

-- question 16 : lay ra question khong co answer nao.

SELECT *
FROM Question
JOIN Answer USING (Question_id)
WHERE Question_id IS NULL
;

-- question 17 : lay account thuoc nhom 1 va nhom 2 sao cho k co record nao trung nhau.
SELECT * 
FROM Group_account
WHERE Account_id = 1
UNION
SELECT *
FROM Group_account
WHERE Account_id = 2 ;

-- question 18 : lay cac group co nhieu hon 5 thanh vien va group co nhieu hon 7 thanh vien . Nhom 2 ket qua lai vs nhau.

SELECT *, COUNT(Group_id) AS "SO THANH VIEN" 
FROM `Group`
JOIN Group_account USING (Group_id)
HAVING COUNT(Group_id) > 5

UNION ALL
 
SELECT *, COUNT(Group_id) AS "SO THANH VIEN" 
FROM `Group`
JOIN Group_account USING (Group_id)
HAVING COUNT(Group_id) > 7
;