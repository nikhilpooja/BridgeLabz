package com.bridgelabz.dsprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static int day(int month, int day, int year)
	{
		int y = year - (14 - month) / 12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31*m)/12) % 7;
		return d;
	}

	public static void main(String[] args) {

		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Month");
		int month = scanner.nextInt();

		System.out.println("Enter year");
		int year = scanner.nextInt();

		String months[] ={"","January","February","March","April","May","June","July","August","September",
				"October","November","December"};

		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		if(month == 2 && utility.isLeapYear(year))
		{

			days[month] = 29;
		}

		System.out.println("*****" + months[month] + " " + year+"*****");
		System.out.println("--------------------");
		System.out.println(" S  M T  W Th  F  S");
		System.out.println("--------------------");
		
		int d = day(month, 1, year);
		
		for (int i = 0; i < d; i++)
		{
			System.out.print("   ");
		}
		for (int i = 1; i <= days[month]; i++) 
		{
			System.out.printf("%2d ", i);
			if(((i + d) % 7 == 0) || (i == days[month])) 
			{
				System.out.println();
			}
		}
	}
}
