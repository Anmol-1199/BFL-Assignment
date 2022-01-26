package Assignment2;

// Given a number N, print sum of all even numbers from 1 to N.

import java.util.Scanner;

public class SumofEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int sum=0,i=1;
		while(i<=n)
		{
			if(i%2==0)
				sum+=i;
			
			i++;
		}
		
		System.out.println("Sum of Even nos. from 1 to "+n+" = "+sum);
		
		sc.close();

	}

}
