<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	session.setAttribute("sUserId", "admin");
	session.setAttribute("sUserId", "guard");
	session.setAttribute("level",1);//레벨은 1~5 사이의 정수
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL core choose tag</h1><hr>
<!-- when은 단독사용 불가 -->
<c:choose>
	<c:when test="${level==1}">
		애벌레[${level}]<br>
	</c:when>
	<c:when test="${lever==2}">
		벌레[${level}]<br>
	</c:when>
	<c:when test="${level==3}">
		동물[${level}]<br>
	</c:when>
	<c:when test="${level>3 && level<=5}">
		사람[${level}]<br>
	</c:when>
	<c:otherwise>
		레벨은 1~5 사이의 정수입니다.<br>
	</c:otherwise>
</c:choose>
<c:choose>
	<c:when test="${sUserId=='admin'}">
		관리자<br>
	</c:when>
	<c:otherwise>
		일반유저<br>
	</c:otherwise>
</c:choose>

<c:choose>
	<c:when test="${sUserId != null}">
		<c:choose>
			<c:when test="${sUserId == 'admin' }">
				<a href = "admin_logout.jsp">${sUserId}님 로그아웃</a><br>
				<a href = "product_list.jsp">상품리스트</a><br>
				<a href = "admin_product_add.jsp">상품등록</a><br>
			</c:when>
			<c:otherwise>
				<a href = "logout.jsp">${sUserId}님 로그아웃</a><br>
				<a href = "product_list.jsp">상품리스트</a><br>
			</c:otherwise>
		</c:choose>
	</c:when>
	<c:otherwise>
		<a href = "">로그인</a>
	</c:otherwise>

</c:choose>



</body>
</html>