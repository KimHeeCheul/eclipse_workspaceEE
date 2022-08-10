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
 * Servlet implementation class GuestWriteActionServlet
 */
@WebServlet("/guest_write_action.do")
public class GuestWriteActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forwardPath = "";
		//forwardPath="forward:/WEB-INF/views/guest_write_action.jsp";
		/*******************************************************/
		/*
		GET방식이면 guest_main.do redirection
		0.요청객체encoding설정
		1.파라메타받기(guest_name,guest_email,guest_homepage,guest_title,guest_content)
		  Guest객체생성
		2.GuestService객체생성
		3.GuestService객체 insertGuest(Guest객체) 메쏘드호출
		4.guest_list.do로 redirection
		*/
		try {
			if(request.getMethod().equalsIgnoreCase("GET")){
				//response.sendRedirect("guest_main.do");
				//return;
				forwardPath="redirect:guest_main.do";
			}else {
				Guest guest=new Guest(0,
									  request.getParameter("guest_name"),
									  null,
									  request.getParameter("guest_email"),
									  request.getParameter("guest_homepage"),
									  request.getParameter("guest_title"),
									  request.getParameter("guest_content")
									  );
				GuestService guestService=new GuestService();
				int rowCount=guestService.insertGuest(guest);
				
				//response.sendRedirect("guest_list.do");
				forwardPath="redirect:guest_list.do";//<<여기에 /를 붙이는 사람들이 있는데 이클립스에서 /는 루트라고 생각하기 떄문에 붙이면 안된다
				//forwardPath="forward:/WEB-INF/views/guest_write_action.jsp";
				}
			}catch (Exception e) {
				e.printStackTrace();
				forwardPath="foward:/WEB-INF/views/guest_error.jsp";
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
