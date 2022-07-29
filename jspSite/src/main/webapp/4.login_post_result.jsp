<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	//GET방식으로 요청하면 방향을 재지정해준다
	if(request.getMethod().equalsIgnoreCase("GET")){
		/*
		 * 클라이언트에서 GET방식의 요청으로 실행하면 
		 * 4.login_post_form.jsp으로 redirect(방향재지정)
		 */
		 //바디가 없기 때문에 정보를 줄수가 없다
		 response.sendRedirect("4.login_post_form.jsp");
		 return;
	}

	//0.인코딩설정
	request.setCharacterEncoding("UTF-8");
	

	/*
	 * 1.파라메타받기
	  	아이디:<input type="text" name="id">
		패에쓰:<input type="password" name="pass">
	 */
	String id=request.getParameter("id");	
	String pass=request.getParameter("pass");	
	/*
	 * 2.로그인 업무실행(Service객체사용)(DB)
	 *  id |pass
	 *  ---------
	 *  xxx|1111
	 *  yyy|2222
	 */
	
	
	/*
	 * 3.클라이언트로 결과전송
	 */
	 boolean isMember1 = id.equals("xxx")&&pass.equals("1111");
		boolean isMember2 = id.equals("yyy")&&pass.equals("2222");
		out.println("<h1> POST로그인 결과 </h1><hr>");
		if(isMember1||isMember2) {
			//로그인 성공
			out.println("<h3>"+id+" 님 로그인 성공</h3><hr>");
			out.println("<a href = 'index.html'> 메인으로 </a>");
		}else {
			//로그인 실패
			out.println("<h3>"+id+" 님 로그인 실패</h3><hr>");
			out.println("<a href = '4.login_post_form.jsp'> 다시 로그인 </a>");
		}
	
%>    
