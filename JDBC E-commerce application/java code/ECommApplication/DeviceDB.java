package ECommApplication;

import java.sql.*;

public class DeviceDB {
	
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
			e.printStackTrace();
			System.out.println(" Exception thrown by connect() DevicesDB.");
		}
	}
	public void displayDevices()throws Exception
	{
		String query = "select * from Devices";
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			String userData = "";
			System.out.println("Id \t Name \t Price");
			while(rs.next())
			{
				userData = rs.getInt(1)+ "\t" + rs.getString(2)+ "\tRs." + rs.getString(3);
				System.out.println(userData);
			}
			
		} 
		catch (SQLException e) 
		{
			System.out.println(" Exception thrown by displayDevices");
			e.printStackTrace();
			
		}
	}
	public Devices getDevices(int did)throws Exception
	{
		String query = "select id , name, price from Devices where id = "+did;
		try{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			Devices p = new Devices();
			p.dev_id = rs.getInt(1);
			p.dev_name = rs.getString(2);
			p.dev_price = rs.getString(3);
			return p;
		}
		catch(Exception e)
		{
			System.out.println(" Exception thrown by getDevices");
			e.printStackTrace();
			
		}
		return null;
	}
	public void addToCart(Cart c)
	{
		String query = "insert into cart(Cust_id,Cust_name, dname, dprice) values(?,?,?,?)";
		try
		{
			PreparedStatement pt = con.prepareStatement(query);
			pt.setInt(1, c.Cust_id);
			pt.setString(2, c.Cust_Name);
			pt.setString(3, c.dname);
			pt.setString(4, c.dprice);
			pt.executeUpdate();
			System.out.println("Added to cart.");
		}
		catch(Exception e)
		{
			System.out.println(" Exception thrown by addToCart.");
			e.printStackTrace();
			
		}
	}
	public void displayCart(int id)throws Exception
	{
		String query = "select * from cart where Cust_id = "+id;
		try 
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			String userData = "";
			System.out.println("Cust_id \t Cust_name \t Device_name \t Device_price");
			while(rs.next())
			{
				userData = rs.getInt(1)+ "\t" + rs.getString(2)+ "\t" + rs.getString(3) + "\tRs." + rs.getString(4);
				System.out.println(userData);
			}
			
		} 
		catch (SQLException e) 
		{
			System.out.println(" Exception thrown by displayCart.");
			e.printStackTrace();
			
		}
	}
	
	public void buy(int Cust_id)throws Exception
	{
		try{
			String query = "delete from cart where Cust_id = "+Cust_id;
			Statement st = con.createStatement();
			st.executeUpdate(query);
			}
		catch(Exception e)
		{
			System.out.println(" Exception thrown by butItems.");
			e.printStackTrace();
			
		}
	}
}
