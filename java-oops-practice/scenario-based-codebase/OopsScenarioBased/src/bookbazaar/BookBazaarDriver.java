package bookbazaar;
public class BookBazaarDriver {
  public static void main(String[] args) {

    Book book1 = new EBook("Java Made Easy", "James Gosling", 500, 10);
    Book book2 = new PrintedBook( "Clean Code", "Robert Martin", 800, 5);
    Order order = new Order("Priya Dubey");

    order.addBook(book1, 2);
    order.addBook(book2, 1);
    order.completeOrder();
    order.displayOrderSummary();
    
    }
}
