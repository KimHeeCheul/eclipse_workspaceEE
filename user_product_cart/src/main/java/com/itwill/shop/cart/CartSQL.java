package com.itwill.shop.cart;

public class CartSQL {
	/*
	-- 로그인한 guard1 님의 카트 아이템 리스트
	   select * from cart c join product p on c.p_no=p.p_no where c.userid='guard1'
	-- 로그인한 guard1 님이 카트에 카트아이템 제품 차가
	   insert into cart(cart_no,cart_qty,P_no,userid) values(cart_cart_no_seq.nextval,2,1,'guard1');
	---------update--------
	   
	--로그인한 guard1 님의 카트에 제품번호 1번 존재여부(0:insert,1:update)
	-- guard1 카트에 있는 cart_no 1번의 수량 3개 수정
	
	*/
	public static final String CART_SELECT_LIST_BY_USEDID =
			"select * from cart c join product p on c.p_no=p.p_no where c.userid=?";
	public static final String CART_INSERT = 
			"insert into cart(cart_no,cart_qty,P_no,userid) values(cart_cart_no_seq.nextval,?,?,?)";
	public static final String CART_UPDATE_BY_P_NO_USERID =
			"update cart set cart_qty=cart_qty+? where userid=? and p_no=?";
	public static final String CART_SELECT_PRODUCT_COUNT_BY_USERID_P_NO = 
			"select count(*) product_count from cart where userid=? and p_no=?;";
}
