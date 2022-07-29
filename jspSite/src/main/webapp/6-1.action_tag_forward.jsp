<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	System.out.println("6-1.action_forward.jsp");
	//원래 포워딩은 태그로 하는것이지만 이해를 돕기 위해서 자바 코드로 진행
	
	/*
	forwarding
		- 6-1.action_tag_forwarded.jsp로 HTTP 요청을 보낸다(정확하게 일치하지는 않지만 forwading 입장에서는 중요하다)
		
	*/
	RequestDispatcher rd = request.getRequestDispatcher("6-1.action_tag_forwarded.jsp");
	rd.forward(request, response);
%>
<%--
<jsp:forward page = "6-1.action_tag_forwarded.jsp"/>
 --%>