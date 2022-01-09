<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<style>
div.ex {
	text-align: center;
	width: 35%;
	padding: 10px;
	border: 5px solid grey;
	margin: 0px
}
</style>
<body>
	<h1>Registration Form</h1>
	<div class ="ex">
		<form action="/hw1-helloMVC/DoRegister" method="post">
			<table cellpadding="5">
				
				<tr><h3>Enter Information Here</h3></tr>
				<tr><td>아이디 <input type ="text" name ="id"></td></tr>
				<tr><td>비밀번호 <input type = "password" name ="password"></td> </tr>
				<tr><td>이름 <input type = "text" name ="name"></td></tr>
				<tr><td>성별 <input type ="radio" name ="gender" value = "man">남자 
				<input type ="radio" name ="gender" value = "woman">여자</td> </tr>
				<tr><td>이메일<input type = "text" name="email"></td></tr>
				
				<tr> <td> <input type ="submit" value="register"></td></tr>
			</table>

		</form>
	</div>
</body>
</html>