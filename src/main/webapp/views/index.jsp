<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome page</title>
</head>
<body>
	welcome samrat!!
	
	<form action="add" method  = "post">
		Enter 1st Number : <input type="text" name="num1"><br>
		Enter 2nd Number : <input type="text" name="num2"><br>
		<input type="submit" name="submit">
	</form>
	
	<form action="getAliens" method  = "get">
		Enter Alien Name : <input type="text" name="alien_name"><br>
		<input type="submit" name="submit">
	</form>
</body>
</html>