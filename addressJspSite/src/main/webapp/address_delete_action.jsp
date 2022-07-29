<%@page import="com.itwill.address.Address"%>
<%@page import="com.itwill.address.AddressDao"%>
<%@page import="com.itwill.address.AddressService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

/*
* 0.요청객체encoding설정
* 1.파라메타받기
* 2.AddressService객체생성
* 3.AddressService.deleteByNo()메쏘드실행
* 4.클라이언트로 redirection 응답--> address_list.jsp 로 redirection
*/

//@@@@@@@@@@@@@@@@디테일 확인@@@@@@@@@@@@@@@@

//GET방식으로 오면 리스트로 방향 재지정
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("address_list.jsp");
	return;
}

//설정
request.setCharacterEncoding("UTF-8");

//파라메타 받기
String noStr = request.getParameter("no");

//객체 생성
AddressService addressService = new AddressService();

//메쏘드 실행
addressService.deleteByNo(Integer.parseInt(noStr));

//리다이렉션
response.sendRedirect("address_list.jsp");


%>