package com.itwill.shop.cart;

public class CartSQL {
	/*
	-- guard1 멤버한사람의  카트에 제품번호 존재여부
	   select * from cart c join product p on c.p_no=p.p_no where c.userid='guard1'
	*/
	public static final String CART_SELECT_LIST_BY_USEDID="select * from cart c join product p on c.p_no=p.p_no where c.userid=?";
	
}
