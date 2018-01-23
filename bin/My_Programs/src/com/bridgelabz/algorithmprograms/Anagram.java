package com.bridgelabz.algorithmprograms;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = scanner.nextLine();
		System.out.println("Enter Sceond String");
		String sceondString = scanner.nextLine();

		String regex = "\\s+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sceondString);
		Matcher matcher1 = pattern.matcher(firstString);

		if(matcher.find())
		{
			String string = matcher1.replaceAll("");
			sceondString = string;
		}else if(matcher1.find()){

			String string1 = matcher1.replaceAll("");
			firstString =string1;

		}

		char[] arr1 = firstString.toCharArray();
		char[] arr2 = sceondString.toCharArray();

		int length1 = arr1.length;
		int length2 = arr2.length;
		scanner.close();
		boolean val = utility.isAnagram(length1, length2, firstString, sceondString);
		
		if(val == true){
			System.out.println(firstString+" and "+sceondString+" both strings are Anagram");
		}
		else{
			System.out.println(firstString+" and "+sceondString+" strings are Not Anagram");
		}

	}
}