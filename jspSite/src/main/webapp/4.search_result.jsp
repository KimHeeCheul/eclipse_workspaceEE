<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
	0.요청객체의 인코딩설정
	1.파라메타받기
	2.Service객체생성
	3.Service객체메쏘드호출
	4.응답(출력,redirection)<<출력이 없는 경우 redirection 
*/
	request.setCharacterEncoding("UTF-8");
	String searchkeyword =request.getParameter("searchkeyword");
	if(searchkeyword==null||searchkeyword.equals("")){ //null 외에 검색값이 없을경우 아래 경로로 간다
		response.sendRedirect("4.search_form.jsp");
		return;
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%=searchkeyword %> 검색결과</h1><hr>
	<ol>
		<%for(int i=0;i<10;i++){ %>
		<li><%=searchkeyword %> 검색데이타[<%=(i+1)%>]</li>
		<%}%>
	</ol>
	<a href='4.search_form.jsp'>다시검색</a>
</body>
</html>











