package com.bridgelabz.dsprograms;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;


/**
 * @purpose: This program is used to display the calendar.
 * @author: Nikhil Vaidya
 * @version: 1.0
 * @since 10/01/2018
 */

public class Calendar {
	
	public static void main(String[] args) {

		Utility utility = new Utility();	
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		
		Utility.calender(year, month);
		

		

	}
}