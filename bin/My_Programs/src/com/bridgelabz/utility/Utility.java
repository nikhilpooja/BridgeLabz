package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.rmi.CORBA.Util;

import org.json.JSONException;
import org.json.simple.JSONAware;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {

	int i =0;
	static Scanner scanner;
	public Utility() {

		scanner = new Scanner(System.in);
	}
	public static String getString(){
		return scanner.next();
	}

	public static int getInt(){
		return scanner.nextInt();
	}
	public static double getDouble(){
		return scanner.nextDouble();
	}
	public static boolean getBoolean(){
		return scanner.nextBoolean();
	}

	/** This method is used for temprature convertion.
	 * @param n
	 * @param value
	 * @return
	 */
	public double tempratureConvertion(int n, Double value){

		double ans;
		if (n == 0) {
			value = value *1.8;
			ans = value + 32;
			return ans;
		}
		if (n == 1) {
			value = value - 32;
			ans = value * 0.5556;
			return ans;
		}
		return 0;
	}

	/** This method is used to calculate payment.
	 * @param y
	 * @param p
	 * @param r
	 * @return
	 */
	public double calculatePayment(int y, int p, float r){

		int n = 12 * y;
		float i = r / (12 * 100);
		double pow = Math.pow((1 + i), (-n));
		double payment = p * i / (1 - pow);
		return payment;

	}

	/** This method is to calculate squar root
	 * @param c
	 * @return
	 */
	public double squarRoot(double c){

		double t = c;
		double Epsilon = 1E-15;
		while ((Math.abs(t - c / t)) > (Epsilon * t)) {
			t = (t + (c / t)) / 2;
		}
		return t;

	}

	/** This method is used to check binary number.
	 * @param n
	 * @return
	 */
	public char[] toBinary(int decimal){

		int number = decimal;
		String binary = "";
		while (decimal > 0) 
		{
			binary = decimal % 2 + binary;
			decimal = decimal / 2;
		}

		System.out.println("Binary number of "+number+" is "+binary);

		char arr[] = binary.toCharArray();
		int length = binary.length();
		int i, j = length-1;
		for (i = 0; i < arr.length; i++)
		{
			if (arr[i] == '1') 
			{
				int pow = (int) Math.pow(2, j);

				System.out.print(pow + "\t");
			}
			j--;
		}
		return arr;
	}

	/** This method is used to calculate binary nibbles
	 * @param num
	 */
	public void binaryNibbles(int num){

		String temp=(String.format("%8s",Integer.toBinaryString(num)).replace(" ", "0"));

		char[] m=new char[8];
		m=temp.toCharArray();
		char[] n=new char[8];
		int i,j=0;
		for (i =4 ; i<8 ; i++) 
		{
			n[j]=m[i];
			j++;
		}
		for(i=0;i<4;i++)
		{
			n[j]=m[i];
			j++;
		}

		for (i =0 ; i<8 ; i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println("swaped nibbles are");
		System.out.println();
		for(i=0;i<8;i++)
		{
			System.out.print(n[i]+" ");
		}

		System.out.println();
		int pow=0;
		j=7;
		for (i =0 ; i<8 ; i++) {
			if(n[i]=='1')
			{
				pow +=(int)Math.pow(2, j);

			}  

			j--;
		}
		System.out.print(pow+" ");
		i=1;
		while(i<pow)
		{
			i=i*2;
		}
		if(i==pow)
		{
			System.out.println("number is power of two");
		}
		else 
		{
			System.out.println("number is not a power of two");
		}
	}

	/** This method is used to check prime number.
	 * @param limit
	 * @return
	 */
	public String[] checkPrime(int limit)
	{

		String[] array = new String[1000];
		int position = 0;
		for (int i = 2; i < limit; i++) //limit  times
		{
			boolean isPrime = true;
			//			if(stake == 0)
			//			{
			//				stakeLoss++;
			//			}else{
			//				stakeWin++;			
			//			}
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					isPrime = false;
					break;
				}
			}

			if (isPrime) 
			{
				array[position] = String.valueOf(i);//index ibvalue to string
				position++;
			}
		}
		String[] array1 = new String[position];
		for (int k = 0; k < position; k++) 
		{
			array1[k] = array[k];
		}
		return array1;
	}

	/** This method is used to check the given strings are anagram.
	 * @param string1
	 * @param string2
	 * @return
	 */
	public boolean checkAnagram(String string1, String string2){

		if (string1.length() != string2.length()) {
			return false;
		}
		char[] a = string1.toCharArray();
		sort(a);
		char[] b = string2.toCharArray();
		sort(b);
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sort(char[] ab) 
	{
		for (int i = 0; i < ab.length; i++) 
		{
			for (int j = i + 1; j < ab.length; j++) 
			{
				if (ab[i] > ab[j]) {
					char temp = ab[i];
					ab[i] = ab[j];
					ab[j] = temp;
				}
			}
		}

	}
	/** This method is used to find palindrome string 
	 * @param s
	 * @return
	 */
	public boolean palindrome(String s) {
		if (s.length() < 2) {
			return false;
		}
		char[] c = s.toCharArray();
		int n = c.length;
		for (int i = 0; i < n; i++) 
		{
			if (c[i] != c[n - 1 - i])
			{
				return false;
			}
		}
		return true;
	}

	public void orderedList(ArrayList<Integer> list, File file) throws IOException {

		Scanner scanner = new Scanner (System.in);
		Iterator iterator = list.iterator(); 
		System.out.println("Enter the element to find");
		int key = scanner.nextInt();
		while(iterator.hasNext())
		{
			if(list.contains(key))
			{
				list.remove(list.indexOf(key));
				break;
			}
			else
			{
				list.add(key);
				list.sort(null);
				break;
			}
		}
		String str ="";
		Iterator iterator2 = list.iterator();
		while(iterator2.hasNext())
		{
			str+= iterator2.next()+" ";
		}
		FileWriter fw = new FileWriter(file);
		fw.write(str);
		fw.flush(); 
		System.out.println(str);


	}

	public void parenthesis(String exp, Stack<Integer> stk)
	{
		int len = exp.length();

		System.out.println("\nMatches and Mismatches:\n");
		for (int i = 0; i < len; i++) 
		{
			char ch = exp.charAt(i);
			if (ch == '(')
				stk.push(i);

			else if (ch == ')') 
			{
				try {
					int p = stk.pop();
					System.out.println("parenthes is matched");
				} catch (Exception e) 
				{
					System.out.println("Parenthes is un mached");
				}
			}
		}
		while (!stk.isEmpty()) {
			System.out.println((stk.pop()) + " is un matched");
		}
	}

	public LinkedList serachMethod(LinkedList linkedList, int search, int k) 
	{
		Iterator iterator = linkedList.iterator();

		boolean found = false;
		while (iterator.hasNext()) {
			if (iterator.next().equals(search)) {
				linkedList.remove(k);
				found = true;
			}
			k++;
		}
		if (found == false)
			linkedList.add(search);
		return linkedList;
	}

	/** This method is used to check given year is leap year.
	 * @param year
	 * @return 
	 */
	public static boolean isLeapYear(int year) {

		if ((year % 4 == 0) && (year % 100 != 0)) {
			return true;
		}
		if (year % 400 == 0) {
			return true;
		} else {

			return false;
		}
	}

	public static void initGame(int[][] board, int ROWS, int COLS)

	{
		int currentState;  
		int PLAYING = 0;
		int currentPlayer;
		int Player_First = 1;

		int EMPTY = 0;
		for (int row = 0; row < ROWS; ++row) 
		{
			for (int col = 0; col < COLS; ++col)
			{
				board[row][col] = EMPTY;  
			}
		}
		currentState = PLAYING;
		currentPlayer = Player_First; 
	}

	public static boolean isDraw() 
	{
		int ROWS = 3, COLS= 3;
		int EMPTY =0;
		int[][] board = new int[ROWS][COLS];
		for (int row = 0; row < ROWS; ++row) 
		{
			for (int col = 0; col < COLS; ++col) 
			{
				if (board[row][col] == EMPTY) 
				{
					return false; 
				}
			}
		}
		return true; 
	}

	public static boolean hasWon(int value, int currentRow, int currentCol)
	{
		int[][] board = new int[3][3];
		return (board[currentRow][0] == value       
				&& board[currentRow][1] == value
				&& board[currentRow][2] == value
				|| board[0][currentCol] == value    
				&& board[1][currentCol] == value
				&& board[2][currentCol] == value
				|| currentRow == currentCol          
				&& board[0][0] == value
				&& board[1][1] == value
				&& board[2][2] == value
				|| currentRow + currentCol == 2  
				&& board[0][2] == value
				&& board[1][1] == value
				&& board[2][0] == value);
	}

	public static void printBoard() 
	{
		int ROWS = 3, COLS= 3;
		int[][] board = new int[ROWS][COLS];
		for (int row = 0; row < ROWS; ++row) 
		{
			for (int col = 0; col < COLS; ++col) 
			{
				printCell(board[row][col]); 
				if (col != COLS - 1) 
				{
					System.out.print("|");  
				}
			}
			System.out.println();
			if (row != ROWS - 1)
			{
				System.out.println("-----------"); 
			}
		}
		System.out.println();
	}

	public static void printCell(int content) 
	{
		final int EMPTY = 0;
		final int Player_First = 1;
		final int Player_Sceond = 2;
		switch (content) 
		{
		case EMPTY:  System.out.print("   "); break;
		case Player_First:  System.out.print(" X "); break;
		case Player_Sceond: System.out.print(" O "); break;
		}
	}

	/**
	 * @param value
	 * @param board
	 * @param currentRow
	 * @param currentCol
	 * @param ROWS
	 * @param COLS
	 * @param Player_First
	 * 
	 */
	public static void playerMove(int value,int[][] board, int currentRow, int currentCol, int ROWS, int COLS, int Player_First) 
	{
		Scanner scanner= new Scanner(System.in);

		boolean validInput = false;  
		int EMPTY = 0;
		do {
			if (value == Player_First) {
				System.out.print("Player_First, enter your move: ");
			} else 
			{
				System.out.print("Player_Sceond, enter your move : ");
			}
			int row = scanner.nextInt() - 1; 
			int col = scanner.nextInt() - 1;
			if (row >= 0 && row < ROWS && col >= 0 && col < COLS && board[row][col] == EMPTY) 
			{
				currentRow = row;
				currentCol = col;
				board[currentRow][currentCol] = value;  
				validInput = true;  
			} 
			else {
				System.out.println("This move is not valid. Try again...");
			}
		} while (!validInput);  
		scanner.close();
	}

	/**
	 * @param value
	 * @param currentRow
	 * @param currentCol
	 * @param currentState
	 */
	public static void updateGame(int value, int currentRow, int currentCol, int currentState) 
	{

		final int Player_First = 1;
		final int DRAW = 1;
		final int Player_First_WON = 2;
		final int Player_Sceond_WON = 3;
		if (hasWon(value, currentRow, currentCol)) { 
			currentState = (value == Player_First) ? Player_First_WON : Player_Sceond_WON;
		} else if (isDraw()) 
		{ 
			currentState = DRAW;
		}  
	}

	/** This method is used to start the time.
	 * @return
	 */
	public int start()
	{
		int startTime = (int) System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
		return startTime;
	}

	/** This method is used to stop the time
	 * @return
	 */
	public int stop()
	{
		int stopTime =(int) System.currentTimeMillis();
		System.out.println("Start Time is: "+stopTime);
		return stopTime;
	}

	public int sumOfThree(int[] arr, int length){

		int count = 0;
		for(int i=0; i<length-2; i++)
		{
			for(int j=i+1; j<length-1; j++)
			{
				for(int k=j+1; k<length ;k++)
				{
					if((arr[i] + arr[j] + arr[k]) == 0){
						count++;
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]+" Count = "+count);
					}
				}
			}
		}
		return 0;
	}

	/** This method is used to find the permutations of string.
	 * @param str
	 * @param l
	 * @param r
	 */

	public void permutation(String str, int length, int count) {
		if (length == count) 
		{
			System.out.println(str);
		} else {
			for (int i = length; i <= count; i++) {
				str = swap(str, length, i);
				permutation(str, length + 1, count);
				str = swap(str, length, i);
			}
		}
	}

	/** This method is used to swap a string.
	 * @param a
	 * @param i
	 * @param j
	 * @return
	 */
	public String swap(String string, int length, int size)
	{
		char temp;
		char charArray[] = string.toCharArray();
		temp = charArray[length] ;
		charArray[length] = charArray[size];
		charArray[size] = temp;
		return String.valueOf(charArray);      
	}


	/** This method is used to check the given strings are Anagram.
	 * @param length1
	 * @param length2
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public boolean isAnagram(String firstString, String sceondString)
	{
		int found =0;
		String regex = "\\s+";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(sceondString);
		Matcher matcher1 = pattern.matcher(firstString);

		if(matcher.find())
		{
			String string = matcher1.replaceAll("");
			sceondString = string;
		}else if(matcher1.find()){

			String string1 = matcher1.replaceAll("");
			firstString =string1;

		}

		char[] arr1 = firstString.toLowerCase().toCharArray();
		char[] arr2 = sceondString.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int length1 = arr1.length;
		int length2 = arr2.length;
		if(length1!=length2)
		{
			return false;

		}else{

			for(int i=0; i<length1; i++)
			{			
				for(int j=0; j<length1; j++)
				{ 
					if(arr1[i]==arr2[j])
					{
						return true;

					}	
					return false;
				}	
			}
		}
		return false;
	}

	/** This method is used to display integer, double and boolean in 2D array format.
	 * @param arrayElements
	 * @param rows
	 * @param columns
	 */
	public static <T> void print2DArray(T[][] arrayElements, int rows, int columns) {
		PrintWriter writer = new PrintWriter(System.out);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				writer.print(arrayElements[i][j] + " ");
				writer.flush();
			}
			System.out.println();
		}

	}



	/** This method is used to find distinct coupon number.
	 * @param size
	 */
	public void couponNumber(int size)
	{
		int array[] = new int[size];
		int count = 0;
		for(int i=0; i<size;i++)
		{
			array[i]= (int)(Math.random()*size);
			count++;
			for(int j=0; j<i; j++){

				if(array[i]==array[j]){
					i--;
				}

			}
		}
		for(int i : array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Total Random number to have Distinct Number... "+count);

	}

	/**This method for bubbleSort
	 * @param arr
	 */
	public static void bubbleSort(String arr[])
	{
		String temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j].compareTo(arr[j+1])>=0)
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	/** This method is used to calculate day.
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int day(int month, int day, int year)
	{
		int y = year - (14 - month) / 12;
		int x = y + y/4 - y/100 + y/400;
		int m = month + 12 * ((14 - month) / 12) - 2;
		int d = (day + x + (31*m)/12) % 7;
		return d;
	}

	/** This method is used to display calendar.
	 * @param year
	 * @param month
	 */
	public static void calender(int year, int month)
	{

		String months[] ={"","January","February","March","April","May","June","July","August","September",
				"October","November","December"};

		int days[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};

		if(month == 2 && isLeapYear(year))
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

	/** This method use for to calculate day.
	 * @param month
	 * @param year
	 * @param day
	 */
	public void dayOfWeek(int month, int year, int day){

		if (month > 0 && month < 13) {

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day < 1 || day > 31) {
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					System.out.println("invalid date");
					System.exit(0);
				}
			}
			if (month == 2) {
				if (day < 1 || day > 29) {
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}

			if (month == 2 && year % 4 != 0) {
				if (day == 29) {
					System.out.println("Date is invalid");
					System.exit(0);
				}
			}
			int y1 = year - (14 - month) / 12;
			int x = y1 + (y1 / 4) - (y1 / 100) + (y1 / 400);
			int m1 = month + 12 * ((14 - month) / 12) - 2;
			int d1 = (day + x + (31 * m1) / 12) % 7;
			String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursdsy","Friday","Saturday"};

			System.out.println("the day on " + month + "/" + day + "/" + year + " is " + days[d1] + " .");
		} else {
			System.out.println("month is out of range");
		}

	}

	/** This method is used to find number.
	 * @param high
	 * @param low
	 * @param root
	 */
	public void findYourNumber(int high,int low, int root){

		Scanner scanner = new Scanner(System.in);

		for(int i=0; i<root; i++)
		{
			int mid = (high + low) / 2;
			System.out.println("If your number between "+low+" To "+mid+" Press 1... OR "+mid+" To "+high+" Pess 0");
			int value = scanner.nextInt();
			if (value == 1) 
			{
				low = low;
				high = mid;
			}
			else if(value == 0)
			{
				low = mid + 1;
				high = high;
			}
			if (low == high) 
			{
				System.out.println("the number is" + mid);

			}
		}
		scanner.close();
	}

	public static void insertionSort(int arr[]){
		int leng = arr.length;
		for (int i=1; i<leng; ++i)
		{
			int key = arr[i];
			int j = i-1;

			while (j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}	

		for(int i : arr){

			System.out.print(i+" ");
		}


	}

	public void countNotes(int money, int[] notes, int i, int totalNotes) 
	{
		int count = 0;
		if (money == 0) 
		{
			System.out.println("Total number of notes :" + totalNotes);
			System.exit(0);
		} else 
		{
			count = money / notes[i];
			totalNotes = totalNotes + count;
			System.out.println(notes[i] + "Rs notes are  " + count);
			money = money % notes[i];
			i++;
		}
		countNotes(money, notes, i, totalNotes);

	}
	public void unorderedList()
	{
		try {
			File file = new File("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/unorderlist.txt");

			boolean mark = false;
			BufferedReader buffer = new BufferedReader(new FileReader(file));

			Scanner scanner = new Scanner(System.in);
			String words = buffer.readLine();

			FileWriter fileWriter = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/dsprograms/unorderlist.text");
			String[] str1 = words.trim().split(" ");

			LinkedList<String> linkedList = new LinkedList<String>();

			for (int i = 0; i < str1.length; i++)
			{
				linkedList.add(str1[i]);
			}


			System.out.println(linkedList.toString());

			System.out.println("Enter the String to search...");
			String search = scanner.next();

			for (int i = 0; i < linkedList.size(); i++) {
				if (linkedList.get(i).equals(search)) {
					linkedList.remove(i);
					mark = true;
				}
			}
			System.out.println(linkedList.toString());

			if (mark == false)
				linkedList.add(search);

			if (mark == true) 
			{
				for (int i = 0; i < linkedList.size(); i++) {
					String str2 = (String) (linkedList.get(i)) + " ";
					fileWriter.write(str2);
					fileWriter.flush();
				}

			} else {
				for (int i = 0; i < linkedList.size(); i++) 
				{
					String str11 = (String) linkedList.get(i) + " ";
					fileWriter.write(str11);
					fileWriter.flush();
				}
			}
			System.out.println(linkedList.toString());
			buffer.close();
			scanner.close();
			fileWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}


	/** This method for binary search.
	 * @param word
	 * @param arr
	 * @param length
	 * @return
	 */
	public static int binarySearch(String word, String arr[], int length){

		Utility.bubbleSort(arr);
		for (String i : arr) 
		{
			System.out.print(i + " ");
		}
		System.out.println();

		int temp=0;
		if(length <= temp){
			return -1;
		}
		if(length - temp == 1){

			return arr[temp].equals(word) ? temp : -1;
		}

		int pivot = (temp + length)/2;
		if(word.compareTo(arr[pivot]) < 0)
		{
			return binarySearch(word, arr,pivot);
		} 
		else if(word.compareTo(arr[pivot]) > 0) 
		{
			return binarySearch(word, arr,pivot);
		}
		return pivot;

	}
	/** This method insertion sort for integer.
	 * @param arr
	 */
	public static void insertionSortforInt(int arr[]){
		int leng = arr.length;
		for (int i=1; i<leng; ++i)
		{
			int key = arr[i];
			int j = i-1;

			while (j>=0 && arr[j] > key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	public void insertionSortForString()
	{
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter size of string array ");
		int size = scanner.nextInt();

		String array[] = new String[size];

		System.out.println("Enter "+size+" character");

		for(int i=0; i<size; i++){

			array[i] = scanner.next();

		}
		utility.start();
		Utility.insertionSort(array);

		System.out.println("Sorted string...");

		for(String i : array){

			System.out.print(i+" ");
		}
		scanner.close();
	}

	/** This method is used to sort the array using insertion sort method.
	 * @param array
	 */
	public static void insertionSort(String[] array)
	{
		String temp;
		for(int i = 1; i < array.length; i++)
		{
			temp = array[i];
			int j = 0;
			for(j = i; j > 0; j--)

				if(temp.compareTo(array[j - 1]) < 0){

					array[j] = array[j - 1];
				}
				else{


					break;
				}		


			array[j] = temp;

		}

		for(String i : array){

			System.out.print(i+" ");
		}

	}


	public void bubbleSortForInt(int size, int arr[]){

		int m = size - 1;
		while (m > 0) 
		{
			for (int i = 0; i < m; i++) 
			{
				if (arr[i] > arr[i + 1]) 
				{
					int temp;
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			m--;
		}
		System.out.println("Sorted array is...");
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i]+" ");
		}

	}

	public void bubbleSorForString(){

		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		System.out.println("Enter size of Array");
		int size = scanner.nextInt();
		String[] arr = new String[size];

		System.out.println("Enter "+size+" words");
		for(int i=0; i<size; i++)
		{
			arr[i] = scanner.nextLine();

		}
		System.out.println("Before sort String");
		for(String i : arr)
		{	
			System.out.print(i+" ");	
		}
		utility.start();
		Utility.bubbleSort(arr);

		System.out.println("Sorted String is....");
		for(String i : arr ){

			System.out.print(i+" ");

		}
		scanner.close();

	}

	public int wordLength(String s){

		System.out.println("In word length");

		int n = 0;

		StringTokenizer stringTokenizer = new StringTokenizer(s,",");

		while(stringTokenizer.hasMoreTokens())
		{

			String token = stringTokenizer.nextToken();
			n++;
		}

		return n;

	}

	public int arrayConversion(String string, int length, String word)
	{
		String arr[]=new String[length];
		int i=0;

		StringTokenizer stringTokenizer = new StringTokenizer(string,",");


		while(stringTokenizer.hasMoreTokens())
		{

			String token=stringTokenizer.nextToken();
			arr[i]=token;
			i++;
		}		
		Utility.bubbleSort(arr);
		for(String s : arr){
			System.out.print(s+" ");
		}
		System.out.println();

		int low=0,high=length-1;
		int mid;
		while(low<=high)
		{
			mid=(high+low)/2;

			if(word.compareToIgnoreCase(arr[mid])==0)
			{
				return mid;
			}
			else if(word.compareToIgnoreCase(arr[mid])>0)
			{
				low=mid+1;
				high=high;
			}
			else if(word.compareToIgnoreCase(arr[mid])<0)
			{
				low=low;
				high=mid-1;
			}
		}
		return -1;
	}

	public static String[] mergeSort(String[] array) 
	{
		if (array.length == 1)
		{
			return array;
		}
		String first[] = new String[array.length / 2];
		String last[] = new String[array.length - (array.length / 2)];

		for (int i = 0; i < first.length; i++)
		{
			first[i] = array[i];
		}
		int j = 0;
		for (int i = first.length; i < array.length; i++)
		{
			last[j] = array[i];
			j++;
		}
		first = mergeSort(first);
		last = mergeSort(last);

		String[] returnArray = new String[array.length];
		int firstPos = 0, lastPos = 0;
		for (int i = 0; i < returnArray.length; i++)
		{
			if (lastPos == last.length) 
			{
				returnArray[i] = first[firstPos];
				firstPos++;
			} else if (firstPos == first.length) 
			{	
				returnArray[i] = last[lastPos];
				lastPos++;
			} else if (first[firstPos].compareTo(last[lastPos]) > 0)
			{
				returnArray[i] = last[lastPos];
				lastPos++;
			} else 
			{
				returnArray[i] = first[firstPos];
				firstPos++;
			}
		}
		return returnArray;
	}

	@SuppressWarnings("unchecked")
	public void writeData() throws JSONException {

		int weigth = 0, price =0;
		String names[] = { "Rice", "Wheat", "Pulses" };
		JSONObject finalObject = new JSONObject();
		for (String name : names) {
			System.out.println("Enter the types of " + name + " : ");
			int count = Utility.getInt();
			JSONArray array = new JSONArray();
			for (int i = 0; i < count; i++) 
			{
				JSONObject jsonObject = new JSONObject();
				System.out.println("Enter name: ");
				jsonObject.put("name", Utility.getString());
				System.out.println("Enter weight: ");
				weigth=Utility.getInt();
				jsonObject.put("weight", weigth);
				System.out.println("Enter price: ");
				price = Utility.getInt();
				jsonObject.put("price", price);
				jsonObject.put("total", weigth*price);

				array.add(jsonObject);
			}
			finalObject.put(name, array);
		}
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter("/home/bridgeit/Desktop/json/simple.json");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		printWriter.write(((Object) finalObject).toString());
		printWriter.close();
	}

	public void readData() throws JSONException {
		JSONParser parser = new JSONParser();
		try {
			Object object = parser.parse(new FileReader("/home/bridgeit/Desktop/json/simple.json"));
			JSONObject jsonObject = (JSONObject) object;
			System.out.println("Rice inventory value: " + jsonObject.get("Rice"));
			System.out.println("Pulses inventory value: " + jsonObject.get("Pulses"));
			System.out.println("Wheat inventory value: " + jsonObject.get("Wheat"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}

	}



	public void deckOfCards(String[] SUITS, String[] RANKS) {
		int lengthOfCards = SUITS.length * RANKS.length;
		String deck[] = new String[lengthOfCards];
		for (int i = 0; i < RANKS.length; i++) 
		{
			for (int j = 0; j < SUITS.length; j++) 
			{
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}

		//		for(String s : deck){
		//			
		//			System.out.println(s);
		//			
		//		}
		for (int i = 0; i < lengthOfCards; i++)
		{
			int r = i + (int) (Math.random() * (lengthOfCards - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}

		//		for(String s : deck){
		//
		//			System.out.println(s);
		//
		//		}
		String arr[][] = new String[SUITS.length][9];
		for (int i = 0; i < SUITS.length ; i++)
		{
			System.out.println("**********Player " + (i + 1)+"**********");
			System.out.println();
			for (int j = 0; j < 9; j++)
			{
				arr[i][j] = deck[i + j];
				System.out.println("    "+arr[i][j] + ", ");
			}
			System.out.println();
		}
	}

	public void deckOfCardsInQueue(String[] SUITS, String[] RANKS) {

		CardQueue cardQueue = new CardQueue();
		int lengthOfCards = SUITS.length * RANKS.length;
		String[] deck = new String[lengthOfCards];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length*i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}
		for (int i = 0; i < lengthOfCards; i++) {
			int r = i + (int) (Math.random() * (lengthOfCards-i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		String arr[][]=new String[SUITS.length][9];
		for(int i=0; i<SUITS.length; i++)
		{
			//  System.out.println("Player "+(i+1));
			for(int j=0; j<9; j++)
			{
				arr[i][j]=deck[i+j];
				cardQueue.push(arr[i][j]);
			}
			System.out.println();
		}	
	}

	@SuppressWarnings("unchecked")
	public static void createUser() throws IOException, ParseException{

		JSONObject stockUser = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		FileReader reader = new FileReader("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/userDetails.json");
		String name;
		int numberOfShare, amount;

		System.out.println("Enter the name of the user......");
		name = Utility.getString();

		stockUser.put("user_Name", name);

		System.out.println("Enter the Number of Share");
		numberOfShare = scanner.nextInt();
		stockUser.put("number_Share", numberOfShare);

		System.out.println("Enter the amount......");
		amount = scanner.nextInt();
		stockUser.put("amount", amount);
		jsonArray.add(stockUser);
		JSONParser jsonParser = new JSONParser();
		Object object1 = jsonParser.parse(reader);
		
		boolean b = true;
		Iterator<?> itr1 = jsonArray.iterator();
		while(itr1.hasNext()) {
			JSONObject jsonDeatils = (JSONObject) itr1.next();
			String userName = (String) jsonDeatils.get("user_Name");
			if (userName.equals(name)) {
				System.out.println("user Already Exsists.............");
				b = false;
			}
		}
		if (b == true) {
			((JSONArray) jsonArray).add(stockUser);
			FileWriter fileWriter = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/userDetails.json");
			fileWriter.write(((JSONAware) jsonArray).toJSONString());
			fileWriter.flush();
			fileWriter.close();

		}
	}
	public static void Buy() throws IOException, ParseException {
		File file = new File(
				"/home/bridgeit/Java-Programes/OOPS_Programes/src/com/bridgelabz/programes/userDetails.json");
		File file1 = new File(
				"/home/bridgeit/Java-Programes/OOPS_Programes/src/com/bridgelabz/programes/stockSymbols.json");
		if (file.exists() && file1.exists()) {
			// reading stock file
			FileReader fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray stock = (JSONArray) parser.parse(fr);
			// reading share file

			FileReader sf = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray share = (JSONArray) parser1.parse(sf);

			System.out.println("Enter the user");
			String name = Utility.getString();
			Iterator<?> itr = ((List<Integer>) stock).iterator();
			Iterator<?> itr1 = ((List<Integer>) share).iterator();
			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject obj = (JSONObject) itr.next();
				if (obj.get("user_Name").equals(name)) {
					System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
					String sym = Utility.getString();

					while (itr1.hasNext()) {
						JSONObject obj1 = (JSONObject) itr1.next();
						if (obj1.get("stock_Symbol").equals(sym)) {
							System.out.println("Enter the amount");
							int amt = scan.nextInt();
							int bal = Integer.parseInt(obj.get("amount").toString());
							int price = Integer.parseInt(obj1.get("amount").toString());
							int noShare = Integer.parseInt(obj.get("number_Share").toString());
							int stockShare = Integer.parseInt(obj1.get("Count").toString());
							int numofshare = amt / price;
							int newbal = bal - amt;
							int sharecountcus = noShare + numofshare;
							int sharecountstock = stockShare - numofshare;
							obj.remove("amount");
							obj.remove("number_Share");
							obj1.remove("Count");

							obj.put("amount", newbal);
							obj.put("number_Share", sharecountcus);
							obj1.put("Count", sharecountstock);

							flag = true;
							break;
						}
					}

				}
				FileWriter fs = new FileWriter(file);
				fs.write(JSONValue.toJSONString(stock));
				fs.flush();
				fs.close();
			}
			if (flag == false) {
				System.out.println("User name not exits");
			}
			FileWriter fw = new FileWriter(file1);
			fw.write(JSONValue.toJSONString(share));
			fw.flush();
			fw.close();
		} else {
			System.out.println("File does not exits");
		}
	}
	public static void sell() throws IOException, ParseException {

		File file = new File(
				"/home/bridgeit/Java-Programes/OOPS_Programes/src/com/bridgelabz/programes/userDetails.json");
		File file1 = new File(
				"/home/bridgeit/Java-Programes/OOPS_Programes/src/com/bridgelabz/programes/stockSymbols.json");
		if (file.exists() && file1.exists()) {
			Scanner scan = new Scanner(System.in);
			// reading stock file
			FileReader fr = new FileReader(file);
			JSONParser parser = new JSONParser();
			JSONArray stock = (JSONArray) parser.parse(fr);
			// reading share file

			FileReader sf = new FileReader(file1);
			JSONParser parser1 = new JSONParser();
			JSONArray share = (JSONArray) parser1.parse(sf);

			System.out.println("Enter the user");
			String name = scan.nextLine();
			Iterator<?> itr = ((List<Integer>) stock).iterator();
			Iterator<?> itr1 = ((List<Integer>) share).iterator();
			boolean flag = false;
			while (itr.hasNext()) {
				JSONObject obj = (JSONObject) itr.next();
				if (obj.get("user_Name").equals(name)) {
					System.out.println("Enter the share sysmbol to buy share:[@,!,#]");
					String sym = scan.nextLine();
					/*
					 * obj.put("Share symbol", sym); if(obj.get("Share Symbol"
					 * ).equals(sym)) {
					 */
					while (itr1.hasNext()) {
						JSONObject obj1 = (JSONObject) itr1.next();
						if (obj1.get("stock_Symbol").equals(sym)) {
							System.out.println("Enter the amount");
							int amt = scan.nextInt();
							int bal = Integer.parseInt(obj.get("amount").toString());
							int price = Integer.parseInt(obj1.get("amount").toString());
							int noShare = Integer.parseInt(obj.get("number_Share").toString());
							int stockShare = Integer.parseInt(obj1.get("Count").toString());
							int numofshare = amt / price;
							int newbal = bal + amt;
							int sharecountcus = noShare - numofshare;
							int sharecountstock = stockShare + numofshare;
							obj.remove("amount");
							obj.remove("number_Share");
							obj1.remove("Count");

							obj.put("amount", newbal);
							obj.put("number_Share", sharecountcus);
							obj1.put("Count", sharecountstock);

							flag = true;
							break;
						}
					}
					// }
					/*
					 * else { obj.put("Share symbol", sym); flag= true; }
					 */
				}
				FileWriter fs = new FileWriter(file);
				fs.write(JSONValue.toJSONString(stock));
				fs.flush();
				fs.close();
			}
			if (flag == false) {
				System.out.println("User name not exits");
			}
			FileWriter fw = new FileWriter(file1);
			fw.write(JSONValue.toJSONString(share));
			fw.flush();
			fw.close();
		} else {
			System.out.println("File does not exits");
		}

	}
	public static void display() throws IOException, ParseException {

		FileReader reader1 = new FileReader(
				"/home/bridgeit/Java-Programes/OOPS_Programes/src/com/bridgelabz/programes/userDetails.json");
		JSONParser jsonParser1 = new JSONParser();
		JSONArray jsonArrays_StackDtails = (JSONArray) jsonParser1.parse(reader1);
		for (Object o1 : jsonArrays_StackDtails) {
			JSONObject jsonDetails2 = (JSONObject) o1;
			String name = (String) jsonDetails2.get("user_Name");
			System.out.println("User Name: " + name);

			Object share = jsonDetails2.get("number_Share");
			System.out.println("Number of share: " + share);

			Object amount = jsonDetails2.get("amount");
			System.out.println("Amount: " + amount);

			System.out.println("-----------------------------------------");
		}

	}
	@SuppressWarnings("unchecked")
	public void addDoctors() 
	{
		System.out.println("Enter number of doctors :");
		int num0fDoctor = Utility.getInt();
		JSONArray jsonArray = new JSONArray();
		for (int i = 0; i < num0fDoctor; i++)
		{
			JSONObject jsonObject = new JSONObject();
			System.out.println("Enter name of doctor");
			String doctorName = Utility.getString();
			jsonObject.put("Doctor_Name", doctorName);

			System.out.println("Enter I.D doctor");
			int doctorId = Utility.getInt();
			jsonObject.put("Doctor_ID", doctorId);

			System.out.println("Enter Specialization of doctor");
			String doctorSpecialization = Utility.getString();
			jsonObject.put("Doctor_Specialization", doctorSpecialization);

			System.out.println("Enter Availablity of doctor");
			String available = Utility.getString();
			jsonObject.put("Doctor_Availiablity", available);

			jsonArray.add(jsonObject);
		}
		try
		{
			System.out.println("*************** Doctor Details ************");
			System.out.println();
			FileWriter jsonFileWriter = new FileWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addDoctor.json");

			jsonFileWriter.write(((JSONAware) jsonArray).toJSONString());
			jsonFileWriter.flush();
			jsonFileWriter.close();
			System.out.println("Doctor Added:" + jsonArray);
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
	@SuppressWarnings("unchecked")
	public void addPatient() {

		{
			System.out.println("Enter no. of Patient");
			int numberOfPatient = Utility.getInt();
			JSONArray jsonArray = new JSONArray();

			for (int i = 0; i < numberOfPatient; i++)
			{
				JSONObject jsonObject = new JSONObject();
				System.out.println("Enter patient name :");
				String patientName = Utility.getString();
				jsonObject.put("Patient_Name",patientName);
				System.out.println("Enter patient ID. :");
				int patientId = Utility.getInt();
				jsonObject.put("Patient_ID", patientId);
				System.out.println("Enter patient mobile number :");
				String patientMobNumber = Utility.getString();
				jsonObject.put("Patient_MobileNumber", patientMobNumber);
				System.out.println("Enter patient age");
				int patientAge = Utility.getInt();
				jsonObject.put("Patient_Age", patientAge);
				jsonArray.add(jsonObject);
			}
			try {
				System.out.println("*************** Patient Details ************");
				System.out.println();
				FileWriter jsonFileWriter = new FileWriter(
						"/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addPatient.json");
				jsonFileWriter.write(jsonArray.toString());
				jsonFileWriter.flush();
				jsonFileWriter.close();
				System.out.println("Pateint Added: " + jsonArray);
			} catch (IOException e) {
				e.printStackTrace();
			}


		}



	}
	public void searchDoctor() {

		try {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addDoctor.json"));
			System.out.println("Search Doctor_Name :");
			String searchDoctor = Utility.getString();
			Iterator<?> itr = jsonArray.iterator();

			while (itr.hasNext()) {
				JSONObject object = (JSONObject) itr.next();
				String string = (String) object.get("Doctor_Name");
				if (searchDoctor.equals(string)) {
					System.out.println("Doctor_founded" + object);
				} else {
					System.out.println("Not Found !");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
	public void searchPatient() {

		System.out.println("Enter Name Of Patient");
		String searchPatient = Utility.getString();
		try {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addPatient.json"));
			Iterator<?> itr = jsonArray.iterator();
			while(itr.hasNext()){

				JSONObject jsonobject = (JSONObject) itr.next();
				String string = (String) jsonobject.get("Patient_Name");
				if (searchPatient.equals(string)) {
					System.out.println("Patient_found " + jsonobject);
				} else {
					System.out.println("Not found !");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	@SuppressWarnings("unchecked")
	public void takeAnAppointment() {

		System.out.println("Enter Patient Name");
		String patientName = Utility.getString();
		System.out.println("Enter Doctor Name to take an Appointment");
		String docterName = Utility.getString();
		System.out.println("Enter the date");
		String stringDate = Utility.getString();

		String doctorDeatils = null;

		try {
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addDoctor.json"));

			for (int i = 0; i < jsonArray.size(); i++) 
			{
				JSONObject obj = (JSONObject) jsonArray.get(i);
				String doctorname = (String) obj.get("Doctor_Name");
				System.out.println("Doctor name "+docterName);
				if (doctorname.equals(docterName)) {
					doctorDeatils = doctorname;
				} else
				{
					System.out.println("doctor not found");
				}
			}
			JSONArray appointmentFileObj = new JSONArray();

			JSONObject obj1 = new JSONObject();

			obj1.put("Doctor_Name", doctorDeatils);
			obj1.put("Patient_Name", patientName);
			obj1.put("Booking Date ", (stringDate));

			appointmentFileObj.add(obj1);

			FileWriter filewriter = new FileWriter(
					"/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/appointment.json");
			filewriter.write(appointmentFileObj.toString());
			filewriter.flush();
			filewriter.close();

			System.out.println("Hii '"+patientName+"' Your Appointment is fixed  With Doctor '"+ doctorDeatils+"' On: "+stringDate+"  Thank You....");
			System.exit(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public void addressBook() throws ParseException {

		
		int i, j = 0;
		try {
			FileReader reader = new FileReader("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addressBook.json");
			JSONParser jsonParser = new JSONParser();
			Object obj1 = jsonParser.parse(reader);
			JSONArray jsonArray = (JSONArray) obj1;
			System.out.println();
			System.out.println("***************** My Address Book **************** ");
			System.out.println();
			System.out.println("Enter 1 to add details or enter any key to Display address book. ");
			i = Utility.getInt();
			// JSONArray temp=new JSONArray();
			while (i == 1) {

				JSONObject obj = new JSONObject();
				System.out.println("Enter First Name ");
				String name = Utility.getString();
				obj.put("Name", name);
				System.out.println("Enter Current Address ");
				String address = Utility.getString();
				obj.put("Address", address);
				System.out.println("Enter Mobile Number ");
				int number = Utility.getInt();
				obj.put("Number", number);

				jsonArray.add(obj);

				System.out.println("Enter 1 to continue OR enter any key to Display address book");
				i = Utility.getInt();
			}

			try {
				PrintWriter print = new PrintWriter("/home/bridgeit/BridgeLabz/bin/My_Programs/src/com/bridgelabz/objectorientedprog/addressBook.json");
				print.print(jsonArray.toJSONString());
				print.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			Iterator iterat = jsonArray.iterator();
			System.out.println("********* Records In My Address Book **********");
			System.out.println();
			while (iterat.hasNext()) {
				JSONObject temporary = (JSONObject) iterat.next();
				{

					System.out.println("name: " + temporary.get("Name"));
					System.out.println("address: " + temporary.get("Address"));
					System.out.println("number: " + temporary.get("Number"));
					System.out.println();
				}
			}

			while (j != 3) 
			{
				System.out.println("***************** My Address Book **************** ");
				System.out.println();
				System.out.println("Enter 1 to Search Details.");
				System.out.println("Enter 2 to Edit Details");
				System.out.println("Enter 3 to exit.");
				j = Utility.getInt();
				if (j == 1) {
					System.out.println("Enter Name for search");
					String name = Utility.getString();

					Iterator iterator = jsonArray.iterator();
					while (iterator.hasNext()) 
					{
						JSONObject temporary = (JSONObject) iterator.next();
						if (temporary.get("Name").equals(name))
						{
							System.out.println("***************** Detail Information of "+name+" ***************");
							System.out.println();
							System.out.println("Name: " + temporary.get("Name"));
							System.out.println("Address: " + temporary.get("Address"));
							System.out.println("Number: " + temporary.get("Number"));
							System.out.println();
						}
					}
				} 
				else if (j == 2)
				{
					System.out.println("Enter Name to Edit");
					String keyName = Utility.getString();
					Iterator iterat1 = jsonArray.iterator();
					boolean found = false;
					
					while (iterat1.hasNext())
					{
						JSONObject temporary = (JSONObject) iterat1.next();
						if (temporary.get("Name").equals(keyName))
						{
							found = true;
							jsonArray.remove(temporary);
							JSONObject obj = new JSONObject();
							System.out.println("Enter First Name ");
							String nameCheck = Utility.getString();
							obj.put("Name", nameCheck);
							System.out.println("Enter Current Address");
							String addressCheck = Utility.getString();
							obj.put("Address", addressCheck);
							System.out.println("Enter Mobile Number ");
							int numberCheck = Utility.getInt();
							obj.put("Number", numberCheck);
							jsonArray.add(obj);
						}
					
					}
					if (found == false) 
					{
						System.out.println("Name not found.... Please Try again.....");
					}
					
				} else if (j == 3) 
				{
					System.out.println("Thank You......");
					System.exit(0);
				} else 
				{
					System.out.println("Please Enter Valid Input.... ");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}

