package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public final class ConnectionProvider {

	static Connection connection=null;
	private ConnectionProvider()
	{
		
	}
	public static Connection getConn() 
	{
		try
		{	
		if(connection==null)
		{
			Class.forName(DB_ConnectionInfo.DRIVER);
			connection=DriverManager.getConnection(DB_ConnectionInfo.URL,DB_ConnectionInfo.USER,DB_ConnectionInfo.PASSWORD);
			return connection;
		}
		else
		{
			return connection;
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
}
