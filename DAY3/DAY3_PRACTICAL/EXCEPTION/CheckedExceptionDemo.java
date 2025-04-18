package EXCEPTION;
import java.sql.*;
class DbConnection
{
	Connection cn=null;
	public Connection getConn()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn=DriverManager.getConnection("oracle:jdbc");
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return cn;
	}
}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
