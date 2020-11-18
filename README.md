# Batch7MiniProject

create table Business_Segment (Bus_Seg_Id varchar2(10), Bus_Seg_Seq numeric(3), Bus_Seg_Name varchar2(10));


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


 create table Accounts(Account_Number numeric(10) PRIMARY KEY,Insured_Name varchar(30),Insured_Street varchar(40),Insured_City varchar(15),Insured_State varchar(15),Insured_Zip numeric(5),Business_Segment varchar(30));
 
 
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
 Create table Policy_Questions(Pol_Ques_Id VARCHAR(10),
  2  Pol_Ques_Seq NUMBER(3),
  3  Pol_Ques_Desc VARCHAR(80),
  4  Pol_Ques_Ans1 VARCHAR(30),
  5  Pol_Ques_Ans1_Weightage NUMBER(5),
  6  Pol_Ques_Ans2 VARCHAR(30),
  7  Pol_Ques_Ans2_Weightage NUMBER(5),
  8  Pol_Ques_Ans3 VARCHAR(30),
  9  Pol_Ques_Ans3_Weightage NUMBER(5),
 10  Pol_Ques_Ans4 VARCHAR(30),
 11  Pol_Ques_Ans4_Weightage NUMBER(5));





