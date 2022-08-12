package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.summer.Controller;
import com.itwill.user.User;
import com.itwill.user.UserService;

public class UserLoginActionController implements Controller {
	private UserService userService;

	public UserLoginActionController() throws Exception {
		userService = new UserService();
	}

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		/*
			0  . GET방식요청일때 user_login_form.do로 forwardPath 반환
			1  . 파라메타 받기
			2  . UserService객체생성
			3  . UserService.login() 메쏘드실행
			 회원로그인
			0:아이디존재안함
			1:패쓰워드 불일치
			2:로그인성공(세션)
		*/
		String forwardPath = "";
		try {
			if (request.getMethod().equalsIgnoreCase("GET")) {
				forwardPath = "redirect:user_login_form.do";// 여기서 포워딩을 해도 되긴 된다
				return forwardPath;
			}

			String userId = request.getParameter("userId");
			String password = request.getParameter("password");
			int result = userService.login(userId, password);
			/*
			 * 회원로그인
			 * 0:아이디존재안함		ㅡ>	forward:/WEB-INF/views/user_login_form.jsp forwardPath 반환
			 * 1:패쓰워드 불일치	ㅡ>	forward:/WEB-INF/views/user_login_form.jsp forwardPath 반환
			 * 2:로그인성공(세션)	ㅡ>	redirect:user_main.do					   redirect 반환
			 */
			if (result == 0) {
				// 0:아이디존재안함
				String msg1 = userId + " 는 존재하지않는 아이디입니다.";
				request.setAttribute("msg1", msg1);
				User fuser = new User(userId, password, "", "");
				request.setAttribute("fuser", fuser);
				forwardPath = "forward:/WEB-INF/views/user_login_form.jsp";

			} else if (result == 1) {
				// 1:패쓰워드 불일치
				String msg2 = "패쓰워드가 일치하지 않습니다.";
				request.setAttribute("msg2", msg2);
				User fuser = new User(userId, password, "", "");
				request.setAttribute("fuser", fuser);
				forwardPath = "forward:/WEB-INF/views/user_login_form.jsp";
			} else if (result == 2) {
				// 2:로그인성공(세션)
				// session.setAttribute("sUserId", userId);//웹 컴포넌트가 아니기 때문에 세션은 없다
				HttpSession session = request.getSession();// 바인딩 혹은 생성 그러나 forward하면 무조건 바인딩
				session.setAttribute("sUserId", userId);
				forwardPath = "redirect:user_main.do";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/views/user_error.jsp";
		}
		return forwardPath;
	}

}
