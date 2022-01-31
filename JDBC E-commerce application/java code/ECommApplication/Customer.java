package ECommApplication;

public class Customer {
	int mob_no;
	String name;
	String email;
	String address;
	
	public Customer()
	{
	}
	
	public int getmob_no() {
		return mob_no;
	}

	public void setmob_no(int mob_no) {
		this.mob_no = mob_no;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Customer(int mob_no, String name, String email, String address) {
		super();
		this.name = name;
		this.mob_no = mob_no;
		this.email = email;
		this.address = address;
	}
}
