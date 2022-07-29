package com.itwill.shop.cart;

import com.itwill.shop.product.Product;
import com.itwill.shop.user.User;

/*
이름       널?       유형            
-------- -------- ------------- 
CART_NO  NOT NULL NUMBER(10)    
USERID            VARCHAR2(100) 
P_NO              NUMBER(10)    
CART_QTY          NUMBER(10)    
 */
public class CartItem {
	private int cart_no;
	private int cart_qty;
	
	/*
	private int p_no;		//FK
	private User user;		//cart에서는 유저 를 가지고 오는 행위는 많이 안할것
	*/
	private Product product;
	private String userid;	//FK

	public CartItem() {

	}

	public CartItem(int cart_no, int cart_qty, Product product, String userid) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.product = product;
		this.userid = userid;
	}//필요할때마다 넣어도 된다 없으면 비워도 상관없다

	
	public int getCart_no() {
		return cart_no;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "CartItem [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", product=" + product + ", userid=" + userid
				+ "]";
	}
	
}
