package com.bridgelabz.dsprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import com.bridgelabz.utility.Utility;

/**
 * @purpose: This program is Create a Slot of 10 to store Chain of Numbers that belong to each Slot to efficiently search a number
 * 			 from a given set of number.
 * @author:  Nikhil Vaidya.
 * @version: 1.0 
 * @date :  25/01/2018
 *
 */
public class HashTable {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
			
		Utility utility = new Utility();
		File file = new File("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/hashtable.txt");
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

		String str = bufferedReader.readLine();
		String[] strArray = str.split(" ");

		Integer[] intArray = new Integer[strArray.length];

		for (int i = 0; i < strArray.length; i++)
		{
			intArray[i] = Integer.parseInt(strArray[i].trim());
			
		}
		
		HashMap<Integer, LinkedList<Integer>> hashmap = new HashMap<Integer, LinkedList<Integer>>();
		LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList3 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList4 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList5 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList6 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList7 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList8 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList9 = new LinkedList<Integer>();
		LinkedList<Integer> linkedList10 = new LinkedList<Integer>();
		
		for(Integer element : intArray){
			
			int remender = element% 11;
			
			switch(remender){
			
			case 0:
				linkedList0.add(element);
				hashmap .put(remender, linkedList0);
				break;
				
			case 1:
				linkedList1.add(element);
				hashmap.put(remender, linkedList1);
				break;
			
			case 2:
				linkedList2.add(element);
				hashmap.put(remender, linkedList2);
				break;
				
			case 3:
				linkedList3.add(element);
				hashmap.put(remender, linkedList3);
				break;
				
			case 4:
				linkedList4.add(element);
				hashmap.put(remender, linkedList4);
				break;
				
			case 5:
				linkedList5.add(element);
				hashmap.put(remender, linkedList5);
				break;
				
			case 6:
				linkedList6.add(element);
				hashmap.put(remender, linkedList6);
				break;
				
			case 7:
				linkedList7.add(element);
				hashmap.put(remender, linkedList7);
				break;
				
			case 8:
				linkedList8.add(element);
				hashmap.put(remender, linkedList8);
				break;
				
			case 9:
				linkedList9.add(element);
				hashmap.put(remender, linkedList9);
				break;
				
			case 10:
				linkedList10.add(element);
				hashmap.put(remender, linkedList10);
				break;
			}
		}
		
		System.out.println(hashmap);
		System.out.println("Enter number");
		int number = Utility.getInt();
		int remainder = number % 11;
		
		String string = "";
		
		switch (remainder) {
		case 0:
			
			linkedList0 = utility.serachMethod(linkedList0, number, 0);
			hashmap.put(remainder, linkedList0);	
			break;
		
		case 1:
			linkedList1 = utility.serachMethod(linkedList1, number, 0);
			hashmap.put(remainder, linkedList1);
			break;
			
		case 2:
			linkedList2 = utility.serachMethod(linkedList2, number, 0);
			hashmap.put(remainder, linkedList2);
			break;
			
		case 3:
			linkedList3 = utility.serachMethod(linkedList3, number, 0);
			hashmap.put(remainder, linkedList3);
			break;
			
		case 4:
			linkedList4 = utility.serachMethod(linkedList4, number, 0);
			hashmap.put(remainder, linkedList4);
			break;
			
		case 5:
			linkedList5 = utility.serachMethod(linkedList5, number, 0);
			hashmap.put(remainder, linkedList5);
			break;
			
		case 6:
			linkedList6 = utility.serachMethod(linkedList6, number, 0);
			hashmap.put(remainder, linkedList6);
			break;
			
		case 7:
			linkedList7 = utility.serachMethod(linkedList7, number, 0);
			hashmap.put(remainder, linkedList7);
			break;
			
		case 8:
			linkedList8 = utility.serachMethod(linkedList8, number, 0);
			hashmap.put(remainder, linkedList8);
			break;
			
		case 9:
			linkedList9 = utility.serachMethod(linkedList9, number, 0);
			hashmap.put(remainder, linkedList9);
			break;
			
		case 10:
			linkedList10 = utility.serachMethod(linkedList10, number, 0);
			hashmap.put(remainder, linkedList10);
			break;
		}
		
		string = linkedList0 +" "+linkedList1+" "+linkedList2+" "+linkedList3+" "+linkedList4+" "+linkedList5+" "+linkedList6+" "+linkedList7+" "+linkedList8+" "+linkedList9+" "+linkedList10;
		
		string = string.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\,", "").replaceAll("( )+", " ");
		
		FileWriter fileWriter = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/hashtable.txt");
		fileWriter.write(string);
		fileWriter.flush();
		fileWriter.close();
		System.out.println(hashmap);
		bufferedReader.close();
	}

}
