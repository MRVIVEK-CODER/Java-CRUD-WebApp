<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
	<h1>Add Book</h1>
	<form action="Insert" method="post">
		Book name:<input type="text" name="bname"><br><br>
		Book price:<input type="text" name="bprice"><br><br>
		<input type="submit" value="Add Book">
	</form>
</body>
</html>