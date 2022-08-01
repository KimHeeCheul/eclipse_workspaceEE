package dto;

import java.sql.Date;

public class product {
	private int p_no;
	private String p_bookname;
	private String p_image;
	private String p_content;
	private int p_price;
	private Date p_date;
	private int ca_no;

	public product(int p_no, String p_bookname, String p_image, String p_content, int p_price, Date p_date, int ca_no) {
		super();
		this.p_no = p_no;
		this.p_bookname = p_bookname;
		this.p_image = p_image;
		this.p_content = p_content;
		this.p_price = p_price;
		this.p_date = p_date;
		this.ca_no = ca_no;
	}

	public int getP_no() {
		return p_no;
	}

	public void setP_no(int p_no) {
		this.p_no = p_no;
	}

	public String getP_bookname() {
		return p_bookname;
	}

	public void setP_bookname(String p_bookname) {
		this.p_bookname = p_bookname;
	}

	public String getP_image() {
		return p_image;
	}

	public void setP_image(String p_image) {
		this.p_image = p_image;
	}

	public String getP_content() {
		return p_content;
	}

	public void setP_content(String p_content) {
		this.p_content = p_content;
	}

	public int getP_price() {
		return p_price;
	}

	public void setP_price(int p_price) {
		this.p_price = p_price;
	}

	public Date getP_date() {
		return p_date;
	}

	public void setP_date(Date p_date) {
		this.p_date = p_date;
	}

	public int getCa_no() {
		return ca_no;
	}

	public void setCa_no(int ca_no) {
		this.ca_no = ca_no;
	}

	@Override
	public String toString() {
		return "product [p_no=" + p_no + ", p_bookname=" + p_bookname + ", p_image=" + p_image + ", p_content="
				+ p_content + ", p_price=" + p_price + ", p_date=" + p_date + ", ca_no=" + ca_no + "]";
	}

}
