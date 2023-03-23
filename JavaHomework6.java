/*Author: dean morgan
 * date: x/x/2023
 * class: csc 160
 * assignment 
 * this will be a follow up assignment to the homework four, where we made a card game that matched two cards togeather
 * for this assignment, we will be optomizing that game using methods
 *  
 */
import java.util.Scanner;

public class JavaHomework6 {
	/*  Author:	Dean Morgan
**  Date:	3/22/2023
**  Description:	verifies that the card chosen by the player is a valid card and suit
**  Parameters:	card(char), suit(char)
**  Calling method:	main
**  Return values:   verified(boolean)
*/

	public static boolean cardVerify(char card, char suit)
	{
		boolean verified = (suit == 'c' || suit == 'h' || suit == 's' || suit == 'd') && (card == 'a' || card == '1' || card == '2' || card == '3' || card == '4' || card == '5' || card == '6' || card == '7' || card == '8' || card == '9' || card == 't' || card == 'j' || card == 'q' || card == 'k');
		return verified;
	}

	/*  Author:	Dean Morgan
**  Date:	3/22/2023
**  Description:	prints the card that the player and computer chose
**  Parameters:	card(char), player(boolean)
**  Calling method:	main
**  Return values:   none
*/

	public static void printCard(char card, boolean player)
	{
		if (player == true)
		{
			System.out.print("you ");
		}
		else 
		{
			System.out.print("I ");
		}
		if (card == '1' || card == 'a')
		{
			System.out.print("chose an ace of");
		}
		else if (card == 'j')
		{
			System.out.print("chose a jack of");
		}
		else if (card == 'q')
		{
			System.out.println("chose a queen of");
		}
		else if (card == 'k')
		{
			System.out.print("chose a king of");
		}
		else if (card == 't')
		{
			System.out.print("chose a ten of");
		}
		else
		{
			System.out.print("chose a " + card + " of");
		}
		
	}

	/*  Author:	Dean Morgan
**  Date:	3/22/2023
**  Description:	prints the suit of what the player and computer chose
**  Parameters:	suit(char)
**  Calling method:	main
**  Return values:   none
*/

	public static void printCard(char suit)
	{
		if (suit == 'c')
		{
			System.out.println(" clubs");
		}
		else if (suit == 'h')
		{
			System.out.println(" hearts");
		}
		else if (suit == 's')
		{
			System.out.println(" spades");
		}
		else if (suit == 'd')
		{
			System.out.println(" diamonds");
		}
	}

	/*  Author:	Dean Morgan
**  Date:	3/22/2023
**  Description:	checks weather or not the two cards chosen match
**  Parameters:	card1(char), card2(char), suit1(char), suit2(char)
**  Calling method:	main
**  Return values:   none
*/

	public static void checkCards(char card1, char card2, char suit1, char suit2)
	{
		if (card1 == card2 && suit1 == suit2)
		{
			System.out.println("the two cards match! \nYou WIN!!");
		}
		else
		{
			System.out.println("the two cards did not match");
		}
	}

	/*  Author:	Dean Morgan
**  Date:	3/22/2023
**  Description:	converts the randomly genorated number of the suit to a char that will be used to print
**  Parameters:	suit(int)
**  Calling method:	main
**  Return values:   suitChar(char)
*/
	
	public static char compSuitToChar(int suit)
	{
		char suitChar = ' ';
		switch (suit)
		{
			case 0:
			suitChar = 'c';
			break;
			case 1:
			suitChar = 'h';
			break;
			case 2:
			suitChar = 's';
			break;
			case 3:
			suitChar = 'd';
			break;
		};
		return suitChar;
	}

	/*  Author:	Dean Morgan
**  Date:	3/22/2023
**  Description:	converts the randomly genorated int to the char that is the card name
**  Parameters:	card(int)
**  Calling method:	main
**  Return values:   charCard(char)
*/

	public static char compCardToChar(int card)
	{
		char charCard = ' ';
		if (card < 10){
			charCard = (char)(card+ '0');
		}
		else if (card == 10)
		{
			charCard = 't';
		}
		else if (card == 11)
		{
			charCard = 'j';
		}
		else if (card == 12)
		{
			charCard = 'q';
		}
		else if (card == 13)
		{
			charCard = 'k';
		}
		return charCard;
	}


	public static void main(String[] args) {
		String agein = "y";
		char card1 = 'a';
		char playerSuit = 'a';
		Scanner scnr = new Scanner(System.in);
			boolean verified = false;
		System.out.println("what is your name");
		String name = scnr.next();
		System.out.println("welcome to our card game! \nI wish you luck, " + name.toUpperCase());
		
		while (agein.equals("y"))
		{
			while (verified == false)
			{
				System.out.println("input a card \n(k, q, or j for jack queen king t for 10, 1 or a for ace)");
				card1 = scnr.next().charAt(0);
				System.out.println("choose a suit \n(c, h, s, d)");
				playerSuit = scnr.next().charAt(0);
				verified = cardVerify(card1, playerSuit);
				if (verified == false)
				{
					System.out.println("please enter a valid card/suit");
				}
			}
			verified = false;
			
					int card2Temp = (int)(Math.random() * 13 + 1);
					int compSuitTemp = (int)(Math.random() * 4);
					
					char card2 = compCardToChar(card2Temp);
					char compSuit = compSuitToChar(compSuitTemp);
					
					printCard(card1, true);
					printCard(playerSuit);
					printCard(card2, false);
					printCard(compSuit);
					
					checkCards(card1, card2, playerSuit, compSuit);
					
					
			System.out.println("agein? \n(y/n)");
			agein = scnr.next();
		
		}
		scnr.close();

	}

}
