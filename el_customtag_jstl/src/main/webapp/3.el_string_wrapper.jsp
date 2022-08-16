<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("sUserId", "www");
	request.setAttribute("sUserId", "xxx");
	session.setAttribute("sUserId", "yyy");
	application.setAttribute("sUserId", "zzz");

	session.setAttribute("sUserId","kim11403");
	request.setAttribute("name", "제임스딘");
	request.setAttribute("age", new Integer(37));
	request.setAttribute("age", 29);
	request.setAttribute("weight", "74.5");
	request.setAttribute("married", "false");
	double height = 177.5;
	String address = "김포시민";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL String,Wrapper객체(기본형객체) 출력</h1>
<ol>
	<li>${sUserId}</li>	
	<li>${name}</li>	
	<li>${age}</li>	
	<li>${weight}</li>	
	<li>${married}</li>
	<li>EL 출력불가능[속성 객체가 아니므로]</li>
	<li>${height}</li>	
	<li>${address}</li>	
	
</ol>
</body>
</html>