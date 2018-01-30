package com.bridgelabz.objectorientedprog;

public class DeekOfCards {

	public static void main(String[] args) {
		
        String SUITS[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String RANKS[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
        					"Jack", "Queen", "King", "Ace"};
        DeckOfCards(SUITS,RANKS);
	}

	public static void DeckOfCards(String[] SUITS, String[] RANKS) {
		int n = SUITS.length * RANKS.length;
		String deck[] = new String[n];
		for (int i = 0; i < RANKS.length; i++) {
			for (int j = 0; j < SUITS.length; j++) {
				deck[SUITS.length * i + j] = RANKS[i] + " of " + SUITS[j];
			}
		}
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = deck[r];
			deck[r] = deck[i];
			deck[i] = temp;
		}
		int count = 0;
		String arr[][] = new String[SUITS.length][9];
		for (int i = 0; i < SUITS.length - 1; i++) {
			System.out.println("Player " + (i + 1));
			for (int j = 0; j < 9; j++) {
				arr[i][j] = deck[i + j];
				System.out.println(arr[i][j] + ", ");
			}
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
