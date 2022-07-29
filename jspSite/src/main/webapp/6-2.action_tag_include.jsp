<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>jsp action tag [include]</h1>
<h2>형태:&lt;jsp:include page="xxx.jsp"&gt;</h2>
<hr/>
<!-- 6-2.action_tag_included_top.jsp -->
<!-- jsp:iuclude 는 jsp안에 include가 포함되어 있고 중복되지 않는다는 뜻을 가지고 있다 -->
<jsp:include page="6-2.action_tag_included_top.jsp"/>


<ol type="A">
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
	<li>content</li>
</ol>
<jsp:include page="6-2.action_tag_included_footer.jsp"/>

</body>
</html>
