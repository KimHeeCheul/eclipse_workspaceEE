<%@page import="com.itwill.address.AddressService"%>
<%@page import="com.itwill.address.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
 * 0.요청객체encoding설정
 * 1.파라메타받기(id,name,phone,address)--> Address객체생성
 * 2.AddressService객체생성
 * 3.AddressService.insert(Address객체)메쏘드실행
 * 4.address_list.jsp 로 redirection
 */
 	//GET방식으로 요청이 들어오면 리스트로 방향 재지정
 	if(request.getMethod().equalsIgnoreCase("GET")){
 			response.sendRedirect("address_list.jsp");
 			return;
 	}
 
	//설정
	request.setCharacterEncoding("UTF-8");
 	//파라메타 받기
 	String id = request.getParameter("id");
 	String name = request.getParameter("name");
 	String phone = request.getParameter("phone");
 	String address = request.getParameter("address");
 	
 	//객체생성
 	AddressService addressService = new AddressService();
 	
 	//메소드 실행
 	Address newAddress = new Address(0, id, name, phone, address);
 	addressService.insert(newAddress);
 	
 	//리다이렉션
 	response.sendRedirect("address_list.jsp");
 	
%>

