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
public class GuestViewController implements Controller {
	private GuestService guestService;

	public GuestViewController() {
		guestService = new GuestService();
	}

	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		/*
		 * 0. 파라메타받기 ㅡ 1. UserService객체를 사용해서Guest객체 얻기 ㅡ 2. request
		 * scope객체에담기[setAttribute()] ㅡ 3. forwardPath반환 ㅡ
		 */
		String forwardPath = "";

		try {
			String guest_noStr = request.getParameter("no");
			if (guest_noStr == null || guest_noStr.equals("")) {
				forwardPath = "redirect:guest_main.do";
			} else {
				Guest guest = guestService.selectByNo(Integer.parseInt(guest_noStr));
				request.setAttribute("guest", guest);
				forwardPath = "forward:/WEB-INF/views/guest_view.jsp";
			}
		} catch (Exception e) {
			e.printStackTrace();
			forwardPath = "forward:/WEB-INF/views/guest_error.jsp";
		}

		return forwardPath;
	}
}
