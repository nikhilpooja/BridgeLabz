package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day");
		int d=sc.nextInt();
		System.out.println("Enter the month");
		int m=sc.nextInt();
		System.out.println("Enter the year");
		int y=sc.nextInt();

		if (m > 0 && m < 13) {

			if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
				if (d < 1 || d > 31) {
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if (m == 4 || m == 6 || m == 9 || m == 11) {
				if (d < 1 || d > 30) {
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if (m == 2) {
				if (d < 1 || d > 29) {
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}

			if (m == 2 && y % 4 != 0) {
				if (d == 29) {
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}
			int y1 = y - (14 - m) / 12;
			int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
			int m1 = m + 12 * ((14 - m) / 12) - 2;
			int d1 = (d + x + (31 * m1) / 12) % 7;
			String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursdsy","Friday","Saturday"};

			System.out.println("the day on " + m + "/" + d + "/" + y + " is " + days[d1] + " .");
		} else {
			System.out.println("month is out of range");
		}
	}
}