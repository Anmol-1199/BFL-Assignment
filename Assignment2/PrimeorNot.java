package Assignment2;

// WAP to check weather the no entered by user is prime or not.

import java.util.Scanner;

public class PrimeorNot {

	public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
		if (isPrime(n)) {  
	           System.out.println(n + " is a prime number");  
	       }
		else {  
	           System.out.println(n + " is not a prime number");  
	       } 
		sc.close();

	}

}
