package ECommApplication;

import java.sql.*;

public class SellerDB {

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
			
			System.out.println("Exception thrown by connect() in SellerDB.");
			e.printStackTrace();
		}
	}
	public String getSeller(int sid)throws Exception
	{
		String query = "select Seller_Name from Seller where Seller_id ="+sid;
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name = rs.getString(1);
			return name;
		} catch (SQLException e) {
			System.out.println("Exception caused by getSeller");
			e.printStackTrace();
		}
		return null;
	}
	public void addDevice(int dev_id, String dev_name, String dev_price)throws Exception
	{
		try {
		String query = "insert into Devices(id, name, price) values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, dev_id);
		ps.setString(2, dev_name);
		ps.setString(3, dev_price);
		ps.executeUpdate();
		System.out.println("Device added successfully.");
		}
		catch(Exception e)
		{
			System.out.println("Exception thrown by addDevice.");
			e.printStackTrace();
		}
	}
	public void delDevice(int dev_id)throws Exception
	{
		try 
		{
			String query = "delete from devices where id = "+ dev_id;
			Statement st = con.createStatement();
			st.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(" Exception thrown by delDevice.");
			e.printStackTrace();
		}
	}
	
}
