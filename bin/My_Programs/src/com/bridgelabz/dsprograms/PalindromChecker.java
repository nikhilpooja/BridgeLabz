package com.bridgelabz.dsprograms;

import java.util.LinkedList;
import java.util.Scanner;

public class PalindromChecker {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter string ");
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        LinkedList queue = new LinkedList();
        
        for (int i = string.length()-1; i >=0; i--) 
        {
            queue.add(string.charAt(i));
        }
        String reverseString = "";
        
        while (!queue.isEmpty())
        {
            reverseString = reverseString+queue.remove();
        }
        if (string.equals(reverseString))
        {
        	System.out.println("The String is a palindrome.");
        }
        else
        {
            System.out.println("The String is not a palindrome.");
        }
        
	}
}
