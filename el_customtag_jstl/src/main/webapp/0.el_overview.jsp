<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%//속성객체 넣는 작업	//속성객체는 기본형밖에 취급하지 않는다
	request.setAttribute("a", new String("속성객체"));//스트링과 래퍼객체는 99.9%같이출력한다
	request.setAttribute("b", new Integer(2));
	request.setAttribute("c", new Boolean(true));//속성객체는 기본형 데이타를 출력하지 않는다
	request.setAttribute("d", "속성객체2");	//이것도 박싱이라고 하지는 않는다
	request.setAttribute("e", 3);			//auto boxing<<자동으로 박싱을 해준다
	request.setAttribute("f", false);		//auto boxing


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>EL(Expression Language)</h1><hr>
<ul>
	<li>##########NO EL(EL을 사용하지 않았을때)##########</li>



</ul>
</body>
</html>