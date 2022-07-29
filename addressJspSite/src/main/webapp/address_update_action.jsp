<%@page import="com.itwill.address.AddressService"%>
<%@page import="com.itwill.address.Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
 * 0.요청객체 encoding설정 
 * 1.파라메타 받기(no,id,name,phone,address) 
 * 2.파라메타데이타로 Address객체생성
 * 3.AddressService객체생성 
 * 4.AddressService.updateByNo()메쏘드실행 
 * 5.adress_detail.jsp 로
 * redirection
 */
 
//GET으로 오면 리스트로 방향 재지정
if(request.getMethod().equalsIgnoreCase("GET")){
	response.sendRedirect("address_list.jsp");
	return;
}
 
//설정
request.setCharacterEncoding("UTF-8");
//받기
String noStr = request.getParameter("no");
String id = request.getParameter("id");
String name = request.getParameter("name");
String phone = request.getParameter("phone");
String address = request.getParameter("address");

//noStr값이 널값이거나 공백이면 리스트로 보내기

/*
if (noStr == null || noStr == "") {
	response.sendRedirect("address_list.jsp");
	return;
}
*/

//서비스객체생성
AddressService addressService = new AddressService();

//파라메타 데이타로 address객체생성
Address updateAddress = new Address(Integer.parseInt(noStr), id, name, phone, address);

//메쏘드 실행
int updateRowCount = addressService.updateByNo(updateAddress);

//수정되면 번호의 디테일로 이동
response.sendRedirect("address_detail.jsp?no=" + noStr);

%>