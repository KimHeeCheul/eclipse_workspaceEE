package com.itwill.user.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itwill.summer.Controller;
import com.itwill.user.User;
import com.itwill.user.UserService;

public class UserWriteActionController implements Controller{
	private UserService userService;
	
	public UserWriteActionController() throws Exception {
		userService = new UserService();
	}
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		/*
		0  . GET방식요청일때 redirect:user_main.do  forwardPath 반환
		1  . 요청객체 인코딩설정
	    2  . 파라메타 받기
	    3  . UserService객체생성
	    4  . UserService.create() 메쏘드실행
	    5-1. 아이디중복이면  forward:WEB-INF/views/user_write_form.jsp forwardPath 반환  
	    5-2. 가입성공이면    redirect:user_login_form.do forwardPath 반환
		 */
		String forwardPath="";
		if(request.getMethod().equalsIgnoreCase("GET")) {
			forwardPath = "redirece:user_main.do";
			return forwardPath;
		}
		try {
			String userId = request.getParameter("userId");
			String password = request.getParameter("password");
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			
			User user = new User(userId, password, name, email);
			int result = userService.create(user);
			if(result == -1) {	//중복
				String msg = "이미 존재하는 아이디 입니다";
				request.setAttribute("msg", msg);
				request.setAttribute("user", user);
				forwardPath = "forward:/WEB-INF/views/user_write_from.jsp";
			}else if(result == 1) {	//성공
				String msg = "사용할 수 있는 아이디 입니다";
				request.setAttribute("msg", msg);
				request.setAttribute("user", user);
				forwardPath = "redirect:user_login_form.do";
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			forwardPath="forward:/WEB-INF/views/user_error.jsp";
		}
		return forwardPath;
	}
}
