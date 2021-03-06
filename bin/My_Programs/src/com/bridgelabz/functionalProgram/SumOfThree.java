package com.bridgelabz.functionalProgram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This is program read in N integers and counts the number of triples that sum
 * 			 to exactly 0.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 12/01/2018
 */

public class SumOfThree {
	
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int length = scanner.nextInt();
		int [] arr = new int [length];
		System.out.println("Enter the "+length+"  element in array");
		for(int i=0; i<length; i++)
		{
		arr[i] =  scanner.nextInt();
		}
		System.out.println("***************** Triplet Pairs *****************");
		System.out.println();
		utility.sumOfThree(arr, length);
		scanner.close();
	}

}
