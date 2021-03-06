package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Stack;

/**@purpose: This program add the Prime Numbers that are Anagram in the Range of 0 - 1000 in a Stack
 *			 using the Linked List and print in reverse order.
 * @author : Nikhil Vaidya
 * @version: 1.0
 * @since  : 22/01/2018 
 */
public class AnagramInStack {
	
	public static void main(String a[])
	{ 
		Stack stack = new Stack();

		int count=0;
		for(int i=11; i<1000; i++)
		{
			boolean temp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp=false;
					break;
				}
			}
			if(temp==true)
			{
				count++;
			}
		}
		
		int arr1[]=new int[count];
		int arr2[]=new int[count];
		int n=0;
		for(int i=11; i<1000; i++)
		{
			boolean temp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp=false;
					break;
				}
			}
			if(temp==true)
			{
				arr1[n]=i;
				int m=i;
				int sum=0,rem;
				while(m>0)
				{
					rem=m%10;
					sum=(sum*10)+rem;
					m=m/10;
				}
				arr2[n]=sum;
				n++;
			}
		}
		for(int i : arr2){
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		for(int i : arr1){
			System.out.print(i+" ");
			
		}
		System.out.println();
		System.out.println("Anagram numbers are are: ");
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					int digit=arr1[i];
					
					stack.push(digit);
				}
			}
		}
		stack.print();
	 }

}
