/*Author: dean morgan
 * date: 1/30/2023
 * class: csc 160
 * assignment HW1
 * 
 */
import java.util.Scanner;
public class HomeworkMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to java");
		System.out.print("NO PARKING 1:00 - 5:00 a.m.");
		System.out.print("\nwhat is your age: ");
		int age = input.nextInt();
		System.out.print("\nenter your salary: ");
		int salary = input.nextInt();
		System.out.println("\nYour age is " + age + " and your salary is " + salary + "USD");
		input.close();
	}

}
