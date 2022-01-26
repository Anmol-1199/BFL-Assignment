package Assignment2;

// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

import java.util.Scanner;

public class PrimeinRange {

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
		
		System.out.println("Prime numbers between 2 to"+n+" =");
		for(int i=2;i<=n;i++)
		{
			if (isPrime(i)) {  
		           System.out.println(i);  
		       }
		}
		
		sc.close();

	}

}
