DROP TABLE productdetail CASCADE CONSTRAINTS;
DROP TABLE add CASCADE CONSTRAINTS;
DROP TABLE member CASCADE CONSTRAINTS;
DROP TABLE login CASCADE CONSTRAINTS;
DROP TABLE product CASCADE CONSTRAINTS;

CREATE TABLE product(
		product_no                    		NUMBER(100)		 NULL ,
		product_item                  		VARCHAR2(1000)		 NULL ,
		product_price                 		NUMBER(10)		 NULL ,
		product_ea                    		NUMBER(10)		 NULL ,
		product_content               		VARCHAR2(1000)		 NULL 
);


CREATE TABLE login(
		login_id                      		VARCHAR2(100)		 NULL ,
		login_pass                    		VARCHAR2(100)		 NULL 
);


CREATE TABLE member(
		member_no                     		NUMBER(10)		 NULL ,
		member_id                     		VARCHAR2(100)		 NULL ,
		member_pass                   		NUMBER(100)		 NULL ,
		member_name                   		VARCHAR2(100)		 NULL ,
		member_jumin                  		NUMBER(100)		 NULL ,
		member_address                		VARCHAR2(10000)		 NULL ,
		member_phone                  		NUMBER(100)		 NULL ,
		member_email                  		VARCHAR2(1000)		 NULL 
);


CREATE TABLE add(
		add_shot                      		NUMBER(10)		 DEFAULT 0		 NULL ,
		add_syrup                     		NUMBER(10)		 DEFAULT 0		 NULL 
);


CREATE TABLE productdetail(
		productdetail_no              		NUMBER(100)		 NULL ,
		productdetail_kal             		NUMBER(10)		 NULL ,
		productdetail_na              		NUMBER(10)		 NULL ,
		productdetail_coffeine        		NUMBER(10)		 NULL 
);



ALTER TABLE product ADD CONSTRAINT IDX_product_PK PRIMARY KEY (product_no);
ALTER TABLE product ADD CONSTRAINT IDX_product_1 UNIQUE (No);

ALTER TABLE login ADD CONSTRAINT IDX_login_PK PRIMARY KEY (login_id);
ALTER TABLE login ADD CONSTRAINT Id UNIQUE (Id);

ALTER TABLE member ADD CONSTRAINT IDX_member_PK PRIMARY KEY (member_no);

