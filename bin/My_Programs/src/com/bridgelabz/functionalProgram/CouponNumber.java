package com.bridgelabz.functionalProgram;

import java.util.Scanner;

/**
 * @purpose: This program find N distinct Coupon Numbers
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */

public class CouponNumber {


	public static void main(String[] args)
	{
		int count=0,distinct=0;
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many Coupon numbers you want");
		number=scanner.nextInt();

		int[] array = new int[number];

		
		
		for(int i=0; i<number; i++)
		{
			int g = 0;
			int val = (int) (Math.random()*number);
			array[i]= val;
			for(int j=0; j<array.length; j++)
			{
				if(array[i]==val){
					break;
				}
			}
			
			while(g<number){
				if(array[g]==val){
					
					break;
				}
			}
			
			
		}
		
		for(int k=1; k<array.length; k++){
			System.out.println(array[k]);
		}
		System.out.println("Total Random number to have Distinct Number... "+count);
		scanner.close();
	}


}
