package ECommApplication;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Online Electronics Store");
		System.out.println("User Type :");
		System.out.println("1. User.");
		System.out.println("2. Admin");
		System.out.println("Press 0 to Close");
		Scanner sc=new Scanner(System.in);
		int choice= sc.nextInt();
		
		do
		{
			switch(choice)
			{
			case 1: // User
				Scanner sc1 = new Scanner(System.in);
				Customer ob = new Customer();
				System.out.println("Enter Mob No. :");
				ob.setmob_no(sc.nextInt());
				System.out.println("Enter Name :");
				ob.setName(sc1.nextLine());
				System.out.println("Enter Email :");
				ob.setEmail(sc1.nextLine());
				System.out.println("Enter Address :");					
				ob.setAddress(sc1.nextLine());
				CustomerDB ud = new CustomerDB();
				
				try 
				{
					ud.connect();
					ud.loginCustomer(ob);
					System.out.println("Welcome "+ob.name+"."+" How may we help you.");
					System.out.println("1. View Devices");
					System.out.println("2. Add in cart");
					System.out.println("3. View Cart and buy items");
					System.out.println("Press 0 to Exit");
					int i=sc.nextInt();
					do
					{
						switch(i)
						{
							case 1:
								DeviceDB pd1 = new DeviceDB();
								pd1.connect();
								pd1.displayDevices();
								break;
							case 2:
								DeviceDB pd2 = new DeviceDB();
								System.out.println("Add a Device(Enter Device ID) :");
								
								int pid = sc.nextInt();
								pd2.connect();
								//getting the product details and storing it in product object
								Devices p1 = pd2.getDevices(pid);
								//Creating the cart object
								Cart c1 = new Cart(ob.mob_no ,ob.name , p1.dev_name, p1.dev_price);
								//entering the values of cart object into the database;
								pd2.addToCart(c1);
								break;
							case 3:
								System.out.println("Cart : ");
								DeviceDB pd3 = new DeviceDB();
								pd3.connect();
								pd3.displayCart(ob.mob_no);
								pd3.buy(ob.mob_no);
								System.out.println("Your order placed. Thank You for shopping with us.");
								
								break;
							default:
								System.out.println("Invalid choice");
								
						}
						System.out.println("1. View Devices");
						System.out.println("2. Add in cart");
						System.out.println("3. View Cart and buy items");
						System.out.println("Press 0 to Exit");
						int j=sc.nextInt();
						i=j;
					}while(i!=0);
				}
				catch (Exception e) {
					e.printStackTrace();
				}	
					break;
			
			case 2: // Admin
				SellerDB s = new SellerDB();
				Scanner sc7 = new Scanner(System.in);
				System.out.println("Enter Seller ID:");
				int sid = sc.nextInt();
				System.out.println("Enter Seller Name:");
				String sname = sc7.nextLine();
				
				try
				{
					s.connect();
					String check=s.getSeller(sid);
					if(sname.equals(check))
					{
						System.out.println("Welcome "+sname);
						System.out.println("1. Add a Devices");
						System.out.println("2. View Devices in stock");
						System.out.println("3. Delete a device");
						System.out.println("Press 0 to Exit");
						int k=sc.nextInt();
						do
						{
							switch(k)
							{
								case 1:
									Scanner sc8 = new Scanner(System.in);
									System.out.println("Enter the Product id:");
									int dev_id = sc.nextInt();
									System.out.println("Enter the Product Name:");
									String dev_name = sc8.nextLine();
									System.out.println("Enter the Product Price");
									String dev_price = sc8.nextLine();
									//adding the product into the database
									s.addDevice(dev_id,dev_name,dev_price);
									break;
								case 2:
									DeviceDB pd4= new DeviceDB();
									pd4.connect();
									System.out.println("Products in-stock: ");
									pd4.displayDevices();
									break;
								case 3:
									Scanner sc9 = new Scanner(System.in);
									DeviceDB pd5 = new DeviceDB();
									System.out.println("Enter the id of the product to be deleted: ");
									int did = sc9.nextInt();
									s.delDevice(did);
									System.out.println("Product in stock after deletion of "+did+" : ");
									pd5.connect();
									pd5.displayDevices();
									break;
								
								default:
									System.out.println("Invalid action. Choose again.");
									break;
							}
							System.out.println("1. Add a Devices");
							System.out.println("2. View Devices in stock");
							System.out.println("3. Delete a device");
							System.out.println("Press 0 to Exit");
							int j=sc.nextInt();
							k=j;
						}while(k!=0);
					}
					else
					{
						System.out.println("Invalid Admin name/password");
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
				break;
				
			default:
				System.out.println("Invalid User Type. Choose again.");
				break;
				
			
			}
			
			System.out.println("User Type :");
			System.out.println("1. User.");
			System.out.println("2. Admin");
			System.out.println("Press 0 to Close");
			int x=sc.nextInt();
			choice = x;
		}while(choice!=0);
		
		sc.close();
		System.out.println("Thank You.....");
	}

}

