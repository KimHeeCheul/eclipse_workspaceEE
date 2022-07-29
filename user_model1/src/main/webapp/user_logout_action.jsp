<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<%@include file = "user_login_check.jspf" %>

<%	
	//위에서 생성이 되었다면 바인딩 되어도 상관없지만 생성이 되지 않았다면 바인딩 처리가 될 수 없다
	//세션이 생성되지 않는다는걸 보장할 수 있다 
	session.invalidate();	
	response.sendRedirect("user_main.jsp");

%>