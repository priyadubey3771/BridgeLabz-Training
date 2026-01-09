package foodloop;

//Represents vegetarian food items
 public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) 
    {
        super(name, "Veg", price, stock);
    }
}
