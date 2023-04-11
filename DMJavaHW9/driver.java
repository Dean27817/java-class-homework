import java.util.Scanner;

public class driver 
{

    public static void wrongOrder(tea sale1, Scanner scnr) 
    {
        int choice;
        boolean verify = false;
        String order = "null";
        int oz;
        System.out.println("what part did we get wrong \n(1) tea \n(2) ammount of tea \n(3) name");
        choice = scnr.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println("what would you like to order");
            while (verify == false)
            {
                order = scnr.next();
                verify = sale1.verifyTea(order);
            }
            sale1.setType(order);
            break;
            case 2:
            System.out.println("how much tea would you like (in oz)");
            oz = scnr.nextInt();
            sale1.setWeight(oz);
            break;
            case 3:
            System.out.println("what is your name");
            order = scnr.next();
            sale1.setName(order);
            break;
        };
    }
    public static void main(String[] args) {
        tea sale1 = new tea();
        Scanner scnr = new Scanner(System.in);
        String order = "green";
        String name;
        int oz;
        boolean verify = false;
        char correctOrder = 'n';
        sale1.showMenu();
        System.out.println("what is your name");
        name = scnr.next();
        System.out.println("what would you like to order");
        while (verify == false)
        {
            order = scnr.next();
            verify = sale1.verifyTea(order);
        }
        System.out.println("how much tea would you like (in oz)");
        oz = scnr.nextInt();
        sale1.setAll(order, oz, name);
        while (correctOrder == 'n')
        {
            sale1.toString();
            System.out.println("correct? (y/n)");
            correctOrder = scnr.next().charAt(0);
            if (correctOrder == 'n')
            {
                wrongOrder(sale1, scnr);
            }
        }




        scnr.close();
    }
}