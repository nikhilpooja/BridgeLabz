package com.bridgelabz.dsprograms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import javax.xml.namespace.QName;

import com.bridgelabz.utility.Utility;

public class BankCounter {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		System.out.println("Enter the number of people waiting in queue");
		int number = Utility.getInt();
		
		int balance,Acno;
		String name;
		Queue<String> queue = new LinkedList<String>();
		
		for(int i=0; i<number; i++ ){
			
		System.out.println("Enter First Name");
		name = Utility.getString();
		queue.add(name);
		
		System.out.println("Enter A/C Number");
		Acno = Utility.getInt();
		queue.add(Integer.toString(Acno));
		
		System.out.println("Enter Balance");
		balance = Utility.getInt();
		queue.add(Integer.toString(balance));
	
	}
		while(queue.size()>0)
		{
			Bank bank = new Bank(queue.poll(),Integer.parseInt(queue.poll()),Integer.parseInt(queue.poll()));
			bank.process();
		}

}
}
