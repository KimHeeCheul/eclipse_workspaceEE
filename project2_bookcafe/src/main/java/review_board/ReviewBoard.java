package review_board;

import java.sql.Date;

import member.Member;
import product.product;

public class ReviewBoard {
	private int r_no;
	private Date r_date;
	private String r_title;
	private String r_content;
	private int r_count;
	/*********** Member ************/
	private Member userId;
	/*********** product ************/
	private product p_no;

	public ReviewBoard(int r_no, Date r_date, String r_title, String r_content, int r_count, Member userId,
			product p_no) {
		super();
		this.r_no = r_no;
		this.r_date = r_date;
		this.r_title = r_title;
		this.r_content = r_content;
		this.r_count = r_count;
		this.userId = userId;
		this.p_no = p_no;
	}

	public int getR_no() {
		return r_no;
	}

	public void setR_no(int r_no) {
		this.r_no = r_no;
	}

	public Date getR_date() {
		return r_date;
	}

	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}

	public String getR_title() {
		return r_title;
	}

	public void setR_title(String r_title) {
		this.r_title = r_title;
	}

	public String getR_content() {
		return r_content;
	}

	public void setR_content(String r_content) {
		this.r_content = r_content;
	}

	public int getR_count() {
		return r_count;
	}

	public void setR_count(int r_count) {
		this.r_count = r_count;
	}

	public Member getUserId() {
		return userId;
	}

	public void setUserId(Member userId) {
		this.userId = userId;
	}

	public product getP_no() {
		return p_no;
	}

	public void setP_no(product p_no) {
		this.p_no = p_no;
	}

	@Override
	public String toString() {
		return "review_board [r_no=" + r_no + ", r_date=" + r_date + ", r_title=" + r_title + ", r_content=" + r_content
				+ ", r_count=" + r_count + ", userId=" + userId + ", p_no=" + p_no + "]";
	}

}
