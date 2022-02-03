package ECommApplication;

import java.sql.*;

public class CustomerDB {
	Connection con = null;

	public void connect()throws Exception
	{
		try 
		{
			//step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//step2 create the connection object
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","onlinestore","onlinestore");
		} 
		catch (SQLException e) 
		{
			System.out.println(" Exception thrown by connect() CustomerDB.");
			e.printStackTrace();
			
		}
	}
	
	public void loginCustomer(Customer u)throws Exception
	{
		try 
		{
			String query = "insert into customer(mob_no, name, email, address) values(?,?,?,?)";
			PreparedStatement pst= con.prepareStatement(query);
			pst.setLong(1, u.mob_no);
			pst.setString(2, u.name);
			pst.setString(3, u.email);
			pst.setString(4, u.address);
			pst.executeUpdate();
		} 
		catch (SQLException e) 
		{
			System.out.println(" Exception thrown by loginCustomer.");
			e.printStackTrace();
		}
	}
	public void delCustomerr(long mob)throws Exception
	{
		try 
		{
			String query = "delete from customer where mob_no = "+ mob;
			Statement st = con.createStatement();
			st.executeUpdate(query);
			System.out.println("You are logged out.");
		}
		catch(Exception e)
		{
			System.out.println(" Exception thrown by delCustomer.");
			e.printStackTrace();
		}
	}
}
