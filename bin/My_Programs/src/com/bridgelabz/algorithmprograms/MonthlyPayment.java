package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args)
	{

		Utility util = new Utility();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the principal amount ");
		int p = sc.nextInt();
		System.out.println("interest rate ");
		Float r = sc.nextFloat();
		System.out.println("How many years");
		int y = sc.nextInt();
		double payment = util.calculatePayment(y, p, r);
		System.out.println("Monthly Payment is"+payment);
		
	}
}

