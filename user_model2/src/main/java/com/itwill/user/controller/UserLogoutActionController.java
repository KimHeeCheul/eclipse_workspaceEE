package com.itwill.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itwill.summer.Controller;

public class UserLogoutActionController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		String forwardPath = "";
		/******* login Check ********/
		String sUserId = (String) request.getSession().getAttribute("sUserId");
		if (sUserId == null) {
			forwardPath = "redirect:user_main.do";
			return forwardPath;
		}
		/**************************/
		request.getSession().invalidate(); //request.getSession(false).invalidate(); 여기에서 false 상태이면 널포인트 익셉션이 나온다
		forwardPath = "redirect:user_main.do";
		return forwardPath;
	}
}
