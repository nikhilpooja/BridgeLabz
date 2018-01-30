package com.bridgelabz.functionalProgram;
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
	    	System.out.println("enter the String");
	        String string = utility.getString();
	        int length = string.length();
	        utility.permutation(string, 0, length-1);
	    }

	} 	
