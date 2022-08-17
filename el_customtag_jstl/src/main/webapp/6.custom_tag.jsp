<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- ↓↓다른곳에 넣으면 경로를 기술해줘야한다 -->
<%@ taglib prefix="itwill" uri="http://www.itwill.co.kr/jsp/simpleTag" %>
<%
	session.setAttribute("sUserId", "guard");
	request.setAttribute("name", "IU");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>custom tag[사용자 정의 태그]</h1><hr/>
---------------hello tag---------------<br>
<itwill:hello/>
<itwill:hello/>
<itwill:hello/>

---------------helloAttr tag---------------<br>
<itwill:helloAttr irum="김희철"/>
<itwill:helloAttr irum="소향"/>
<itwill:helloAttr irum="${name}"/><br>
<itwill:helloAttr irum="${cookie.JSESSIONID.value}"/>

---------------if tag[body]---------------<br>
<itwill:if test="true">
	반드시 실행<br>
</itwill:if>

<itwill:if test="false">
	반드시 안실행<br>
</itwill:if>
 
<itwill:if test="${sUserId != null}">
	${sUserId} 님 안녕하세요<br>
</itwill:if>

<itwill:if test="${sUserId == null}">
	GUEST 님 안녕하세요<br>
</itwill:if>

<itwill:if test="${!empty(name) }">
	${name} 님 안녕하세요!!<br>
</itwill:if>

<itwill:if test="${empty sUserId}">
	<a href='user_login_form.jsp'>로그인</a>
</itwill:if>

<itwill:if test="${!empty sUserId}">
	<a href='user_logout_action.jsp'>${sUserId} 로그아웃</a>
</itwill:if>

</body>
</html>