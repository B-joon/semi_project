DROP SEQUENCE PETBOARD1;
DROP TABLE PETBOARD1;

CREATE SEQUENCE PETBOARDSEQ1;

CREATE TABLE PETBOARD1(
	ARTICLE_NO NUMBER PRIMARY KEY,
	BRD_NO NUMBER NOT NULL,
	MEM_WRITER VARCHAR2(400) NOT NULL,
	PET_TITLE VARCHAR2(1000) NOT NULL,
	PET_CONTENT VARCHAR2(4000) NOT NULL,
	PET_REGDATE DATE NOT NULL,
	PET_HIT NUMBER NOT NULL
);
INSERT INTO PETBOARD1
VALUES (PETBOARDSEQ1.NEXTVAL, 1, '유저', '게시판1번인글', '내용내용', SYSDATE, 1);

INSERT INTO PETBOARD1
VALUES (PETBOARDSEQ1.NEXTVAL, 3, '유저', '게시판3번인글22', '내용내용22', SYSDATE, 1);

INSERT INTO PETBOARD1
VALUES (PETBOARDSEQ1.NEXTVAL, 2, '유저', '게시판2번인글', '내용내용', SYSDATE, 1);

SELECT *
FROM PETBOARD1
ORDER BY ARTICLE_NO DESC