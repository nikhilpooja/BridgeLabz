package com.bridgelabz.dsprograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.xml.namespace.QName;

public class BankCounter {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of people waiting in queue");
		int number =scanner.nextInt();
		
		
		int balance,Acno;
		String name;
		
		Queue<String> queue = new LinkedList<String>();

		System.out.println("Enter Number");
		name = scanner.nextLine();
		queue.add(name);
		
		System.out.println("Enter A/C No");
		Acno = scanner.nextInt();
		queue.add(Integer.toString(Acno));
		
		System.out.println("Enter Balance");
		balance = scanner.nextInt();
		queue.add(Integer.toString(balance));
	
	}

}