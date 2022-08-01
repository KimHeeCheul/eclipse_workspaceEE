package dto;

public class userinfo {
	private String bc_id;
	private String bc_password;
	private String bc_name;
	private int bc_birth;
	private String bc_gender;
	private int bc_phone;
	private String bc_email;
	private String bc_address;

	public userinfo(String bc_id, String bc_password, String bc_name, int bc_birth, String bc_gender, int bc_phone,
			String bc_email, String bc_address) {
		super();
		this.bc_id = bc_id;
		this.bc_password = bc_password;
		this.bc_name = bc_name;
		this.bc_birth = bc_birth;
		this.bc_gender = bc_gender;
		this.bc_phone = bc_phone;
		this.bc_email = bc_email;
		this.bc_address = bc_address;
	}

	public String getBc_id() {
		return bc_id;
	}

	public void setBc_id(String bc_id) {
		this.bc_id = bc_id;
	}

	public String getBc_password() {
		return bc_password;
	}

	public void setBc_password(String bc_password) {
		this.bc_password = bc_password;
	}

	public String getBc_name() {
		return bc_name;
	}

	public void setBc_name(String bc_name) {
		this.bc_name = bc_name;
	}

	public int getBc_birth() {
		return bc_birth;
	}

	public void setBc_birth(int bc_birth) {
		this.bc_birth = bc_birth;
	}

	public String getBc_gender() {
		return bc_gender;
	}

	public void setBc_gender(String bc_gender) {
		this.bc_gender = bc_gender;
	}

	public int getBc_phone() {
		return bc_phone;
	}

	public void setBc_phone(int bc_phone) {
		this.bc_phone = bc_phone;
	}

	public String getBc_email() {
		return bc_email;
	}

	public void setBc_email(String bc_email) {
		this.bc_email = bc_email;
	}

	public String getBc_address() {
		return bc_address;
	}

	public void setBc_address(String bc_address) {
		this.bc_address = bc_address;
	}

	@Override
	public String toString() {
		return "userinfo [bc_id=" + bc_id + ", bc_password=" + bc_password + ", bc_name=" + bc_name + ", bc_birth="
				+ bc_birth + ", bc_gender=" + bc_gender + ", bc_phone=" + bc_phone + ", bc_email=" + bc_email
				+ ", bc_address=" + bc_address + "]";
	}

}
