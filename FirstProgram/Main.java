package FirstProgram;

import java.util.Scanner;

class Person{
	private String name;
	private String dateOfBirth;
	private String gender;
	private String mobileNumber;
	private String bloodGroup;
	
	public String getName() {
		return name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	
	public void setName(String a) {
		this.name=a;
	}
	public void setDateOfBirth(String a) {
		this.dateOfBirth=a;
	}
	public void setGender(String a) {
		this.gender=a;
	}
	public void setMobileNumber(String a) {
		this.mobileNumber=a;
	}
	public void setBloodGroup(String a) {
		this.bloodGroup=a;
	}
}

class Donor extends Person{
	private String bloodBankName;
	private String donorType;
	private String donationDate;
	
	public String getbloodBankName() {
		return bloodBankName;
	}
	public String getdonorType() {
		return donorType;
	}
	public String getdonationDate() {
		return donationDate;
	}
	
	
	public void setbloodBankName(String a) {
		this.bloodBankName=a;
	}
	public void setdonorType(String a) {
		this.donorType=a;
	}
	public void setdonationDate(String a) {
		this.donationDate=a;
	}
	
	public void displayDonationDetails() {
		System.out.println("Donation Details:");
		String a=getName();
		System.out.println("Name : "+ a);
		a=getDateOfBirth();
		System.out.println("Date Of Birth : "+ a);
		a=getGender();
		System.out.println("Gender : "+ a);
		a=getMobileNumber();
		System.out.println("Mobile Number : "+ a);
		a=getBloodGroup();
		System.out.println("Blood Group : "+ a);
		System.out.println("Blood Bank Name : "+ bloodBankName);
		System.out.println("Donor Type : "+ donorType);
		System.out.println("Donation Date : "+ donationDate);
	}
}


public class Main {

	public static void main(String[] args) {
		Donor obj=new Donor();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name : ");
		String name=sc.nextLine();
		System.out.println("Enter Date of Birth : ");
		String dob=sc.nextLine();
		System.out.println("Enter Gender : ");
		String gender=sc.nextLine();
		System.out.println("Enter Mobile Number : ");
		String mob=sc.nextLine();
		System.out.println("Enter Blood Group : ");
		String bgrp=sc.nextLine();
		System.out.println("Enter Blood Bank Name : ");
		String BloodBank=sc.nextLine();
		System.out.println("Enter Donor Type : ");
		String type=sc.nextLine();
		System.out.println("Enter Donation Date : ");
		String date=sc.nextLine();
		
		sc.close();
		obj.setName(name);
		obj.setDateOfBirth(dob);
		obj.setGender(gender);
		obj.setMobileNumber(mob);
		obj.setBloodGroup(bgrp);
		obj.setbloodBankName(BloodBank);
		obj.setdonorType(type);
		obj.setdonationDate(date);
		
		obj.displayDonationDetails();
		
	}

}
