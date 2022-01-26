package Assignment2;

// WAP to generate the reverse of a given number N. Print the corresponding reverse number.

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
		int rev=0;
		while(n!=0)
		{
			int t=n%10;
			rev=(rev*10)+t;
			n/=10;
		}
		
		System.out.println("The reversed number: "+rev);
		
		sc.close();
	}

}
