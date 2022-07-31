package dto;

public class orderlist {
	private int ol_no;
	private int ol_qty;
	private int bc_no;
	private int o_no;

	public orderlist(int ol_no, int ol_qty, int bc_no, int o_no) {
		super();
		this.ol_no = ol_no;
		this.ol_qty = ol_qty;
		this.bc_no = bc_no;
		this.o_no = o_no;
	}

	public int getOl_no() {
		return ol_no;
	}

	public void setOl_no(int ol_no) {
		this.ol_no = ol_no;
	}

	public int getOl_qty() {
		return ol_qty;
	}

	public void setOl_qty(int ol_qty) {
		this.ol_qty = ol_qty;
	}

	public int getBc_no() {
		return bc_no;
	}

	public void setBc_no(int bc_no) {
		this.bc_no = bc_no;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	@Override
	public String toString() {
		return "orderlist [ol_no=" + ol_no + ", ol_qty=" + ol_qty + ", bc_no=" + bc_no + ", o_no=" + o_no + "]";
	}

}