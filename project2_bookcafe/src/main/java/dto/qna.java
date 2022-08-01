package dto;

import java.sql.Date;

public class qna {
	private int q_no;
	private String q_title;
	private String q_content;
	private Date q_date;
	private int q_count;
	private int q_group;
	private String bc_id;

	public qna(int q_no, String q_title, String q_content, Date q_date, int q_count, int q_group, String bc_id) {
		super();
		this.q_no = q_no;
		this.q_title = q_title;
		this.q_content = q_content;
		this.q_date = q_date;
		this.q_count = q_count;
		this.q_group = q_group;
		this.bc_id = bc_id;
	}

	public int getQ_no() {
		return q_no;
	}

	public void setQ_no(int q_no) {
		this.q_no = q_no;
	}

	public String getQ_title() {
		return q_title;
	}

	public void setQ_title(String q_title) {
		this.q_title = q_title;
	}

	public String getQ_content() {
		return q_content;
	}

	public void setQ_content(String q_content) {
		this.q_content = q_content;
	}

	public Date getQ_date() {
		return q_date;
	}

	public void setQ_date(Date q_date) {
		this.q_date = q_date;
	}

	public int getQ_count() {
		return q_count;
	}

	public void setQ_count(int q_count) {
		this.q_count = q_count;
	}

	public int getQ_group() {
		return q_group;
	}

	public void setQ_group(int q_group) {
		this.q_group = q_group;
	}

	public String getBc_id() {
		return bc_id;
	}

	public void setBc_id(String bc_id) {
		this.bc_id = bc_id;
	}

	@Override
	public String toString() {
		return "qna [q_no=" + q_no + ", q_title=" + q_title + ", q_content=" + q_content + ", q_date=" + q_date
				+ ", q_count=" + q_count + ", q_group=" + q_group + ", bc_id=" + bc_id + "]";
	}

}
