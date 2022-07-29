package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/search.do")
public class SearchServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		/*
		 * 클라이언트 요청 URL
		 *    http:/localhost/servletSite/search.do?searchkeyword=java
		 */
		/*
		 1. 요청 객체를 사용해서 요청시 전송되는 쿼리스트링(질의문자열)에 있는
		    파라메타받기 (파라메타는 여러개 들어갈 수 있다)
		    - 파라메타의 이름은 input element의 name 속성과 일치한다 (일치하지 않으면 null반환)
		      <input type = "text" name = "searchkeyword">
		    - search.do?searchkeyword=java
		 */
		String searchkeyword =request.getParameter("searchkeyword");
		
		if(searchkeyword==null || searchkeyword.equals("")){
		/*
		 * searchkeyword 가 null인 경우 ==> http:/localhost/servletSite/search.do
		 * searchkeyword 가 "  "인 경우 ==> http:/localhost/servletSite/search.do?searchkeyword=
		 */
			out.println("검색어를 입력하지 않은 경우 재미있는 지식 결과를 랜덤하게 보여드립니다.<hr>");
			out.println("<a href ='05-00.search_form.html'>검색홈페이지</a>");
			return;
		}
		/*
		  2. 검색업무 실행(DB에서 검색) <- Service 객체사용(service한테 시킨다 본인이 하지 않음!)
		 */
		
		/*
		  3. 클라이언트로 검색결과 전송(HTML)
		 */
		out.println("<h1>"+request.getRemoteAddr()+"님 "+searchkeyword+"검색 결과입니다.<h1><hr>");
		out.println("<ol>");
		int searchResultNo = (int)(Math.random()*10);
		for(int i=0 ; i<searchResultNo ; i++) {
			out.println("<li>"+searchkeyword+" 검색결과</li>");
		}
		out.println("</ol>");
		out.println("<a href ='05-00.search_form.html'>검색홈페이지</a>");
		return;
		
	}

}
