<%@page import="com.itwill.guest.GuestService"%>
<%@page import="com.itwill.guest.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 뿌릴것이 없기 때문에 document 파일이 필요 없음 다 삭제 -->
<%
/*
GET방식이면 guest_main.jsp redirection
0.요청객체encoding설정
1.파라메타받기(guest_name,guest_email,guest_homepage,guest_title,guest_content)
  Guest객체생성
2.GuestService객체생성
3.GuestService객체 insertGuest(Guest객체) 메쏘드호출
4.guest_list.jsp로 redirection
*/
//방향 재지정
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("guest_list.jsp");
	return;
}
//설정
//request.setCharacterEncoding("UTF-8");
//파라메타받기
String guest_name = request.getParameter("guest_name");
String guest_email = request.getParameter("guest_email");
String guest_homepage = request.getParameter("guest_homepage");
String guest_title = request.getParameter("guest_title");
String guest_content = request.getParameter("guest_content");
//객체생성 _  no 시퀀스, 날짜 널
Guest guest = new Guest(0, guest_name, null, guest_email, guest_homepage, guest_title, guest_content);
//서비스 객체 생성
GuestService guestService = new GuestService();
//메소드 실행
guestService.insertGuest(guest);
//리다이렉션
response.sendRedirect("guest_list.jsp");
%>





