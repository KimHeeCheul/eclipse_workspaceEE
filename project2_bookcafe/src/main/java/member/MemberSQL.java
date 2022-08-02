package member;

public class MemberSQL {
	//회원가입
	public final static String MEMBER_INSERT=
			"insert into member (userId, password, name, phone, birth, address, email, interest) values (?, ?, ?, ?, ?, ?, ?, ?)";
	//회원 정보 변경
	public final static String MEMBER_UPDATE=
			"update member set password=?,name=?,phone=?,birth=?,address=?,email=?,interest=? where userId=?";
	//회원 삭제
	public final static String MEMBER_REMOVE=
			"delete member where userId=?";
	//회원 정보
	public final static String MEMBER_SELECT_BY_ID=
			"select userId,password,name,phone,birth,address,email,interest from member where userId=?";
	//회원 전체 정보
	public final static String MEMBER_SELECT_ALL=
			"select userId,password,name,phone,birth,address,email,interest from member";
	//회원 수 확인
	public final static String MEMBER_SELECT_BY_ID_COUNT=
			"select count(*) from member where userId=?";
}
