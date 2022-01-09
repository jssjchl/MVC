<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>You registered successfully</h3>
	<ul>
	<li>ID: ${customer.id}
	<li>password: ${customer.password}
	<li>name: ${customer.name}
	<li>gender: ${customer.gender}
	<li>email: ${customer.email}

	</ul>
	<a href = "index.jsp">go to Homepage and do Login!</a>

</body>
</html>