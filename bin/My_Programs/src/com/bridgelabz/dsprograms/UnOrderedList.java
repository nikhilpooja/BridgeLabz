package com.bridgelabz.dsprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UnOrderedList {

	public static void main(String[] args) {
		
		try {
			File file = new File("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/unorderlist.txt");
			
			boolean mark = false;
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			
			Scanner scanner = new Scanner(System.in);
			String words = buffer.readLine();
			
			FileWriter pw = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/unorderlist.text");
			String[] str1 = words.trim().split(" ");

			LinkedList<String> l = new LinkedList<String>();

			for (int i = 0; i < str1.length; i++)
				l.add(str1[i]);

			System.out.println(l.toString());

			System.out.println("Enter the String to search...");
			String search = scanner.next();

			for (int i = 0; i < l.size(); i++) {
				if (l.get(i).equals(search)) {
					l.remove(i);
					mark = true;
				}
			}
			System.out.println(l.toString());

			if (mark == false)
				l.add(search);

			if (mark == true) 
			{
				for (int i = 0; i < l.size(); i++) {
					String str2 = (String) (l.get(i)) + " ";
					pw.write(str2);
					pw.flush();
			}

			} else {
				for (int i = 0; i < l.size(); i++) 
				{
					String str11 = (String) l.get(i) + " ";
					pw.write(str11);
					pw.flush();
				}
			}
			System.out.println(l.toString());
			buffer.close();
			scanner.close();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
