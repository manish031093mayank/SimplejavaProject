<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<form action="doRegister.jsp" method="Post">
<h1>Register page</h1>
<label>enter your name</label>
<input type="text" name="name" placeholder="please enter your name" required="required">
<br>
<label>enter your email</label>
<input type="text" name="email" placeholder="please enter oyue email" required="required">
<br>
<label>enter your mobile</label>
<input type="text" name="mobile" placeholder="please enter your mobile" required="required">
<br>
<label>enter your password</label>
<input type="password"  name="password" placeholder="please enter your password" required="required">
<br>
<input type="submit" value="register">
</form>
</body>
</html>


