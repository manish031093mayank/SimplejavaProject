package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import beans.RegisterBeans;
import dbconn.ConnectionProvider;

public class RegisterDao 
{
   public String save(RegisterBeans bean)
   {
	   try
	   {
	        Connection con=ConnectionProvider.getConn();
	   PreparedStatement preparedStatement=con.prepareStatement("insert into register1(name,email,mobile,password,status,otp) values(?,?,?,?,?,?)");
	   preparedStatement.setString(1,bean.getName());
	   preparedStatement.setString(2,bean.getEmail());
	   preparedStatement.setString(3,bean.getMobile());
	   preparedStatement.setString(4,bean.getPassword());
	    int i=preparedStatement.executeUpdate();
	   if(i>0)
	   {
	  return "success";   	 
	   }
	   else
	  
	   	  return "fail";
	     

	   }
	   catch(Exception e)
	   {
	   System.out.println(e);	
	   }

      return "fail";

   }
}
