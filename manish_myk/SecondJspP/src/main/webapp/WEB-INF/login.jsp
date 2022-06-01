<%@page import="dbconn.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
 String email=request.getParameter("email");
 String pass=request.getParameter("pass"); 
try
{
     Connection con=ConnectionProvider.getConn();
	 
	  PreparedStatement preparedStatement1=con.prepareStatement("select * from register1 where email=? and password=?");
	   
	  preparedStatement1.setString(1,email);
	  preparedStatement1.setString(2,pass);
	  

	  ResultSet rs=preparedStatement1.executeQuery();		 
	  if(rs.next())
	  {
		  response.sendRedirect("welcome.jsp");		
	  }  

	   else
{
	   
			  out.println("Invalid user name or pass");
			  RequestDispatcher requestDispatcher=request.getRequestDispatcher("index.jsp");
			  requestDispatcher.include(request, response);
			
}
	  
  

}
catch(Exception e)
{
out.println(e);	
}



%>


</body>
</html>