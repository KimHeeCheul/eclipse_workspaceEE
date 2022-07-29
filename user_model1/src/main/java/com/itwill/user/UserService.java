package com.itwill.user;

public class UserService {
	private UserDao userDao;

	public UserService() throws Exception {
		userDao = new UserDao();
	}
	/*
	 * 회원가입
	 */
	public int create(User user) throws Exception{
		/*
		 * -1:아이디 중복
		 *  1:회원가입 성공
		 */
		//1.아이디 중복체크
		if(userDao.existedUser(user.getUserId())) {
			//아이디 중복
			return -1;
		}else {
			//아이디 중복 x
			//2.회원가입
			int insertRowCount = userDao.create(user);
			return insertRowCount;
		}
		
	}
	/*
	 * 회원 로그인
	 * 	0:아이디존재안함
	 * 	1:패쓰워드 불일치
	 * 	2:로그인성공(세션)
	 */
	public int login(String userId,String password) throws Exception{
		int result = -1; // 반환데이타 초기화
		//1.아이디 존재 여부 확인
		User user = userDao.findUser(userId);
		if(user==null) {
			//아이디가 존재 안함
			result=0;
		}else {
			//아이디 존재 함
			if(user.isMatchPassword(password)) {
				//패스워드 일치
				result=2;
			}else {
				//패스워드 불일치
				result=1;
			}
		}
		return result;
	}
	/*
	 * 회원 상세보기
	 */
	public User findUser(String userId) throws Exception{
		return userDao.findUser(userId);
	}
	/*
	 * 회원수정
	 */
	public int update(User user) throws Exception{
		return userDao.update(user);
	}
	/*
	 * 회원탈퇴
	 */
	public int remove(String userId) throws Exception{
		
		return userDao.remove(userId);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
