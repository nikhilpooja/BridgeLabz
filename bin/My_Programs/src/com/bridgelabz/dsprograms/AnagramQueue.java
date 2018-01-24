package com.bridgelabz.dsprograms;

import com.bridgelabz.utility.Queue;
import com.bridgelabz.utility.Utility;

public class AnagramQueue {
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();
		Utility utility = new Utility();
		int limit =1000;
		String[] str = utility.checkPrime(limit);
		String str1;
		
		 for (int i = 0; i < str.length; i++) 
	        {
	            for (int j = i + 1; j < str.length; j++) 
	            {
	                if (utility.checkAnagram(str[i],str[j]))
	                {
	                	
	                	str1 = str[j];
	                	queue.enqueue(str1);
	                }
	            }
	        }
		 
		 queue.print();
		
	}

}