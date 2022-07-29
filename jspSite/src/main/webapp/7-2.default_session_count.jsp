<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    int count=0;
    
    Integer countInt =(Integer) session.getAttribute("count");// 여기는 GET
    if(countInt==null){
    	//count key 값의 속성 객체가 존재하지 않는 경우
    	count=0;
    }else{
    	//count key 값의 속성 객체가 존재하는 경우
    	count = countInt.intValue();
    }
    count++;
	/*
	세션 장바구니 객체에 count라는 key로 Integer 객체로 저장합니다
	세션 장바구니 객체는 저장데이타를 HashMap으로 관리합니다
	*/
    session.setAttribute("count", new Integer(count)); //여기는 SET
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>HttpSession 객체를 사용한 클라이언트별(브라우져별) 요청횟수 카운트</h1>
	<h3><%=session.getId() %> 님<%= count %>번쨰 요청입니다.</h3>
	<br>
	<br>
	<ol>
	<li>session객체참조변수:<%=session%></li>
	<li>session객체생성여부:<%=session.isNew()%></li>
	<li>session객체세션아이디:<%=session.getId()%></li>
	<li>session객체생성시간:<%=session.getCreationTime()%></li>
	<li>session객체유효시간:<%=session.getMaxInactiveInterval()%></li>
	<li>session객체마지막바인딩시간:<%=session.getLastAccessedTime()%></li>
	</ol>
</body>
</html>