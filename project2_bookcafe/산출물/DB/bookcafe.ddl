DROP TABLE orderlist CASCADE CONSTRAINTS;
DROP TABLE qna CASCADE CONSTRAINTS;
DROP TABLE cart CASCADE CONSTRAINTS;
DROP TABLE orders CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;
DROP TABLE category CASCADE CONSTRAINTS;
DROP TABLE userinfo CASCADE CONSTRAINTS;

CREATE TABLE userinfo(
		bc_id                         		VARCHAR2(30)		 NOT NULL,
		bc_password                   		VARCHAR2(30)		 NOT NULL,
		bc_name                       		VARCHAR2(30)		 NOT NULL,
		bc_birth                      		NUMBER(20)		 NOT NULL,
		bc_gender                     		VARCHAR2(1)		 NOT NULL,
		bc_phone                      		VARCHAR2(20)		 NOT NULL,
		bc_email                      		VARCHAR2(100)		 NOT NULL,
		bc_address                    		VARCHAR2(1000)		 NOT NULL
);


CREATE TABLE category(
		ca_no                         		NUMBER(10)		 NOT NULL,
		ca_name                       		VARCHAR2(50)		 NULL 
);

DROP SEQUENCE category_ca_no_SEQ;

CREATE SEQUENCE category_ca_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE product(
		p_no                          		NUMBER(10)		 NOT NULL,
		p_bookname                    		VARCHAR2(500)		 NULL ,
		p_image                       		VARCHAR2(100)		 NULL ,
		p_content                     		VARCHAR2(1000)		 NULL ,
		p_pirce                       		NUMBER(10)		 NULL ,
		p_date                        		DATE		 NULL ,
		ca_no                         		NUMBER(10)		 NULL 
);

DROP SEQUENCE product_p_no_SEQ;

CREATE SEQUENCE product_p_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE orders(
		o_no                          		NUMBER(10)		 NOT NULL,
		o_qty                         		NUMBER(10)		 NULL ,
		o_price                       		NUMBER(10)		 NULL ,
		o_desc                        		VARCHAR2(1000)		 NULL ,
		o_name                        		VARCHAR2(50)		 NULL ,
		bc_id                         		VARCHAR2(30)		 NULL 
);

DROP SEQUENCE orders_o_no_SEQ;

CREATE SEQUENCE orders_o_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;


CREATE TABLE cart(
		c_no                          		NUMBER(10)		 NOT NULL,
		c_qty                         		NUMBER(10)		 NULL ,
		bc_id                         		VARCHAR2(30)		 NULL ,
		bc_no                         		NUMBER(10)		 NULL 
);

DROP SEQUENCE cart_c_no_SEQ;

CREATE SEQUENCE cart_c_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;



CREATE TABLE qna(
		q_no                          		NUMBER(10)		 NOT NULL,
		q_title                       		VARCHAR2(100)		 NULL ,
		q_content                     		VARCHAR2(2000)		 NULL ,
		q_date                        		DATE		 NULL ,
		q_count                       		NUMBER(10)		 NULL ,
		q_group                       		NUMBER(10)		 NULL ,
		bc_id                         		VARCHAR2(30)		 NULL 
);

DROP SEQUENCE qna_q_no_SEQ;

CREATE SEQUENCE qna_q_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;




CREATE TABLE orderlist(
		ol_no                         		NUMBER(10)		 NOT NULL,
		ol_qty                        		NUMBER(10)		 NULL ,
		bc_no                         		NUMBER(10)		 NULL ,
		o_no                          		NUMBER(10)		 NULL 
);



ALTER TABLE userinfo ADD CONSTRAINT IDX_userinfo_PK PRIMARY KEY (bc_id);

ALTER TABLE category ADD CONSTRAINT IDX_category_PK PRIMARY KEY (ca_no);

ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (p_no);
ALTER TABLE product ADD CONSTRAINT IDX_product_FK0 FOREIGN KEY (ca_no) REFERENCES cataegory (ca_no);

ALTER TABLE orders ADD CONSTRAINT IDX_orders_PK PRIMARY KEY (o_no);
ALTER TABLE orders ADD CONSTRAINT IDX_orders_FK0 FOREIGN KEY (bc_id) REFERENCES userinfo (bc_id);

ALTER TABLE cart ADD CONSTRAINT IDX_cart_PK PRIMARY KEY (c_no);
ALTER TABLE cart ADD CONSTRAINT IDX_cart_FK0 FOREIGN KEY (bc_id) REFERENCES userinfo (bc_id);

ALTER TABLE qna ADD CONSTRAINT IDX_qna_PK PRIMARY KEY (q_no);
ALTER TABLE qna ADD CONSTRAINT IDX_qna_FK0 FOREIGN KEY (bc_id) REFERENCES userinfo (bc_id);

ALTER TABLE orderlist ADD CONSTRAINT IDX_orderlist_PK PRIMARY KEY (ol_no);
ALTER TABLE orderlist ADD CONSTRAINT IDX_orderlist_FK1 FOREIGN KEY (o_no) REFERENCES orders (o_no);

