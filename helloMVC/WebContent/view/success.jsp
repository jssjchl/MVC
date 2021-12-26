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
	�� ���ؼ� ���� �޴´�
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
		<%-- jstl language�� java�ڵ��� ������ �κ��� ����� �� ����� --%>
	</table>
</body>
</html>