<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/*****응답 객체를 사용하여 클라이언트에 쿠키전송[삭제]*****/

	/*
	1. Cookie얻기
	*/
	Cookie[] cookies = request.getCookies();

	/*
	2. searchKeyword쿠키찾아서 setMaxAge(0)로설정
	*/
	if(cookies!=null){
		for(Cookie cookie:cookies){//모든 쿠키를 지우려면 이퀄스르 안하면 됨
			if(cookie.getName().equals("searchKeyword")){
				cookie.setMaxAge(0);//(x) x는 쿠키의 유효시간 0으로 하면 받자마자 사라진다
				cookie.setValue("");
				/*
				3.응답객체에추가(클라이언트로전송)
				*/
				response.addCookie(cookie);
				break;
				//F12를 눌러서 쿠키쪽에서 확인하면 보인다
			}
		}
	}
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>쿠키삭제</h1><hr>
<div>
니안에 쿠키없다.
</div>
<div>
	<a href='7-0.cookie_search.jsp'>다시검색[쿠키읽기]</a>
</div>
</body>
</html>










