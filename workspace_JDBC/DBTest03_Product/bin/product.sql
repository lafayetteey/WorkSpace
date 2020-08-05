DROP TABLE PRODUCT_DETAIL;

CREATE TABLE PRODUCT(
	P_ID VARCHAR2(20)	PRIMARY KEY,
	P_NAME VARCHAR2(20) NOT NULL,
	PRICE NUMBER NOT NULL,
	DES VARCHAR2(20)
);

SELECT * FROM PRODUCT;

INSERT INTO PRODUCT VALUES ('LT_SS7' , '삼성 노트북' , 1570000 ,  '갤럭시북 이온' );
INSERT INTO PRODUCT VALUES ('LT_AMP1' , '맥북프로' , 3900000 ,  'MACBOOK PRO 16' );
INSERT INTO PRODUCT VALUES ('PC_IBM' , 'IBMPC' , 750000 ,  'WINDOWS8' );
