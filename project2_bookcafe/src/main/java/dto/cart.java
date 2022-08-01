package dto;

public class cart {
	private int c_no;
	private int c_qty;
	private String bc_id;
	private int bc_no;

	public cart(int c_no, int c_qty, String bc_id, int bc_no) {
		super();
		this.c_no = c_no;
		this.c_qty = c_qty;
		this.bc_id = bc_id;
		this.bc_no = bc_no;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public int getC_qty() {
		return c_qty;
	}

	public void setC_qty(int c_qty) {
		this.c_qty = c_qty;
	}

	public String getBc_id() {
		return bc_id;
	}

	public void setBc_id(String bc_id) {
		this.bc_id = bc_id;
	}

	public int getBc_no() {
		return bc_no;
	}

	public void setBc_no(int bc_no) {
		this.bc_no = bc_no;
	}

	@Override
	public String toString() {
		return "cart [c_no=" + c_no + ", c_qty=" + c_qty + ", bc_id=" + bc_id + ", bc_no=" + bc_no + "]";
	}

}
