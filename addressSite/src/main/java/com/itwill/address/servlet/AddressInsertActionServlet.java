package com.itwill.address.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.address.Address;
import com.itwill.address.AddressService;

/**
 * Servlet implementation class AddressInsertActionServlet
 */
@WebServlet("/address_insert_action.do")	//action은 바디가 없는것=응답의 바디데이타가 없는것=리다이렉션
public class AddressInsertActionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("address_insert_form.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			/*※※※※form과 action은 꼭 구분할것※※※※
			 * 0.요청객체encoding설정
			 * 1.파라메타받기	<- 회원가입 객체는 라인 헤더에서 리스트로 넘어간다 바디가 존재하지 않음
			 * 2.AddressService객체생성
			 * 3.AddressService.insert()메쏘드실행
			 * 4.address_list.do 로 redirection <<-- list로 가나 main으로 가나 상관없음
			 */
			//요청객체 인코딩 설정
			request.setCharacterEncoding("UTF-8");
			//파라메타 받기
			//파라메타 4개 아이디 이름 전화번호 주소(실행하면 get방식의 요청으로 실행된다) 
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String phone = request.getParameter("phone");
			String address = request.getParameter("address");
			//객체생성
			AddressService addressService = new AddressService();
			//인서트 메쏘드 실행
			Address insertAddress = new Address(0, id, name, phone, address);
			addressService.insert(insertAddress);
			//리스트로 이동
			response.sendRedirect("address_list.do");
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
