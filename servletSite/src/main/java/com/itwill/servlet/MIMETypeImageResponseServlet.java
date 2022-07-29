package com.itwill.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MIMETypeImageResponseServlet
 */
@WebServlet("/response_image.do")
public class MIMETypeImageResponseServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 여기는 책 92p 참조 잘 나와있음
		 * 1. 응답객체 MIME 타입 설정 
		 */
		
		response.setContentType("image/jpeg");
		/*
		 * 2.부라우져와 연결된 출력스트림 생성
		 * 기본적으로 프린트는 문자열에만 사용된다 (←out.print) 이미지를 사용하기 위해서는 out.write를 사용한다
		 * 클라이언트가 가지고 있는것은 없고 전부 다 서버가 가지고 있는것이다
		 */
		OutputStream out = response.getOutputStream();
		/*
		 * servletSite context의 실제 경로(절대경로)
		 */
		ServletContext servletContext = this.getServletContext(); //컨텐츠의 모든 정보를 가지고 있는 GOD(신)과같은 존재 
		String fileRealPath = servletContext.getRealPath("/images/strawberry moon.jpg"); // 실행되고 있는 실제 경로를 반환해준다
		FileInputStream fis = new FileInputStream(fileRealPath); 
		
		while(true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			out.write(readByte);
		}
		fis.close();
		out.close();
	}

}
