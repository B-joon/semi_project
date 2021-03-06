DROP SEQUENCE DONATESEQ;
DROP TABLE DONATE;

CREATE SEQUENCE DONATESEQ;

CREATE TABLE DONATE(
	DONATE_NO NUMBER PRIMARY KEY,
	DONATE_NAME VARCHAR2(20) NOT NULL,
	DONATE_PHONE VARCHAR2(100) NOT NULL,
	DONATE_TYPE VARCHAR2(20) NOT NULL,
	DONATE_PAY NUMBER NOT NULL,
	DONATE_DATE DATE NOT NULL
);

INSERT INTO DONATE
VALUES(DONATESEQ.NEXTVAL, '최봉준', '010-8560-7682', 'kakaopay', 40000, SYSDATE);

INSERT INTO DONATE
VALUES(DONATESEQ.NEXTVAL, '차가람', '010-7332-6233', 'kakaopay', 30000, SYSDATE);

SELECT DONATE_NO, DONATE_NAME, DONATE_PHONE, DONATE_TYPE, DONATE_PAY, DONATE_DATE
FROM DONATE
ORDER BY DONATE_NO DESC;