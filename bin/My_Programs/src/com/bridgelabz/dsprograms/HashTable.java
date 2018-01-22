package com.bridgelabz.dsprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class HashTable {

	public static void main(String[] args) throws IOException {
			
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		File file = new File("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/hashtable.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));

		String str = buffer.readLine();
		String[] strArray = str.split(" ");

		Integer[] intArray = new Integer[strArray.length];

		for (int i = 0; i < strArray.length; i++)
		{
			intArray[i] = Integer.parseInt(strArray[i].trim());
			
		}
		
		HashMap hashmap = new HashMap();
		LinkedList ll0 = new LinkedList();
		LinkedList ll1 = new LinkedList();
		LinkedList ll2 = new LinkedList();
		LinkedList ll3 = new LinkedList();
		LinkedList ll4 = new LinkedList();
		LinkedList ll5 = new LinkedList();
		LinkedList ll6 = new LinkedList();
		LinkedList ll7 = new LinkedList();
		LinkedList ll8 = new LinkedList();
		LinkedList ll9 = new LinkedList();
		LinkedList ll10 = new LinkedList();
		
		for(Integer element : intArray){
			
			int remender = element% 11;
			
			switch(remender){
			
			case 0:
				ll0.add(element);
				hashmap .put(remender, ll0);
				break;
				
			case 1:
				ll1.add(element);
				hashmap.put(remender, ll1);
				break;
			
			case 2:
				ll2.add(element);
				hashmap.put(remender, ll2);
				break;
				
			case 3:
				ll4.add(element);
				hashmap.put(remender, ll3);
				break;
				
			case 4:
				ll4.add(element);
				hashmap.put(remender, ll4);
				break;
				
			case 5:
				ll5.add(element);
				hashmap.put(remender, ll5);
				break;
				
			case 6:
				ll6.add(element);
				hashmap.put(remender, ll6);
				break;
				
			case 7:
				ll7.add(element);
				hashmap.put(remender, ll7);
				break;
				
			case 8:
				ll8.add(element);
				hashmap.put(remender, ll8);
				break;
				
			case 9:
				ll9.add(element);
				hashmap.put(remender, ll9);
				break;
				
			case 10:
				ll10.add(element);
				hashmap.put(remender, ll0);
				break;
			}
		}
		
		System.out.println(hashmap);
		System.out.println("Enter number");
		int number = scanner.nextInt();
		int remainder = number % 11;
		
		String string = "";
		
		switch (remainder) {
		case 0:
			
			ll0 = utility.serachMethod(ll0, number, 0);
			hashmap.put(remainder, ll0);	
			break;
		
		case 1:
			ll1 = utility.serachMethod(ll1, number, 0);
			hashmap.put(remainder, ll1);
			break;
			
		case 2:
			ll2 = utility.serachMethod(ll2, number, 0);
			hashmap.put(remainder, ll2);
			break;
			
		case 3:
			ll3 = utility.serachMethod(ll3, number, 0);
			hashmap.put(remainder, ll3);
			break;
			
		case 4:
			ll4 = utility.serachMethod(ll4, number, 0);
			hashmap.put(remainder, ll4);
			break;
			
		case 5:
			ll5 = utility.serachMethod(ll5, number, 0);
			hashmap.put(remainder, ll5);
			break;
			
		case 6:
			ll6 = utility.serachMethod(ll6, number, 0);
			hashmap.put(remainder, ll6);
			break;
			
		case 7:
			ll7 = utility.serachMethod(ll7, number, 0);
			hashmap.put(remainder, ll7);
			break;
			
		case 8:
			ll8 = utility.serachMethod(ll8, number, 0);
			hashmap.put(remainder, ll8);
			break;
			
		case 9:
			ll9 = utility.serachMethod(ll9, number, 0);
			hashmap.put(remainder, ll9);
			break;
			
		case 10:
			ll10 = utility.serachMethod(ll10, number, 0);
			hashmap.put(remainder, ll2);
			break;
		}
		
		string = ll0 +" "+ll1+" "+ll2+" "+ll3+" "+ll4+" "+ll5+" "+ll6+" "+ll7+" "+ll8+" "+ll9+" "+ll10;
		
		string = string.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", "").replaceAll("( )+", " ");
		
		FileWriter fw = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/hashtable.txt");
		fw.write(string);
		fw.flush();
		fw.close();
		System.out.println(hashmap);
		scanner.close();
	}

}
