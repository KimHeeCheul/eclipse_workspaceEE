----------delete----------
delete from review_board
where bc_id = 'test1';

delete from userinfo
where bc_id = 'test1';

delete from userinfo;

delete from review_board;

/*
select count(*) review_count
from review_board 
where bc_id = 'test1';
*/
