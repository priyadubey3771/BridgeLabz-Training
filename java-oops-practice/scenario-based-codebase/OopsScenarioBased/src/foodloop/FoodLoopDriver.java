package foodloop;
import java.util.Arrays;

//Driver class to test FoodLoop system
 public class FoodLoopDriver {
	public static void main(String[] args) {

        // Create food items
        FoodItem pizza = new VegItem("Margherita Pizza", 300, 10);
        FoodItem burger = new VegItem("Veg Burger", 150, 15);
        FoodItem chicken = new NonVegItem("Chicken Wings", 400, 8);

        // Create a combo order
        Order order = new Order(Arrays.asList(pizza, burger, chicken));

        // Place and cancel order
        order.placeOrder();
        order.cancelOrder();
    }
}
