<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.itwill.bean.User"%>
<%@page import="com.itwill.bean.Guest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%//속성객체 넣는 작업	//속성객체는 기본형밖에 취급하지 않는다
	/*****************String,Wrapper 속성 객체*****************/
	request.setAttribute("a", new String("속성객체"));//스트링과 웹퍼객체는 99.9%같이출력한다
	request.setAttribute("b", new Integer(2));
	request.setAttribute("c", new Boolean(true));//속성객체는 기본형 데이타를 출력하지 않는다
	request.setAttribute("d", "속성객체2");	//이것도 박싱이라고 하지는 않는다
	request.setAttribute("e", 3);			//auto boxing<<자동으로 박싱을 해준다
	request.setAttribute("f", false);		//auto boxing
	
	/*****************자바빈 속성 객체*****************/
	request.setAttribute("guest", new Guest(1,"KIM","2022/03","kim11403@gmail.com","http://www.google.com","타이틀","내용"));
	request.setAttribute("user", new User("lee","1111","이보소","lee@naver.com"));
	
	/*****************List(array) 속성 객체*****************/
	List<Guest> guestList = new ArrayList<Guest>();
	guestList.add(new Guest(10,"KIM","2022/03","kim11403@gmail.com","http://www.google.com","타이틀10","내용10"));
	guestList.add(new Guest(20,"JIM","2022/04","kim11402@gmail.com","http://www.google.com","타이틀20","내용20"));
	guestList.add(new Guest(30,"MIM","2022/05","kim11401@gmail.com","http://www.google.com","타이틀30","내용30"));
	request.setAttribute("guestList", guestList);
	
	/*****************Map 속성 객체*****************/
	Map<String,Guest> guestMap = new HashMap<String,Guest>();
	guestMap.put("g1", new Guest(90,"SIM","2022/06","kim11406@gmail.com","http://www.google.com","타이틀90","내용90"));
	guestMap.put("g2", new Guest(91,"FIM","2022/07","kim11405@gmail.com","http://www.google.com","타이틀91","내용91"));
	guestMap.put("g3", new Guest(92,"VIM","2022/08","kim11404@gmail.com","http://www.google.com","타이틀92","내용92"));
	request.setAttribute("guestMap", guestMap);
	
	/*****************JSP local 변수********************/
	//EL의 범위에 포함되지 않기 떄문에 출력할 수 없다(속성객체가 아니다)
	String str1 = "난 JSP로칼 변수";
	int int1 = 1234;
	User user1 = new User("KANG","2222","2022-03","kang@naver.com");
	
	
	/* 'Attribute뭐에요?' 라고 물으면 10개 abcdef,guest,user,guestList,guestMap라고 답한다
	속성(Attribute)객체
		- 속성객체이름: a,b,c,d,e,f,guest,user,guestList,guestMap
	*/
	
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
	<li><%=request.getAttribute("a") %></li>
	<li><%=request.getAttribute("b") %></li>
	<li><%=request.getAttribute("c") %></li>
	<li><%=request.getAttribute("d") %></li>
	<li><%=request.getAttribute("e") %></li>
	<li><%=request.getAttribute("f") %></li>
	<li>----------java Bean----------</li>
	<li><%=((Guest)request.getAttribute("guest")).getGuest_no() %></li>
	<li><%=((Guest)request.getAttribute("guest")).getGuest_name() %></li>
	<li><%=((Guest)request.getAttribute("guest")).getGuest_email() %></li>
	<li><%=((Guest)request.getAttribute("guest")).getGuest_homepage() %></li>
	<li><%=((User)request.getAttribute("user")).getUserId() %></li>
	<li><%=((User)request.getAttribute("user")).getPassword() %></li>
	<li><%=((User)request.getAttribute("user")).getName() %></li>
	<li><%=((User)request.getAttribute("user")).getEmail() %></li>
	<li>----------List----------</li>
	<li><%=((List<Guest>)request.getAttribute("guestList")).get(0).getGuest_no() %></li>
	<li><%=((List<Guest>)request.getAttribute("guestList")).get(0).getGuest_name() %></li>
	<li><%=((List<Guest>)request.getAttribute("guestList")).get(0).getGuest_email() %></li>
	<li><%=((List<Guest>)request.getAttribute("guestList")).get(0).getGuest_homepage() %></li>
	<li><%=((List<Guest>)request.getAttribute("guestList")).get(0).getGuest_title() %></li>
	<li><%=((List<Guest>)request.getAttribute("guestList")).get(0).getGuest_content() %></li>
	<li>----------Map----------</li>
	<li><%=((Map<String,Guest>)request.getAttribute("guestMap")).get("g1").getGuest_no() %></li>
	<li><%=((Map<String,Guest>)request.getAttribute("guestMap")).get("g1").getGuest_name() %></li>
	<li><%=((Map<String,Guest>)request.getAttribute("guestMap")).get("g1").getGuest_email() %></li>
	<li><%=((Map<String,Guest>)request.getAttribute("guestMap")).get("g1").getGuest_homepage() %></li>
	<li><%=((Map<String,Guest>)request.getAttribute("guestMap")).get("g1").getGuest_title() %></li>
	<li><%=((Map<String,Guest>)request.getAttribute("guestMap")).get("g1").getGuest_content() %></li>
	<li>----------JSP Service 안에 선언된 local 변수----------</li>
	<li><%=str1 %></li>
	<li><%=int1 %></li>
	<li><%=user1.getUserId() %></li>
	<li><%=user1.getPassword() %></li>
	<li><%=user1.getEmail() %></li>
	<li><%=user1.getName() %></li>
	
	
	<li>########## EL사용##########</li>
	<li>${a}</li>
	<li>${b}</li>
	<li>${c}</li>
	<li>${d}</li>
	<li>${e}</li>
	<li>${f}</li>
	<li>----------java Bean----------</li>
	<li>${guest.getGuest_no()}</li>
	<li>${guest.getGuest_name()}</li>
	<li>${guest.getGuest_email()}</li>
	<li>${guest.getGuest_homepage()}</li>
	<li>${guest.getGuest_title()}</li>
	<li>${guest.getGuest_content()}</li>
	
	<li>${user.userId}</li>
	<li>${user.password}</li>
	<li>${user.name}</li>
	<li>${user.email}</li>
	<li>----------List----------</li>
	<li>${guestList[0].guest_no}</li>
	<li>${guestList.get(0).getGuest_no()}</li>
	<li>${guestList[0].guest_name}</li>
	<li>${guestList[0].guest_email}</li>
	<li>${guestList[0].guest_homepage}</li>
	<li>${guestList[0].guest_title}</li>
	<li>${guestList[0].guest_content}</li>
	<li>----------Map----------</li>
	<li>${guestMap.g1.guest_no}</li>
	<li>${guestMap.g1.guest_name}</li>
	<li>${guestMap["g1"].guest_name}</li>
	<li>${guestMap.g1.guest_email}</li>
	<li>${guestMap.g1.guest_homepage}</li>
	<li>${guestMap.g1.guest_title}</li>
	<li>${guestMap.g1.guest_content}</li>
	<li>----------JSP Service 안에 선언된 local 변수 EL로는 출력 불가능----------</li>
	<li>${str1}</li>
	<li>${int1}</li>
	<li>${user1.getUserId()}</li>
	<li>${user1.getPassword()}</li>
	<li>${user1.getEmail()}</li>
	<li>${user1.getName()}</li>
</ul>
</body>
</html>










