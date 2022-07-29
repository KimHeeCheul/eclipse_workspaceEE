<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/******로그인한 회원만 볼 수 있는 페이지******/
	String loginId = (String)session.getAttribute("loginId");
	if(loginId==null){
		response.sendRedirect("7-2.default_session_login_action.jsp");
		return;
	}
	//브라우져를 껏다가 다시 실행했을때 세션값이 없으므로 로그인 페이지로 이동한다
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원페이지2</h1>
<hr/>
<a href='7-2.default_session_logout.jsp'><%= loginId %> 님 로그아웃</a>
<ol>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
	<li>회원전용 페이지2 ㅎㅎㅎ</li>
</ol>
<br>
<br>
<br>
<a href="7-2.default_session_use1.jsp">회원페이지1</a>
</body>
</html>
