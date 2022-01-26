package Assignment2;

//Swap the nos in Array.

import java.util.Scanner;

public class SwapArray {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the elements of array :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n-1; i+=2) {
			int t=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=t;
		}
		
		System.out.println("Swapped array :");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();

	}

}
