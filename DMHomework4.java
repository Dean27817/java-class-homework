/*Author: dean morgan
 * date: 2/8/2023
 * class: csc 160
 * assignment homework 4
 * 
 *  this will be an assignment made to fulfill the requirements of the homework 4 assignment
 *  it will be a card game where the user will input a card, a random card will then be chosen and will be seen if they match
 */

import java.util.Scanner;

public class DMHomework4 {

	public static void main(String[] args) {
		String agein = "y";
		Scanner scnr = new Scanner(System.in);
		String[] cardNames = 
		{
			"a",
			"1",
			"2",
			"3",
			"4",
			"5",
			"6",
			"7",
			"8",
			"9",
			"t",
			"j",
			"q",
			"k"
		};
		char[] suit =
			{
					'c',
					'h',
					's',
					'd',
			};
		System.out.println("what is your name");
		String name = scnr.next();
		System.out.println("welcome to our card game! \nI wish you luck, " + name.toUpperCase());
		
		while (agein.equals("y"))
		{
			System.out.println("input a card \n(k, q, or j for jack queen king t for 10)");
			char card1 = scnr.next().charAt(0);
			System.out.println("choose a suit \n(c, h, s, d)");
			char playerSuit = scnr.next().charAt(0);
			if (playerSuit == 'c' || playerSuit == 'h' || playerSuit == 's' || playerSuit == 'd')
			{
				if (card1 == 'a' || card1 == '1' || card1 == '2' || card1 == '3' || card1 == '4' || card1 == '5' || card1 == '6' || card1 == '7' || card1 == '8' || card1 == '9' || card1 == 't' || card1 == 'j' || card1 == 'q' || card1 == 'k')
				{
					int card2 = (int) (Math.random() * 13 + 1);
					int compSuit = (int) (Math.random() * 4);
					if (card1 == 'a')
					{
						System.out.print("you chose an ace of");
					}
					else if (card1 == 'j')
					{
						System.out.print("you chose a jack of");
					}
					else if (card1 == 'q')
					{
						System.out.println("you chose a queen of");
					}
					else if (card1 == 'k')
					{
						System.out.print("you chose a king of");
					}
					else if (card1 == 't')
					{
						System.out.print("you chose a ten of");
					}
					else
					{
						System.out.print("you chose a " + card1 + " of");
					}
					if (playerSuit == 'c')
					{
						System.out.println(" clubs");
					}
					else if (playerSuit == 'h')
					{
						System.out.println(" hearts");
					}
					else if (playerSuit == 's')
					{
						System.out.println(" spades");
					}
					else if (playerSuit == 'd')
					{
						System.out.println(" diamonds");
					}
					
					System.out.println("I drew a " + cardNames[card2] +" of " + suit[compSuit]);
					
					if (card1 == card2 && compSuit == playerSuit)
					{
						System.out.println("the two cards match! \nYou WIN!!");
					}
					else
					{
						System.out.println("the two cards did not match");
					}
				}
				else
				{
					System.out.println("please choose a valid card");
				}
			}
			else
			{
				System.out.println("please choose a valid card");
			}
			System.out.println("agein? \n(y/n)");
			agein = scnr.next();
		
		}
		scnr.close();

	}

}
