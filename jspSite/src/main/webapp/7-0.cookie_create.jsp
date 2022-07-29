<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//설정
	request.setCharacterEncoding("UTF-8");
	//파라메타 받기
	String searchKeyword = request.getParameter("searchKeyword");
	//서치키워드가 널값이거나 공백일 경우 서치로 이동
	if(searchKeyword==null||searchKeyword==""){
		response.sendRedirect("7-0.cookie_search.jsp");
		return;
	}
	/*****응답 객체를 사용해서 클라이언트에 쿠키전송*****/
	
	/*
		1.Cookie객체생성(1)
		공백을 넣기 위해서는 인코딩 작업을 해야한다
		인코딩 작업을 하면 이상한 문자로 이어져 나오는데 디코딩을 안했기 때문이다
		디코딩도 해줘야한다
	*/
	
	String searchKeyword1=URLEncoder.encode(searchKeyword,"UTF-8");
	Cookie searchKeywordCookie = new Cookie("searchKeyword",searchKeyword1);
	
	/* ※쿠키는 클라이언트에 저장된다※
	    2.쿠키객체설정(setMaxAge)
	       - 쿠키의유효기간설정(파일로저장)
	       - 쿠키의유효기간설정안하면(메모리에저장)
	*/
	// 1년동안 쿠기가 살아있도록 설정- 쿠키의유효기간설정(파일로저장)
	searchKeywordCookie.setMaxAge(60*60*24*365);
	
	/*
		3.응답객체에 쿠키추가(2)<-순서
	*/
	response.addCookie(searchKeywordCookie);
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>검색결과[쿠키생성]</h1><hr>
<div>니안에 쿠키있다.</div>
<ol>
		<%
		int no = (int) (Math.random() * 10);
		for (int i = 0; i < no; i++) {
		%>
		<li><%=searchKeyword%> 검색결과</li>
		<%
		}
		%>
	</ol>
<div>
	<a href='7-0.cookie_search.jsp'>다시검색[쿠키읽기]</a>
	<a href='7-0.cookie_delete.jsp'>쿠키삭제</a>
</div>
</body>
</html>







