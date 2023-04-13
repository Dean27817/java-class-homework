/*Author: dean morgan
 * date: 4/12/2023
 * class: csc 160
 * assignment 
 * this is a program that in tandom with the tea program will act as a tea shop to sell their goods
 *  
 */

import java.util.Scanner;

public class DMDriverHW9 
{

/*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	replaces the ammount of tea that a person orderd
**  Parameters:	sale1(tea object), scnr (scnner object)
**  Calling method:	wrongOrder
**  Return values:   none
*/
    public static void weight(tea sale1, Scanner scnr)
    {
        int oz;
        System.out.println("how much tea would you like (in oz)");
        oz = scnr.nextInt();
        sale1.setWeight(oz);
    }

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	replaces the name in a persons order
**  Parameters:	sale1(tea object), scnr (scnner object)
**  Calling method:	wrongOrder
**  Return values:   none
*/

    public static void name(tea sale1, Scanner scnr) 
    {
        String name;
        System.out.println("what is your name");
        name = scnr.next();
        sale1.setName(name);
    }
    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	replaces the type of tea in a persons order
**  Parameters:	sale1(tea object), scnr (scnner object)
**  Calling method:	wrongOrder
**  Return values:   none
*/

    public static void teaType(tea sale1, Scanner scnr) 
    {
        String order;
        boolean verify = false;
        sale1.showMenu();
        System.out.println("what would you like to order");
        order = scnr.nextLine();
        while (verify == false)
        {
            order = scnr.nextLine();
            verify = sale1.verifyTea(order);
        } 
        sale1.setType(order);
    }
    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	calls the replace functions when an order is wrong and asks wich part of the order is wrong
**  Parameters:	sale1(tea object), scnr (scnner object)
**  Calling method: main
**  Return values:   none
*/

    public static void wrongOrder(tea sale1, Scanner scnr) 
    {
        int choice;
        System.out.println("what part did we get wrong \n(1) tea \n(2) ammount of tea \n(3) name");
        choice = scnr.nextInt();
        switch(choice)
        {
            case 1:
            teaType(sale1, scnr);
            break;
            case 2:
            weight(sale1, scnr);
            break;
            case 3:
            name(sale1, scnr);
            break;
        };
    }
    public static void main(String[] args) {
        tea sale1 = new tea();
        Scanner scnr = new Scanner(System.in);
        String order = "null";
        String name;
        int oz;
        double price;
        boolean verify = false;
        char correctOrder = 'n';
        sale1.showMenu();
        System.out.println("what is your name");
        name = scnr.next();
        System.out.println("what would you like to order");
        order = scnr.nextLine();
        while (verify == false)
        {
            order = scnr.nextLine();
            verify = sale1.verifyTea(order);
        }
        System.out.println("how much tea would you like (in oz)");
        oz = scnr.nextInt();
        sale1.setAll(order, oz, name);
        while (correctOrder == 'n')
        {
            System.out.println(sale1.toString());
            System.out.println("correct? (y/n)");
            correctOrder = scnr.next().charAt(0);
            if (correctOrder == 'n')
            {
                wrongOrder(sale1, scnr);
            }
        }
        price = sale1.getCost();
        System.out.println("your total is $" + price);




        scnr.close();
    }
}