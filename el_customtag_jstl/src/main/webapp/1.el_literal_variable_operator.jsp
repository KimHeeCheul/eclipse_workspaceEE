<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.bean.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
pageContext.setAttribute("int1", 10);
pageContext.setAttribute("int2", 20);
pageContext.setAttribute("double1", 0.5);
pageContext.setAttribute("double2", 3.14159);
pageContext.setAttribute("string1", "KIM");
pageContext.setAttribute("string2", "경호");
pageContext.setAttribute("bool1", true);
pageContext.setAttribute("bool2", false);
pageContext.setAttribute("married", true);
pageContext.setAttribute("age", 34);
pageContext.setAttribute("weight", 75.2641);
pageContext.setAttribute("height", 173);

Guest guest = null;
ArrayList<Guest> guestList = new ArrayList<Guest>();
HashMap<String, Guest> guestMap = new HashMap<String, Guest>();
String emptyStr = "";

pageContext.setAttribute("guest", guest);
pageContext.setAttribute("guestList", guestList);
pageContext.setAttribute("guestMap", guestMap);
pageContext.setAttribute("emptyStr", emptyStr);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL 리터럴,변수,연산자</h1>
	<hr>
	<ul>
		<li>----EL 리터럴(상수)----</li>
		<li>정수형리터럴: </li>
		<li>실수형리터럴:</li>
		<li>논리형리터럴: </li>
		<li>문자형리터럴:</li>
		<li>문자형리터럴:</li>
		<li>---------EL 변수[SCOPE객체의 속성이름]--------</li>
		
		<li>---------EL 연산자--------</li>
		



	</ul>
</body>
</html>