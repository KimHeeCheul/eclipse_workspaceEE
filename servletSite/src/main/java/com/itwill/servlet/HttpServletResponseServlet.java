package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletResponseServlet
 */
@WebServlet("/response.do")//("/HttpServletResponseServlet")
public class HttpServletResponseServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		/*
		 * http://localhost/servletSite/respone.do?cmd=1
		 * http://localhost/servletSite/respone.do?cmd=2
		 * http://localhost/servletSite/respone.do?cmd=3
		 * http://localhost/servletSite/respone.do	<< URL 방어라는 표현을 사용
		 */
		String cmd= request.getParameter("cmd");
		
		if(cmd==null || cmd.equals("")) {	//유효성 체크
			/* 
			http://localhost/servletSite/request.do
			*/	 
			/*
			이 라인을 실행하면 04. 서버가 나온다 왜냐하면 아래 문을 실행하여 null이 나올경우 아래의 사이트로 들어가도록 설정해놓았기 때문이다
			↓아래를 살릴경우 URL이 나오며 이쪽으로 들어가라고 나온다
			*/
			/*************case 1**************
			out.println("<h1>다시요청하세요</h1><hr>");
			out.println("<a href='04.HttpServletResponse.html'>04.HttpServletResponse.html</a>");
			*******************************/
			/*************case 2**************/
			response.sendRedirect("04.HttpServletResponse.html");
			/*********************************/
			return;
		}
		
		
		
		
		if(cmd.equals("1")) {
			/*
			 * <<정상응답>>
			 * 1. 응답라인 상태코드 200
			 * 2. 응답헤더 요청
			 * 3. 응답바디데이타(html) 전송
			 * 에러도 서버에서 자동으로 세팅이 되지만 내가 직접 쓸수도 있다
			 */
			out.println("<h3>정상응답</h3><hr>");
			
		}else if(cmd.equals("2")) {
			/*
			 * <<error응답>>
			 * 1. 응답라인 4xx,5xx
			 * 2. 응답헤더
			 * 3. 응답바디데이타없음(보낼수 없는 데이타 <- out.print를 사용해도 데이타가 전송되지 않는다)
			 */
			response.sendError(404);// 404 <-file not found // 500 <- 내부서버오류 // 403 <- 승인거부 
									// 405 <- 허용되지 않는 메쏘드 (요청을 post로 했는데 get 방식으로 응답했을경우)
			//response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			//response.sendError(HttpServletResponse.SC_FORBIDDEN);
			//response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
			//에러를 하나만 사용하면 그 이후의 에러는 사용되지 않거나 전의 에러가 나온다 그러므로 하나만 적어넣을것!
		}else if(cmd.equals("3")) {
			/* 다른사람한테 설명할 수 있을정도로 알아야한다!
			 * <<redirect[방향재지정]>>
			 * 1. 응답라인 302 << 요청을다른곳으로해라
			 * 2. 응답헤더 [Location:05-03.form1.html (redirection URL) 이 포함]<<당연히 상대경로
			 * 3. 응답 바디 데이타는 없음(보낼수 없음)
			 */
			/*
			 * 같은사이트(servletSite) resource
			 */
			response.sendRedirect("05-03.form1.html");
			//response.sendRedirect("04.HttpServletResponse.html");
			//response.sendRedirect("06.mime_type_image.html");
			/*
			 * 다른 사이트 resource
			 */
			//response.sendRedirect("https://www.naver.com/index.html");
			//response.sendRedirect("http://182.237.126.19/projectShop_spring_bootstrap/index");
			//response.sendRedirect("http://192.168.15.12/servletSite");
			
		}else {
			out.println("");
		}
		
		
		
	}

}
