/*Author: dean morgan
 * date: 4/9/2023
 * class: csc 160
 * assignment 
 * this will be a program that takes two cities as inputs and tells the distance between them
 *  
 */


import java.util.Scanner;
public class JavaHW8 
{
    /*  Author:	Dean Morgan
**  Date:	4/9/2023
**  Description:	checks if an enterd name is withinn an array of names
**  Parameters:	cities(String array), name(String)
**  Calling method:	main
**  Return values:   check(boolean)
*/
    public static boolean checkCityName(String[] cities, String name) 
    {
        boolean check = false;
        for(int i = 0; i < cities.length; i++)
        {
            if(cities[i].equals(name))
            {
                check = true;
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
        return check;
    }
    /*  Author:	Dean Morgan
**  Date:	4/9/2023
**  Description:	finds a names spot in an array
**  Parameters:	cityArray(String array), city(String)
**  Calling method:	main
**  Return values:   int
*/
    public static int searchArray(String[] cityArray, String city) {
		for (int i = 0; i < cityArray.length; i++) {
			if (city.equals(cityArray[i])) {
				return i;
			}
		}
		return -1;
	} 

    public static void main(String[] args) 
    {
        Scanner scnr = new Scanner(System.in);
        String name1 = "";
        String name2 = "";
        int cityNum1;
        int cityNum2;
        double endDistance;
        boolean check = false;
        String[] cities = {"Chicago", "Boston", "New York", "Atlanta", "Miami", "Dallas", "Denver"};
        double[][] distances = {
            {0,   848.67, 711.11, 589.10,   1190.81, 804.73, 917.82 },
	        {848.67,  0,  190.21,  936.17,  1257.63, 1549.05, 1765.25},
	        {711.11, 190.21,  0,  745.97, 1091.51, 1370.43, 1627.07},
 	        {589.10, 936.17, 745.97,  0,  605.52, 719.35, 1209.57},
            {1190.81, 1257.63, 1091.51, 605.52, 0, 1109.54, 1724.22},
            {804.73, 1549.05, 1370.43, 719.35, 1109.54, 0, 662.29},
            {917.82, 1765.25, 1627.07, 1209.57, 1724.22, 662.29, 0},

        };
        for(int i = 0; i < cities.length; i++)
        {
            System.out.print(cities[i] + " | ");
        }
        System.out.println();



        while (check == false)
        {
            System.out.println("eter start city");
            name1 = scnr.next();
            check = checkCityName(cities, name1);
        }
        System.out.println("the length of start city is " + name1.length());
       check = false;
       while (check == false)
       {
        System.out.println("enter end city");
        name2 = scnr.next();
        check = checkCityName(cities, name2);
        System.out.println("the length of end city is " + name2.length());
       }
        cityNum1 = searchArray(cities, name1);
        cityNum2 = searchArray(cities, name2);
        endDistance = distances[cityNum1][cityNum2];
        System.out.println("the distance from " + name1 + " to " + name2 + " is " + endDistance + " miles");
        
    }
    
}
