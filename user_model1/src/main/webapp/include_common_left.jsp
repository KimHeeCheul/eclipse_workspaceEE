<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>	
<%
	String sUserId=(String)session.getAttribute("sUserId");	//있을수도 있고 없을수도 있으므로 안보여주는것은 아니다
	
	
	
%>    		
<p>
	<strong>메 뉴</strong>
</p>
<ul>
		
	<%if(sUserId!=null){%>
		<li><a href=""><%=sUserId %> 님</a></li>
		<li><a href="user_view.jsp">내정보</a></li>
		<li><a href="user_logout_action.jsp">로그아웃</a></li>
	<%}else{ %>
		<li><a href="user_login_form.jsp">로그인</a></li>
		<li><a href="user_write_form.jsp">회원가입</a></li>
	<%} %>
</ul>
