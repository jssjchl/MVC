<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>

	<%-- JSP Expression Language --%>
	를 통해서 값을 받는다
	<ul>
		<li>id = ${customer.id}</li>
		<li>name = ${customer.name}</li>
		<li>email = ${customer.email}</li>
	</ul>

	<%-- JSTL --%>
	<table>
		<c:forEach var="customer" items="${all}">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.name}</td>
				<td>${customer.email}</td>
			</tr>
		</c:forEach> 
		<%-- jstl language는 java코드의 동적인 부분을 사용할 때 사용함 --%>
	</table>
</body>
</html>