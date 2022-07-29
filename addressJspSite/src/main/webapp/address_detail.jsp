<%@page import="com.itwill.address.Address"%>
<%@page import="com.itwill.address.AddressService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
 * 요청URL
 *  http://localhost/addressSite/address_detail.jsp?no=45
 	GET 방식 요청인 경우에는 address_main.jsp로 redirection
 
 *  0.요청객체encoding설정
 *  1.no 파라메타받기
 *  2.AddressService객체생성
 *  3.AddressService객체 selectByNo(no) 메쏘드호출
 *  4.Address객체 출력
 */
 
 /*
 if(request.getMethod().equalsIgnoreCase("GET")){
	 response.sendRedirect("address_main.jsp");
	 return;
 }
*/ 

 	//설정
	request.setCharacterEncoding("UTF-8");
 	//파라메타 받기
	String noStr = request.getParameter("no");
 	//noStr이 널값이거나 공백이면 메인페이지로 보내기
 	
	if(noStr==null || noStr.equals("")){
		response.sendRedirect("address_main.jsp");
		return;
	}
	
 	//생성
 	AddressService addressService = new AddressService();
	//메쏘드 호출
	Address address = addressService.selectByNo(Integer.parseInt(noStr));
   
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>Insert title here</title>
</head>
<body>
<h1>[<%=address.getName() %> 님 주소록상세보기]</h1><hr>
<div>
	<a href='address_main.jsp'>[메인]</a>
	<a href='address_insert_form.jsp'>[주소록쓰기폼]</a>
	<a href='address_list.jsp'>[주소록리스트]</a>
	
	<%-- 
	<a href='address_update_form.jsp?no=<%=address.getNo()%>'>[<%=address.getName() %>님 주소록수정폼]</a>
	--%>
	
	<form action="address_update_form.jsp" method='post' style="display:inline;">
		<input type="hidden" name="no" value="<%=address.getNo() %>">
		<input type="submit" value="<%=address.getName() %>님 주소록수정폼[POST]">
	</form>
	
	
	<%--
	post 방식으로 변경할때는 바디 바로 밑에 폼을 만들어야한다 
	<a href='address_delete_action.jsp?no=<%=address.getNo()%>'><%=address.getName()%>님삭제[GET]</a> <!-- 디테일할때 해놓거나 생각할것 코딩 맞게 해놓고 삭제가 안됨... -->
	--%>
	
	<form action='address_delete_action.jsp' method='post' style='display:inline;'>
		<input type='hidden' name='no' value='<%=address.getNo() %>'>
		<input type='submit' value='<%=address.getName()%>님 삭제[POST]'> <!-- 디테일할때 해놓거나 생각할것 코딩 맞게 해놓고 삭제가 안됨... -->
	</form>
</div>
<p>
	번호:<%= address.getNo() %><br>
	아이디:<%= address.getId() %><br>
	이름:<%= address.getName() %><br>
	전화:<%= address.getPhone() %><br>
	주소:<%= address.getAddress() %><br>
</p>
</body>
</html>
