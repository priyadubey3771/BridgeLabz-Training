package foodloop;

//Abstract base class representing a food item
 public abstract class FoodItem {

    private String name;        
    private String category;    
    private double price;       
    private int stock;          

    //Constructor to initialize food item
    public FoodItem(String name, String category, double price, int stock) 
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    //Reduce stock when ordered
    protected boolean reduceStock() 
    {
        if (stock > 0) 
        {
            stock--;
            return true;
        }
        return false;
    }

    public double getPrice() 
    {
        return price;
    }

    public String getName() 
    {
        return name;
    }
}
