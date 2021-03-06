package com.bridgelabz.objectorientedprog;

import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for Company Share.
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 31/01/2018
 *
 */
public class CompanyShare {
	
	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		Utility utility = new Utility();
		System.out.println();
		System.out.println("********* Company Shares ********");
		while(true)
		{
			System.out.println();
			System.out.println("1. add the shares");
			System.out.println("2. remove the shares");
			System.out.println("3. Display the shares");
			System.out.println("4. total shares");
			System.out.println("5. Exit");
			int choice = Utility.getInt();           
			switch (choice)
			{
			case 1 : 
				System.out.println("Enter element to insert");
				list.insertbegin(Utility.getInt());
				break;      

			case 2 : 
				System.out.println("Enter position");
				int position = Utility.getInt();
				list.deletenode(position);
				System.out.println("remove successfuly");
				break;
				
			case 3:
				System.out.print("Shares are: ");
				list.printList();
			
				break;                  
			case 4 : 
				System.out.println("Size = "+ list.size() +" \n");
				break;   
			case 5: System.exit(0);
			default : 
				System.out.println("Wrong Entry \n ");
				break;   
			}

		}              
	}

}
