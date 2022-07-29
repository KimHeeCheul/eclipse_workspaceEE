package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetLoginServlet
 */
@WebServlet("/post_login.do")
public class PostLoginServlet extends HttpServlet {
	
	/*
	 * client GET방식 요청에 의해 실행되는 메쏘드 	
	 */
	
	//doGet 컨트롤 스페이스를 누르므로 Override가 실행된다
	//↓를 함으로써 405 에러가 나오지 않고 05-02.login_post.html로 이동시킨다.
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 클라이언트에서 GET방식의 요청으로 실행하면 
		 * 05-02.login_post.html으로 redirect(방향재지정)
		 */
		//response.sendRedirect("05-02.login_post.html");
		response.sendError(403);
	}
	
	
	
	/*
	 * client POST 방식 요청에 의해 실행되는 메쏘드
	 * 현재상태로 ctrl + f11을 누르면 get방식의 요청이기 떄문에 405번 오류가 나온다
	 * 요청의 상태로 들어가지만 get방식이라서 405번의 응답이 돌아온다
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		/*
		 1. 요청시 전송되는 파라메타 받기
		 	- 파라메타의 이름은 input element의 속성과 일치
		 		아이디:<input type="text" name="id"><br>
				패에쓰:<input type="password" name="pass"><br><br>
		 */
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		if(id==null || id.equals("") || pass==null || pass.equals("")) {
			//아이디 패스워드가 안들어가는 메쏘드는 정상적인 요청이 아니다
			response.sendRedirect("05-02.login_post.html");
			return;
		}
		
		/*
		 2. 로그인 업무실행(Service객체)
		 	id|pass
		 	--------
		 	xxx|1111
		 	yyy|2222
		 */
		boolean isMember1 = id.equals("xxx")&&pass.equals("1111");
		boolean isMember2 = id.equals("yyy")&&pass.equals("2222");
		out.println("<h1> POST로그인 결과 </h1><hr>");
		if(isMember1||isMember2) {
			//로그인 성공
			out.println("<h3>"+id+" 님 로그인 성공</h3><hr>");
			out.println("<a href = 'index.html'> 메인으로 </a>");
		}else {
			//로그인 실패
			out.println("<h3>"+id+" 님 로그인 실패</h3><hr>");
			out.println("<a href = '05-02.login_post.html'> 다시 로그인 </a>");
		}
		
		
	}

}
