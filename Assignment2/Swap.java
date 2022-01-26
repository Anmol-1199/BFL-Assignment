package Assignment2;

// WAP to swap the values of 2 nos.(Take input from user)

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X and Y : ");  
		int x = sc.nextInt();  
		int y = sc.nextInt();  
		System.out.println("before swapping numbers: X= "+x +", Y= "+ y);   
		int t = x;  
		x = y;  
		y = t;  
		System.out.println("After swapping: X= "+x +", Y= " + y);  
		System.out.println( ); 
		
		sc.close();

	}

}
