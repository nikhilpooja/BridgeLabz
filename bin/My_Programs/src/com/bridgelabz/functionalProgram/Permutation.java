package com.bridgelabz.functionalProgram;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is used to find permutations of string.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 13/01/2018
 */

public class Permutation
{
    public static void main(String[] args)
    {
    	Utility utility = new Utility();
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("enter the String");
        String str = scanner.next();
        int n = str.length();
        utility.permute(str, 0, n-1);
        scanner.close();
    }
    	
}