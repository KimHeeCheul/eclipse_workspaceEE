package com.itwill.guest.controller;

import java.util.Iterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;
import com.itwill.summer.Controller;

/*
 * - 클라이언트요청한개를 처리하는 비즈니스로직을 담고있는 객체
 * - DispatcherServlet객체가 호출하는 handleRequest메쏘드를가짐
 * - handleRequest메쏘드가호출되면 DispatcherServlet객체에 forwardPath를 반환해줌
 */
public class GuestModifyFormController implements Controller {
	private GuestService guestService;

	public GuestModifyFormController() {
		guestService = new GuestService();
	}

	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		/*
		 * 1. GET방식이면 user_main.do로 redirection ㅡ 2. 파라메타받기 ㅡ 3. UserService객체를
		 * 사용해서Guest객체얻기 ㅡ 4. request scope객체에 담기[setAttribute()] ㅡ 5. forwardPath반환 ㅡ
		 */
		String forwardPath = "";
		try {
			if (request.getMethod().equalsIgnoreCase("GET")) {
				forwardPath = "redirect:guest_main.do";
			} else {
				String guest_noStr = request.getParameter("no");
				Guest guest = guestService.selectByNo(Integer.parseInt(guest_noStr));
				request.setAttribute("guest", guest);
				forwardPath = "forward:/WEB-INF/views/guest_modify_form.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/views/guest_error.jsp";
		}
		return forwardPath;
	}
}
