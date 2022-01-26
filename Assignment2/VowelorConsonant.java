package Assignment2;

// WAP to find weather the character entered by user is a vowel or not.

import java.util.Scanner;

public class VowelorConsonant {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of X and Y : "); 
		
		char ch=sc.next().charAt(0);
		
		switch (ch)
		{
		case 'a': 
		case 'e':
		case 'i': 
		case 'o':
		case 'u':
			System.out.println(ch+" is a Vowel."); 
		default:
			System.out.println(ch+" is a Consonant. "); 
			
		}
		
		sc.close();
		
	}

}
