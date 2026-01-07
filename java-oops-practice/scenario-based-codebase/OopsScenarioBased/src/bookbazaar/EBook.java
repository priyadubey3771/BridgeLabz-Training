package bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) 
    {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(int quantity) 
    {
        // 20% discount on ebooks
        double total = price * quantity;
        return total * 0.20;
    }
}
