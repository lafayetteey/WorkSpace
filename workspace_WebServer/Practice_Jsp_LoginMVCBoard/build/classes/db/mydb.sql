DROP SEQUENCE MYNOSEQ;
DROP TABLE MYMEMBER;

CREATE SEQUENCE MYNOSEQ NOCACHE;

CREATE TABLE MYMEMBER(
   MYNO NUMBER NOT NULL,
   MYID VARCHAR2(500) NOT NULL,
   MYPW VARCHAR2(500) NOT NULL,
   MYNAME VARCHAR2(1000) NOT NULL,
   MYADDR VARCHAR2(4000) NOT NULL,
   MYPHONE VARCHAR2(20) NOT NULL,
   MYEMAIL VARCHAR2(100) NOT NULL,
   MYENABLED VARCHAR2(2) NOT NULL,
   MYROLE VARCHAR2(50) NOT NULL,
   CONSTRAINT MEMBER_PK PRIMARY KEY(MYNO),
   CONSTRAINT MEMBER_UQ_ID UNIQUE(MYID),
   CONSTRAINT MEMBER_UQ_EMAIL UNIQUE(MYEMAIL),
   CONSTRAINT MEMBER_UQ_PHONE UNIQUE(MYPHONE),
   CONSTRAINT MEMBER_ENABLED_CHK CHECK(MYENABLED IN('Y','N') )
);

INSERT INTO MYMEMBER VALUES
(MYNOSEQ.NEXTVAL , 'ADMIN' , 'ADMIN1234' , '관리자' , '관리시 관리구 관리동' , '010-1234-5678' , 'ADMIN@ADMIN.COM' , 'Y' , 'ADMIN');

INSERT INTO MYMEMBER VALUES
(MYNOSEQ.NEXTVAL , 'USER1' , 'USER1' , '이창진' , '서울시 강남구 역삼동' , '010-5675-1234' , 'LEECH@KH.CO.KR' , 'Y' , 'USER');

INSERT INTO MYMEMBER VALUES
(MYNOSEQ.NEXTVAL , 'USER2' , 'USER2' , '김승진' , '서울시 관악구 신림동' , '010-3244-9845' , 'JASON@GOOGLE.COM' , 'N' , 'USER');

SELECT * FROM MYMEMBER;


DROP SEQUENCE MVCBOARDSEQ;
DROP TABLE MVCBOARD;

CREATE SEQUENCE MVCBOARDSEQ;

--번호 , 작성자 , 제목 , 내용 , 작성일자
CREATE TABLE MVCBOARD(
	 SEQ NUMBER PRIMARY KEY,
	 WRITER VARCHAR2(100) NOT NULL,
	 TITLE VARCHAR2(2000) NOT NULL,
	 CONTENT VARCHAR2(2000) NOT NULL,
	 REGDATE DATE NOT NULL
);

INSERT INTO MVCBOARD VALUES
(MVCBOARDSEQ.NEXTVAL , '관리자' , '테스트' , '테스트중입니다...ABCD1234' , SYSDATE);
SELECT * FROM MVCBOARD;