---------------------------catagory---------------------------
insert into CATEGORY
values (category_ca_no_SEQ.nextval,'베스트셀러');
insert into CATEGORY
values (category_ca_no_SEQ.nextval,'신간도서');
insert into CATEGORY
values (category_ca_no_SEQ.nextval,'국내도서');
insert into CATEGORY
values (category_ca_no_SEQ.nextval,'외국도서');
---------------------------product---------------------------
insert into product
values (product_p_no_SEQ.nextval,'불편한 편의점','이미지','책',15000,sysdate,1);
insert into product
values (product_p_no_SEQ.nextval,'역행자','이미지','책',15000,sysdate,1);
insert into product
values (product_p_no_SEQ.nextval,'작별하지 않는다','이미지','책',14000,sysdate,2);
insert into product
values (product_p_no_SEQ.nextval,'생각하고 싶어서 떠난 핀란드 여행','이미지','책',11700,sysdate,2);
insert into product
values (product_p_no_SEQ.nextval,'매일을 헤엄치는 법','이미지','책',15000,sysdate,3);
insert into product
values (product_p_no_SEQ.nextval,'골목의 조','이미지','책',15000,sysdate,3);
insert into product
values (product_p_no_SEQ.nextval,'english1','이미지','책',15000,sysdate,4);
insert into product
values (product_p_no_SEQ.nextval,'english2','이미지','책',15000,sysdate,4);
---------------------------userinfo---------------------------
insert into USERINFO(bc_id,bc_password,bc_name,bc_birth,bc_gender,bc_phone,bc_email,bc_address)values ('kim','1111','철','221111','M','01011111111','kim@naver.com','서울시 강서구');
insert into USERINFO(bc_id,bc_password,bc_name,bc_birth,bc_gender,bc_phone,bc_email,bc_address)values ('lee','2222','이','221112','F','01022222222','lee@naver.com','서울시 강동구');
insert into USERINFO(bc_id,bc_password,bc_name,bc_birth,bc_gender,bc_phone,bc_email,bc_address)values ('park','3333','박','221113','M','01033333333','park@naver.com','서울시 강북구');
insert into USERINFO(bc_id,bc_password,bc_name,bc_birth,bc_gender,bc_phone,bc_email,bc_address)values ('choi','4444','최','221114','F','01055555555','choi@naver.com','서울시 강남구');
insert into USERINFO(bc_id,bc_password,bc_name,bc_birth,bc_gender,bc_phone,bc_email,bc_address)values ('test','4444','test','221114','F','01066666666','test@naver.com','서울시 강남구');
---------------------------cart---------------------------
insert into cart
values (cart_c_no_SEQ.nextval,1,'kim',1);
insert into cart
values (cart_c_no_SEQ.nextval,3,'lee',2);
---------------------------qna---------------------------
insert into qna
values (qna_q_no_SEQ.nextval,'공지사항','test',sysdate,1,3,'kim');
---------------------------orders---------------------------
insert into orders
values (orders_o_no_SEQ.nextval,1,15000,'재책','책이','lee');
---------------------------orderlist---------------------------
insert into orderlist
values (1,1,1,1);
