package com.itwill.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloTextServlet extends HttpServlet{
	public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		response.setContentType("text/plain;charset=UTF-8"); //응답의 헤더세팅
		
		PrintWriter out=response.getWriter(); //응답의 헤더바디 데이터
		out.println("Hello text[dynamic resource1] !!!");
		out.println("Hello text[dynamic resource2] !!!");
		out.println("Hello text[dynamic resource3] !!!");
		out.println("Hello text[dynamic resource4] !!!");
		return;	//쓰레드를 반환한다 요청한 사람한테 반환은 라인 헤더 바디 순으로 반환한다
	}
	
}

