package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleCountServlet
 */
@WebServlet("/lifecycle_counter.do")
public class LifeCycleCounterServlet extends HttpServlet {
    //private int count=0;
    public LifeCycleCounterServlet() {
    	System.out.println("0.LifeCycleCounterServlet() 기본생성자호출[최초요청시 단 한번 객체생성] 객체주소 --> "+ this);
    }
    
    @Override
    	public void init(ServletConfig config) throws ServletException {
    	super.init(config); // 놔둘것
    	System.out.println("1.init() 메쏘드--> 생성자 호출 직후에 단 한번만 호출[객체 초기화,리소스 획득]");
    	}
    
    @Override
    public void destroy() {
    	System.out.println("3.destroy()메쏘드 --> 서블릿 객체가 메모리에서 해제되기 직전에 호출[리소스 반납]");
    }
    
    private int count = 0;
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		count++;
		System.out.println("2.service메쏘드 실행(count="+ count + ") --> 클라이언트가 요청할때마다 실행"+this);
		/*
		 * 응답객체(헤더)에 contentType 설정
		 */
		response.setContentType("text/html;charset=UTF-8");
		/*
		 * 클라이언트로 전송할 스트림 객체 생성
		 */
		PrintWriter out = response.getWriter();
		out.println(
				"<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body bgcolor=#40e0d0 style=\"font-size: 9pt; line-height: 140%;\">");
		out.println("	<center>");
		out.println("		현재까지의 페이지뷰수 <font color=#0000FF> "+ count +" </font> 번입니다");
		out.println("	</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
