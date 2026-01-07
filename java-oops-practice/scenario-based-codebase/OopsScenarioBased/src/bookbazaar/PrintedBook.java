package bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) 
    {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) 
    {
        // 10% discount on printed books
        double total = price * quantity;
        return total * 0.10;
    }
}
