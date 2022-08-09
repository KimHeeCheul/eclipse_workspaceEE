<%@page import="com.itwill.guest.GuestService"%>
<%@page import="com.itwill.guest.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	
/*
GET방식이면 guest_main.jsp redirection
0.요청객체encoding설정
1.파라메타받기(guest_no)
2.GuestService객체생성
3.GuestService객체 deleteGuest(guest_no) 메쏘드호출
4.guest_list.jsp로 redirection
*/
//방향 재지정
if(request.getMethod().equalsIgnoreCase("GET")){	
	response.sendRedirect("guest_main.jsp");
	return;
}

//설정
//request.setCharacterEncoding("UTF-8");

//받기
String guest_no = request.getParameter("guest_no");
if(guest_no==null||guest_no==""){
	response.sendRedirect("guest_list.jsp");
	return;
}

//서비스 객체 생성
GuestService guestService = new GuestService();

//메소드 호출
int rowCount=guestService.deleteGuest(Integer.parseInt(guest_no));
//리다이렉션
response.sendRedirect("guest_list.jsp");




%>