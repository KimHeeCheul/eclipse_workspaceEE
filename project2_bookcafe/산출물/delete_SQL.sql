----------delete----------
delete from review_board
where userid = 'test1';

delete from member
where userid = 'test1';

delete from userinfo;

delete from review_board;

delete from review_board
where r_no=33;

/*
select count(*) review_count
from review_board 
where bc_id = 'test1';
*/
