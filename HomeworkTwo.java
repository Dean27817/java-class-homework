/*Author: dean morgan
 * date: 1/30/2023
 * class: csc 160
 * assignment HW1
 * this will be a program that will tell you the amount of heat needed to raise the temperature of a certain weight of water.
 * this will take the weight of water, the final temp, the initial temp, to calculate the answer.
 */
import java.util.Scanner;
public class HomeworkTwo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what is the initial temp(in degrees celcius)");
		double startingTemp = input.nextDouble();
		System.out.println("what is the ending temp(in degrees celcius)");
		double endTemp = input.nextDouble();
		System.out.println("what is the weight of the water (in grams)");
		double gramsOfWater = input.nextDouble();
		// this is all of the input for the program
		double changeInTemp = endTemp - startingTemp;
		double joulesOfEnergy = gramsOfWater * changeInTemp * 4.184;
		double kJoulesOfEnergy = joulesOfEnergy / 1000;
		// this is the calculations to take the user input and finish the formula
		System.out.println("the energy required to raise " + gramsOfWater + " grams of water from " + startingTemp + " to " + endTemp + " is " + joulesOfEnergy + " joules of energy or " + kJoulesOfEnergy + "kilojoules");
		input.close();

	}

}
