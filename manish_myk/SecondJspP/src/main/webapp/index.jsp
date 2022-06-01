
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
<body bgcolor="yellow">
<form action="login.jsp">
<h1>Login Page</h1>
<label>enter your email</label>
<input type="text" placeholder="please enter your email" required="required">
<br>

<label>enter your password</label>
<input type="text" placeholder="please enter your password" required="required">
<br>
<input type="submit"  value="Login">
<a href="register.jsp">click for new user</a>
</form>
</body>
</html>


















%>