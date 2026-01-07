package bookbazaar;

public class Order {

    private String userName;
    private double totalCost;
    private boolean orderCompleted; 

    public Order(String userName) 
    {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity)
    {
    	if (!book.reduceStock(quantity)) 
        {
            System.out.println("Not enough stock for " + book.title);
            return;
        }

        double price = book.getPrice() * quantity;
        double discount = book.applyDiscount(quantity);

        totalCost += (price - discount);

        System.out.println("Added: " + book.title);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: ₹" + discount);
    }

    // Order status controlled internally
    protected void completeOrder() 
    {
        orderCompleted = true;
    }

    public void displayOrderSummary() 
    {
        System.out.println("\nOrder placed by: " + userName);
        System.out.println("Total Amount: ₹" + totalCost);
        System.out.println("Order Status: " +(orderCompleted ? "Completed" : "Pending"));
    }
}
