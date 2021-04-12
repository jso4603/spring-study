<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>confirmId</title>
</head>
<body>
	<form class="idpw-form">
		ID : <input type="text" name="id" />
		PW : <input type="password" name="pw" />
		<input type="submit" class="btn"> <br>

		id : ${id} <br>
		pw : ${pw}
	</form>
</body>
</html>