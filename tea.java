/*Author: dean morgan
 * date: 4/12/2023
 * class: csc 160
 * assignment 
 * this is a program that in tandom with the driver program will act as a tea shop to sell their goods
 *  
 */

public class tea {
    private String name;
    private String[] teaTypes = {"green", "oolong", "mint", "black", "english breakfast", "earl grey"};
    private double[] prices = {3.80, 11.55, 5.20, 4.95, 4.40, 4.15};
    String type;
    int weight;
    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	sets all varibles to zero
**  Parameters:	none
**  Calling method:	none
**  Return values:   none
*/
    public tea(){}

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	sets name to the peramiter
**  Parameters:	userName(string)
**  Calling method:	driver.wrongOrder
**  Return values:   none
*/
    public void setName(String userName)
    {
        this.name = userName;
    }

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	sets type to the peramiter
**  Parameters:	teaType
**  Calling method:	driver.wrongOrder
**  Return values:   none
*/
    public void setType(String teaType)
    {
        this.type = teaType;
    }

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	sets weight to the peramiter
**  Parameters:	OZ int
**  Calling method:	driver.wrongOrder
**  Return values:   none
*/
    public void setWeight(int oz)
    {
        this.weight = oz;
    }

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	sets all of the variables in the program to zero
**  Parameters:	type(string), weight(int), name (string)
**  Calling method:	driver.main()
**  Return values:   none
*/
    public void setAll(String type, int weight, String name) 
    {
        this.type = type;
        this.weight = weight;
        this.name = name;
    }

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	returns the cost of the order
**  Parameters:	none
**  Calling method:	driver.main()
**  Return values:   cost(double)
*/
    public double getCost() 
    {
        double cost = 0;
        switch(type)
        {
            case "green":
            cost = prices[0];
            break;
            case "oolong":
            cost = prices[1];
            break;
            case "mint":
            cost = prices[2];
            break;
            case "black":
            cost = prices[3];
            break;
            case "english breakfast":
            cost = prices[4];
            break;
            case "earl grey":
            cost = prices[5];
            break;
            default:
            System.out.println("tea not in directory");
            break;
        };
        cost *= weight;
        return cost;
    }
    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	verifys that the tea that the person orderd is on the list of valid teas
**  Parameters:	tea(string)
**  Calling method:	driver.main()
**  Return values:   verify(boolean)
*/
    public boolean verifyTea(String tea) 
    {
        boolean verify = false;
        for(String value : teaTypes)
        {
            if (tea.equals(value))
            {
                verify =true;
            }
        }
        if (verify == false)
        {
            System.out.println("invalid order");
        }
        return verify;
    }
    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	prints the list of teas, as well as how much they cost
**  Parameters:	none
**  Calling method:	driver.main()
**  Return values:   none
*/
    public void showMenu() 
    {
        System.out.println("our menu");
        for (int i = 0; i < prices.length; i++)
        {
            System.out.println(teaTypes[i] + " for $" + prices[i]);
        }
        System.out.println("-----------------------------------------------------");
    }

    /*  Author:	Dean Morgan
**  Date:	4/12/2023
**  Description:	prints the recipt for the order
**  Parameters:	none
**  Calling method:	driver.main()
**  Return values:   none
*/
    public String toString() 
    {
        return String.format("name: %s\ntea: %s\nweight %d OZ\n", name, type, weight);
    }
}