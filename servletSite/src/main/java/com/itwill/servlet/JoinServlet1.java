package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet1
 */
@WebServlet("/join1.do")
public class JoinServlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * GET 방식으로 요청이 들어오면 05-03.form1.html로 방향재지정(redirection)
		 * ★★★★★★GET 방식으로 요청했기 때문에 아래의 URL로 간다★★★★★★
		 */
		response.sendRedirect("05-03.form1.html");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		/*
		 * 0.요청 객체 인코딩 설정
		 */
		//response.setCharacterEncoding("UTF-8"); <--잘못된경우 계속 한글이 깨질것
		request.setCharacterEncoding("UTF-8");
		
		/*
		 * 1. 파라메타 받기
		 */
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String email=email1+"@"+email2;
		String gender = request.getParameter("gender");
		
		String[] interests = request.getParameterValues("interest");
		if(interests==null) {
			interests=new String[0];
		}
		String greeting = request.getParameter("greeting");
		/*
		 * 2. Service 객체가입 메쏘드 호출
		 */
		
		/*
		 * 3. 클라이언트로 응답출력
		 */
		out.println("<h1>가입정보</h1>");
		out.println("<ul");
		out.println("<li>아이디 : "+id+"</li>");
		out.println("<li>비밀번호 : "+password+"</li>");
		out.println("<li>이메일 : "+email1+"</li>");
		out.println("<li>성별 :s "+gender+"</li>");
		out.println("<li>가입인사 : "+greeting+"</li>");
		out.println("<li>관심사");
		out.println("	<ul>");
		for(String interest:interests) {
			out.println("	<li>"+interests+"</li");
		}
		out.println("	</ul>");
		
		out.println("</ul");
		
		
	}

}
