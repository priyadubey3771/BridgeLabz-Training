package bookbazaar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;
    private int stock; 

    // Constructor without offer
    public Book(String title, String author, double price, int stock) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Getter for price
    public double getPrice() 
    {
        return price;
    }

    // stock update
    public boolean reduceStock(int quantity) 
    {
        if (quantity <= stock) 
        {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() 
    {
        return stock;
    }

    public void displayBookDetails() 
    {
        System.out.println(title + " by " + author + " | Price: ₹" + price);
    }
}
