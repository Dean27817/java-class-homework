/*Author: dean morgan
 * date: 1/30/2023
 * class: csc 160
 * assignment HW3
 * this is a program designed to prompt the user to choose an espresso drink from a menu. this will then ask if they want to add cream and sugar, and give them their final price.
 */

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int drinkChoice;
		int extraAdditives;
		int finalPrice = 0;
		boolean validDrink = false;
		// variable declaration
		while (validDrink == false)
		{
			// while loop is used whenever the user makes an invalid entry
			validDrink = true;
			System.out.println("enter the number of the coffe you want to order\n(1) Americano, (2) Cappuccino, (3) Mocha/n");
			drinkChoice = input.nextInt();
			switch (drinkChoice) {
			case 1:
				finalPrice = 2;
			break;
			
			case 2:
				finalPrice = 3;
			break;
			
			case 3:
				finalPrice = 4;
			break;
			default:
				System.out.println("invalid drink");
				validDrink = false;
			break;
			}
			// makes the first calculation of taking the cost of the initial drink  and assigning that to the final.
			if (validDrink == true)
			{
				System.out.println("would you like cream(1), sugar(2), both(3), or none(0)\n ");
				extraAdditives = input.nextInt();
				if (extraAdditives == 1)
				{
					finalPrice += 1;
				}
				else if (extraAdditives == 2)
				{
					finalPrice += 1;
				}
				else if (extraAdditives == 3)
				{
					finalPrice += 2;
				}
				else if (extraAdditives == 0)
				{
					finalPrice += 0;
				}
				else if (extraAdditives > 3)
				{
					System.out.println("invalid drink");
					validDrink = false;
				}
				// this adds the cost of cream or sugar to the drink
			}
		}
		System.out.println("your final cost is " + finalPrice + " dollars");
		input.close();
		// outputs the final cost and ends the input

	}

}
