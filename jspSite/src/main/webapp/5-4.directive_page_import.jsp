<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.itwill.student.StudentService"%>
<%@page import="com.itwill.student.StudentDao"%>
<%@page import="com.itwill.student.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%	// class파일이 없기 떄문에 full name을 써넣거나 import시켜야한다<import 시키지 않았을때 에러뜨는 이유 
	// 한번에 import 할 수 있는 방법이 없다
	Student student1 = new Student();
	Student student2 = new Student();
	StudentDao studentDao = new StudentDao();
	StudentService studentService = new StudentService();
	
	List<String> nameList = new ArrayList<String>();
	nameList.add("김희철");
	nameList.add("김희동");
	nameList.add("김희수");
	HashMap map=new HashMap();

%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>page 지시어 [import]</h1>
<h2>형태:&lt;%@page import="com.itwill.Student"&gt;</h2>
<hr/>
<ul>
	<li><%=student1%></li>
	<li><%=student2%></li>
	<li><%=studentDao%></li>
	<li><%=studentService%></li>
	<li><%=nameList%></li>
	<li><%=map%></li>
</ul>


</body>
</html>
