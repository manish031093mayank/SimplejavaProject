
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <jsp:useBean id="reg" class="beans.RegisterBeans"></jsp:useBean>
 <jsp:useBean id="regdao" class="dao.RegisterDao"></jsp:useBean>
<jsp:setProperty property="*" name="reg"/>
<%
String msg=regdao.save(reg);
if(msg.equals("success"))
%>
<jsp:forward page="welcome.jsp"></jsp:forward>

</body>
</html>