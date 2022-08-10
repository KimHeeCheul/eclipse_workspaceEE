package com.itwill.guest.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

/**
 * Servlet implementation class GuestModifyFromServlet
 */
@WebServlet("/guest_modify_form.do")
public class GuestModifyFromServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String forwardPath = "";
		
		/*
		GET방식이면 guest_main.jsp redirection

		 	0.요청객체encoding설정
		 	1.guest_no 파라메타받기
		 	2.GuestService객체생성
		 	3.GuestService객체 selectByNo(guest_no) 메쏘드호출
		 	4.Guest 객체 얻기
		 	5.request에 객체 담기
		*/
		try {
			if(request.getMethod().equalsIgnoreCase("GET")){
				//response.sendRedirect("guest_main.do");
				//return;	
				forwardPath="redirect:guest_main.do";
			}else {
			String guest_noStr=request.getParameter("guest_no");
			GuestService guestService=new GuestService();
			Guest guest=
					guestService.selectByNo(Integer.parseInt(guest_noStr));
			request.setAttribute("guest", guest);
			forwardPath="forward:/WEB-INF/views/guest_modify_form.jsp";
			}
		}catch (Exception e) {
			e.printStackTrace();
			forwardPath="forward:/WEB-INF/views/guest_error.jsp";
		}
		
		/******************forward, redirect********************/
		
		/*	대부분은 forward ↓이부분을 생략하지만 여기서는 붙여줄것
			forword  --> forward:/WEB-INF/views/guest_xxx.jsp";
			redirect --> redirect:guest_xxx.do
		*/
		// 이방식을 지키지 않으면 작동하지 않는다
		String[] pathArray = forwardPath.split(":");
		String forwardOrRedirect = pathArray[0];
		String path = pathArray[1];
		if(forwardOrRedirect.equals("redirect")) {
				response.sendRedirect(path);
			}else if(forwardOrRedirect.equals("forward")) {
					RequestDispatcher rd = request.getRequestDispatcher(path);
					rd.forward(request, response);//가장 공통적이지 않은 파일 나중에 외부에서 땡겨올 코드들
			}
		/****************모든 서블릿 하단에 다 들어간다*****************/
	}

}
