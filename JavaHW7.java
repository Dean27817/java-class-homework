/*Author: dean morgan
 * date: 2/24/2023
 * class: csc 160
 * assignment homework 4
 * 
 *  this will be a game where a player and the computer will both roll a pair of dice and the first one to 100 points wins
 */

 import java.util.Scanner;

 public class JavaHW7 {
    
public static void drawArt() {
    for (int i = 300; i>0; i--)
         {
             System.out.print("*");
         }
         System.out.println(" ");
         System.out.print(" ");
         for (int i = 6; i>0; i--)
         {
             System.out.print("_ ");
         }
         System.out.println();
         for (int i = 7; i>0; i--)
         {
             System.out.print("| ");
         }
         System.out.println(" ");
         System.out.print(" ");
         for (int i = 6; i>0; i--)
         {
             System.out.print("_ ");
         }
         System.out.println();
}

    public static int checkDice(int playerNum, int compRoll) {
        int points = 0;

        int difference = Math.abs(compRoll-playerNum);
                 System.out.println("your guess was " + difference + " off");
                 if (difference == 0)
                 {
                     System.out.println("You earned the full 20 points!");
                     points += 20;
                 }
                 else if (difference <= 2)
                 {
                     System.out.println("You earned 15 points!");
                     points += 15;
                 }
                 else 
                 {
                     System.out.println("the computor earned 20 points");
                     points = 0;
                 }
                 return points;
    }

    public static boolean validGuess(int guess)
    {
        return guess <= 12 && guess >= 2;
    }

    public static void showScore(int playerScore, int compScore) {
        System.out.println("you have " + playerScore + " points");
        System.out.println("the computer has "+ compScore + " points");
        System.out.println("agein? (y/n)");
    }

    public static void showWinningScore(int compScore, int playerScore, int count) {
        if (compScore > playerScore)
         {
             System.out.println("computor wins");
         }
         else
         {
             System.out.println("player wins");
         }
         System.out.println("hope you enjoyed!");
         System.out.println("you played " + count + " rounds!");
    }

     public static void main(String[] args) {
         Scanner scnr = new Scanner(System.in);
         int playerScore = 0;
         int compScore = 0;
         int guess = 0;
         int dice;
         int count = 0;
         char agein = 'y';
         boolean validDice = false;
         int pointHolder;
         System.out.println("welcome to my dice game! in this game you will choose a number between 2 and 12. the computor will then roll two dice. \nif your guess was exact, you will get 20 points. if your guess was less than 3 points off, you will get 15 points. anything else, and the computor will get 20 points. have fun!");
         
         while (playerScore < 100 && compScore < 100 && agein == 'y')
         {
             count++;
             System.out.println("enter a number between 2 and 12");
             while(validDice == false)
             {
             guess = scnr.nextInt();
             validDice = validGuess(guess);
             if (validDice == false)
             {
                System.out.println("please enter a valid number");
             }
             }
             validDice = false;
                 dice = (int) ((Math.random()) * 10) + 2;
                 System.out.println("the computor rolled a " + dice);

                pointHolder = checkDice(guess, dice);
                if (pointHolder == 0)
                {
                    compScore += 20;
                }
                    playerScore += pointHolder;

                 showScore(playerScore, compScore);
                 agein = scnr.next().charAt(0);
         }
         scnr.close();
         showWinningScore(compScore, playerScore, count);
         
 
     }
 
 }