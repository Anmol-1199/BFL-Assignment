package ECommApplication;

public class Cart {

	long Cust_id ;
	String Cust_Name ;
	String dname ;
	String dprice ;
	
	public Cart(long Cust_id,String Cust_Name, String dname, String dprice) {
		super();
		this.Cust_id = Cust_id;
		this.Cust_Name = Cust_Name;
		this.dname = dname;
		this.dprice = dprice;
	}
	
}
