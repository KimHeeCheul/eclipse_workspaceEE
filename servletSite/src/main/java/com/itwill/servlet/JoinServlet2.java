package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join2.do")
public class JoinServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// GET 방식으로 요청이 들어오면 05-03.form2.html로 방향재지정 (redirection)
		response.sendRedirect("05-03.form2.html");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//응답객체 MINE타입 인코딩 설정
		response.setContentType("text/html;charset=UTF-8");
		
		//응답스트림 생성
		PrintWriter out = response.getWriter();
		
		//요청 객체 인코딩 설정
		request.setCharacterEncoding("UTF-8");
		
		// 1. 파라메타 받기
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String repass = request.getParameter("repass");
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String gender = request.getParameter("gender");
		String job = request.getParameter("job");
		String[] hobbys = request.getParameterValues("hobby");
		if(hobbys==null) {
			hobbys = new String[1];
			hobbys[0] = "취미가 없을수도 있지~ 하하 <br>(없으면 만들어 제발!!!)";
		}
		
		/*
		 * 2.Service객체 가입메쏘드호출 (과제 아님)
		 */
		
		
		//3.클라이언트로 응답 출력
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>Insert title here</title>");
		out.println("<style type='text/css'>");
		out.println("td, tr, th {");
		out.println("	border: 1px solid black;");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("	<h3 align='center'>가입정보결과</h3>");
		out.println("<center><table width='50%'>");
		
		out.println("		<tr>");
		out.println("			<th width='25%'>항목</th>");
		out.println("			<th width='50%'>입력값</th>");
		out.println("			<th width='25%'>비고</th>");
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("			<td>아이디</td>");
		out.println("			<td>"+id+"</td>");
		out.println("			<td rowspan =" +(6 + hobbys.length)+ "></td>");
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("			<td>패쓰워드</td>");
		out.println("			<td>"+pass+"</td>");
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("			<td>이름</td>");
		out.println("			<td>"+name+"</td>");
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("			<td>주소</td>");
		out.println("			<td>"+addr+"</td>");
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("			<td>성별</td>");
		if(gender.equals("F")) {
			out.println("<td>"+gender+"(여)"+"</td>");
		}else {
			out.println("<td>"+gender+"(남)"+"</td>");
		}
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("			<td>직업</td>");
		out.println("			<td>"+job+"</td>");
		out.println("		</tr>");
		
		out.println("		<tr>");
		out.println("		<ul>");
		out.println("			<td rowspan='0'>취미</td>");
		for(String hobby:hobbys) {
			out.println("<td>"+hobby+"</td>");
			out.println("		</tr>");
		}
		out.println("		</ul>");
		
		out.println("	</table></center>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
