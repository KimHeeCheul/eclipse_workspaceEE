----------insert----------
insert into userinfo
values ('kim','1111','김','010-1234-1234','221111-1111111','서울시 강동구','kim@naver.com','공예');
insert into userinfo
values ('lee','2222','이','010-1234-1234','221111-1111111','서울시 강서구','lee@naver.com','등산');
insert into userinfo
values ('park','3333','박','010-1234-1234','221111-1111111','서울시 강남구','park@naver.com','골프');
insert into userinfo
values ('choi','4444','최','010-1234-1234','221111-1111111','서울시 강북구','choi@naver.com','낚시');
insert into userinfo
values ('test1','5555','test','010-1234-1234','221111-1111111','경기도 시흥시','test@naver.com','음악감상');


insert into review_board
values (review_board_r_no_SEQ.nextval,sysdate,'내용','설명','kim',2);
insert into review_board
values (review_board_r_no_SEQ.nextval,sysdate,'내용','설명','lee',2);
insert into review_board
values (review_board_r_no_SEQ.nextval,sysdate,'내용','설명','park',2);
insert into review_board
values (review_board_r_no_SEQ.nextval,sysdate,'내용','설명','choi',2);
insert into review_board
values (review_board_r_no_SEQ.nextval,sysdate,'내용','설명','test1',2);


insert into CATEGORY
values (category_ca_no_SEQ.nextval,'베스트셀러');


insert into productlist
values (product_p_no_SEQ.nextval,'불편한 편의점','이미지','책',15000,sysdate,1);