package com.bridgelabz.objectorientedprog;

import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for Clinique Management System.
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 31/01/2018
 *
 */
public class CliniqueManagement {

	public static void main(String[] args) throws ParseException {
		Utility utility = new Utility();
		
		while (true) 
		{
			System.out.println("Enter 1 to Add Doctors");
			System.out.println("Enter 2 to Add Patients");
			System.out.println("Enter 3 to Search Doctor");
			System.out.println("Enter 4 to Search Patient");
			System.out.println("Enter 5 to Take an appoitment");
			int choice = Utility.getInt();
			switch (choice) {
			case 1:
				utility.addDoctors();
				break;
			case 2:
				utility.addPatient();
				break;
			case 3:
				utility.searchDoctor();
				break;
			case 4:
				utility.searchPatient();
				break;
			case 5:
				utility.takeAnAppointment();
				break;
			}
		}

	}

}
