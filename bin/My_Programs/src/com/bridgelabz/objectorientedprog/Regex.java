package com.bridgelabz.objectorientedprog;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for DeekofCards to initialize deck of cards having suit ("Clubs", 
 * 			  "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8", "9", "10", 
 * 			  "Jack", "Queen", "King", "Ace"). 
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 31/01/2017
 */
public class Regex {

	Scanner sc=new Scanner(System.in);
	String message="Hello <<Name>>, We have your full name as <<Full Name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	private String fName;
	private String lName;
	private String mNumber="0";
	private String date;

	public void setFirstName() {
		System.out.println("Enter The First Name :");
		fName=sc.next();

		while(!iscontainNumber(fName)){
			System.out.println("Invalid First Name");
			System.out.println("Please enter name again");
			fName=sc.next();

		}

	}

	public void setLastName() {
		System.out.println("Enter The Last Name :");
		lName=sc.next();
		
		while(!iscontainNumber(lName)){
			System.out.println("Invalid Last Name");
			System.out.println("Please enter name again");
			lName=sc.next();

		}
	}


	public void setMobileNumber() {
		System.out.println("Enter The Mobile Number :");
		mNumber=sc.next();

		while (isTenDigit(mNumber)) {
			
			System.out.println("Invalid mobile number");
			System.out.println("Please enter number again");
			mNumber = sc.next();
			
		}
	}


	public void setDate() {
		System.out.println("Enter The Date (dd/mm/yyyy) :");
		date=sc.next();
		Pattern pattern = Pattern.compile("^[0-3]?[0-9]/[0-3]?[0-9]/([0-9]{4})$");//"^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$"
		Matcher matcher = pattern.matcher(date);

		if(!matcher.matches())
		{	
			setDate();
		}	
	}
	//is ten digits validation 
	public boolean isTenDigit(String number) {
		if((number.length())==10 && number.contains("[a-zA-Z]+")){
			
			return true;
		}
			
		else{
			return false;
		}
			
	}

	public boolean iscontainNumber(String name) 
	{
		if(name.matches("[a-zA-Z]+\\.?"))
		{
			return true ;
		}else{
			return false;
		}
	}

	/*public String replace(String str, String ptrn) {
		Pattern pattern = Pattern.compile("<<name>>|<<full name>>|xxxxxxxxxx|01/01/2016");
		Matcher matcher = pattern.matcher(str);
		return matcher.replaceAll(ptrn);
	}*/
	public String RegexReplace()
	{
		String firstName="<<Name>>";
		String fullName="<<Full Name>>";
		String mobileno="xxxxxxxxxx" ;
		String Date="01/01/2016";

		//Regex to replace first Name 
		Pattern pattern = Pattern.compile(firstName);
		Matcher matcher = pattern.matcher(message);
		message=matcher.replaceAll(fName); 

		//Regex to replace full Name
		pattern = Pattern.compile(fullName);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(fName+" "+lName);

		//Regex to replace mobile number
		pattern = Pattern.compile(mobileno);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(mNumber);	


		//Regex to replace Date
		pattern = Pattern.compile(Date);
		matcher = pattern.matcher(message);
		message=matcher.replaceAll(date);
		return message;
	}

	public static void main( String args[] ) {
		Regex rx = new Regex();

		rx.setFirstName();

		rx.setLastName();	

		rx.setMobileNumber();

		rx. setDate();
		System.out.println("hi");
		String regixs=rx.RegexReplace();

		System.out.println(regixs);


	}
}