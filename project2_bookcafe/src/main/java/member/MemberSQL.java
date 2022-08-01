package member;

public class MemberSQL {
	public final static String MEMBER_INSERT=
			"insert into member (userId,password,name,phone,birth,address,email,interest) values (?,?,?,?,?,?,?,?)";
	public final static String MEMBER_UPDATE=
			"update member set password=?,name=?,phone=?,birth=?,address=?,email=?,interest=? where userId=?";
	public final static String MEMBER_REMOVE=
			"delete member where userId=?";
	public final static String MEMBER_SELECT_BY_ID=
			"select userId,password,name,phone,birth,address,email,interest from member where userId=?";
	public final static String MEMBER_SELECT_ALL=
			"select userId,password,name,phone,birth,address,email,interest from member";
	public final static String MEMBER_SELECT_BY_ID_COUNT=
			"select count(*) from member where userId=?";
}
