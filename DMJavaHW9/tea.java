public class tea {
    private String name;
    private String[] teaTypes = {"green", "oolong", "mint", "black", "english breakfast", "earl grey"};
    String type;
    int weight;
    
    public void setName(String userName)
    {
        this.name = userName;
    }
    public void setType(String teaType)
    {
        this.type = teaType;
    }
    public void setWeight(int oz)
    {
        this.weight = oz;
    }
    public void setAll(String teaType, int oz, String username) 
    {
        this.type = teaType;
        this.weight = oz;
        this.name = username;
    }
    public double getCost() 
    {
        double cost = 0;

        return cost;
    }
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
    public void showMenu() 
    {
        System.out.println("our menu");
        for (String value : teaTypes)
        {
            System.out.println(value);
        }
        System.out.println("-----------------------------------------------------");
    }
    public String toString() 
    {
        return "back to the basics";
    }
}
