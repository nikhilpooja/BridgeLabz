package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

/**
 * @purpose: This program is used to sort string array using bubble sort.
 * @author Nikhil Vaidya.
 * @version: 1.0
 * @date: 15/01/2018
 */


public class BubbleSortForStr {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter size of Array");
		int size = scanner.nextInt();
		String[] arr = new String[size];
		
		System.out.println("Enter "+size+" words");
		for(int i=0; i<size; i++)
		{
			arr[i] = scanner.nextLine();
		
		}
		System.out.println("Before sort String");
		for(String i : arr)
		{	
			System.out.print(i+" ");	
		}
		
		Utility.bubbleSort(arr);
		
		System.out.println("Sorted String is....");
		for(String i : arr ){
			
			System.out.print(i+" ");
			
		}
		scanner.close();
			
	}

}