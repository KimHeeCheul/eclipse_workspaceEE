package member;

import java.sql.Date;
/*
USERID	VARCHAR2(100 BYTE)	No		1	
PASSWORD	VARCHAR2(100 BYTE)	Yes		2	
NAME	VARCHAR2(100 BYTE)	Yes		3	
PHONE	VARCHAR2(100 BYTE)	Yes		4	
BIRTH	VARCHAR2(100 BYTE)	Yes		5	
ADDRESS	VARCHAR2(100 BYTE)	Yes		6	
EMAIL	VARCHAR2(100 BYTE)	Yes		7	
INTEREST	VARCHAR2(200 BYTE)	Yes		8	
 */

public class member {
	private String userId;
	private String password;
	private String name;
	private String phone;
	private String birth;
	private String address;
	private String email;
	private String interest;

	public member(String userId, String password, String name, String phone, String birth, String address,
			String email, String interest) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.birth = birth;
		this.address = address;
		this.email = email;
		this.interest = interest;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "product [userId=" + userId + ", password=" + password + ", name=" + name + ", phone=" + phone
				+ ", birth=" + birth + ", address=" + address + ", email=" + email + ", interest=" + interest + "]";
	}

}
