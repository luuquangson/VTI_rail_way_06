


create table  Department1 (
 Department_id   INT,
 Department_name2   varchar(50)
 );
 
 create table Position (
 Position_id int,
 Position_name varchar (50)
 );
 
 create table  Account2 (
  account_id  int,
  Email varchar(50),
  Username varchar (50),
  Fullname varchar (50),
  Department_id varchar (50),
  Positon_id varchar (50),
  Create_date  date
  );
  
  create table Group1 (
  Group_id varchar (50),
  Group_name varchar (50),
  Creator_id int,
  Create_date date
  );
  
 create table Group_account (
 Group_id varchar (50),
 Account_id varchar (50),
 John_date date
 );
  
create table Type_question (
Type_id varchar (50),
Type_name varchar (50)
);

create table category_question (
Category_id varchar (50),
Category_name varchar (50)
);

create table Question (
Questio_id varchar (50),
Content varchar (50),
Category_id varchar (50),
Type_id varchar (50),
Creator_id int,
Create_date date
);


create table answer (
Answer_id varchar (50),
Content varchar (50),
Question varchar (50),
Iscorrect varchar (50)
);
       
 create table Exam (
 Exam_id int,
 Code1 int,
 title varchar(50),
 category varchar(50),
 duration date,
 creator_id int,
 create_date date
 );
 
 create table exam_question (
 exam_id varchar(50),
 question_id varchar (50)
 );

 
