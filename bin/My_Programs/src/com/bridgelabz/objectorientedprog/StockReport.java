package com.bridgelabz.objectorientedprog;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


import com.bridgelabz.utility.Utility;

/**
 * @purpose : This program is used for to maintain stock report.
 * @author  : Nikhil Vaidya.
 * @version : 1.0
 * @date    : 01/02/2018
 */
public class StockReport {

	
	public static void main(String[] args){
		
		JSONArray jsonArray = new JSONArray();
		Utility utility = new Utility();
		System.out.println("Enter Number of company");
		int number = Utility.getInt();
		String[] array = new String[number];
		int share[] = new int[number];
		int amount[] = new int[number];
		int total[] = new int[number];
		System.out.println("Enter company name");
		int totalStock=0;
		for(int i=0; i<number; i++){

			array[i] = Utility.getString();
		}


		for(int i=0; i<number; i++){
			System.out.println("Enter the number of shares for "+array[i]+" and share amount");
			share[i] = Utility.getInt();
			amount[i] = Utility.getInt();
		}

		for(int i=0; i<number; i++){
			total[i] = share[i]*amount[i];
		}
		System.out.println();
		System.out.println("*******************Stock Report**************************");
		System.out.println();
		System.out.println("  Company Name    Shares    Price   total of each");
		System.out.println();
		PrintWriter printWriter =null;
		try {
			printWriter = new PrintWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/StockReport.json");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=0; i<number; i++)
		{
			System.out.println("  "+array[i]+"        "+share[i]+"       "+amount[i]+"     "+total[i]+"/-");	
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("Company Name",array[i]);
			jsonObject.put("Shares",share[i]);
			jsonObject.put("Price",amount[i]);
			jsonObject.put("total",total[i]);
			jsonArray.add(jsonObject);
			
		}	
		
		printWriter.write(jsonArray.toJSONString());
		printWriter.flush();
		printWriter.close();
		System.out.println();
		for(int i=0; i<number; i++){

			totalStock+= share[i]*amount[i];
		}
		System.out.println("Total stock is: "+totalStock);
	}
}
