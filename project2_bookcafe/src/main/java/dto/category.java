package dto;

public class category {
	private int ca_no;
	private String ca_name;
	
	public category(int ca_no, String ca_name) {
		super();
		this.ca_no = ca_no;
		this.ca_name = ca_name;
	}

	public int getCa_no() {
		return ca_no;
	}

	public void setCa_no(int ca_no) {
		this.ca_no = ca_no;
	}

	public String getCa_name() {
		return ca_name;
	}

	public void setCa_name(String ca_name) {
		this.ca_name = ca_name;
	}

	@Override
	public String toString() {
		return "category [ca_no=" + ca_no + ", ca_name=" + ca_name + "]";
	}

}
