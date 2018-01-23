package com.bridgelabz.functionalProgram;

/**
 * @purpose: This program number of times to Flip Coin.
 * @author: Nikhil Vaidya.
 * @version: 1.0
 * @since 10/01/2018
 */
public class FlipCoin 
{
	public static void main(String[] args)
	{

		double head =0;
		double tail =0;
		float percentage_head,percentage_tail;
		for(int i=0; i<90; i++)
		{
			if(Math.random()<0.5)
			{
				tail++;
			}else{
				head++;
			}
		}
		
		System.out.println("Head Total: "+head);
		System.out.println("Tails Total: "+tail);
		percentage_head= (float)((head/90)*100);
		System.out.println("Percentage of head is: "+percentage_head);
		percentage_tail =(float)((tail/90)*100);
		System.out.println("Percentage of tail is:"+percentage_tail);
		
	}

}
