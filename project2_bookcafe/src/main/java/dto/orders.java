package dto;

public class orders {
	private int o_no;
	private int o_qty;
	private int o_price;
	private String o_desc;
	private String o_name;
	private int bc_id;

	public orders(int o_no, int o_qty, int o_price, String o_desc, String o_name, int bc_id) {
		super();
		this.o_no = o_no;
		this.o_qty = o_qty;
		this.o_price = o_price;
		this.o_desc = o_desc;
		this.o_name = o_name;
		this.bc_id = bc_id;
	}

	public int getO_no() {
		return o_no;
	}

	public void setO_no(int o_no) {
		this.o_no = o_no;
	}

	public int getO_qty() {
		return o_qty;
	}

	public void setO_qty(int o_qty) {
		this.o_qty = o_qty;
	}

	public int getO_price() {
		return o_price;
	}

	public void setO_price(int o_price) {
		this.o_price = o_price;
	}

	public String getO_desc() {
		return o_desc;
	}

	public void setO_desc(String o_desc) {
		this.o_desc = o_desc;
	}

	public String getO_name() {
		return o_name;
	}

	public void setO_name(String o_name) {
		this.o_name = o_name;
	}

	public int getBc_id() {
		return bc_id;
	}

	public void setBc_id(int bc_id) {
		this.bc_id = bc_id;
	}

	@Override
	public String toString() {
		return "orders [o_no=" + o_no + ", o_qty=" + o_qty + ", o_price=" + o_price + ", o_desc=" + o_desc + ", o_name="
				+ o_name + ", bc_id=" + bc_id + "]";
	}

}
