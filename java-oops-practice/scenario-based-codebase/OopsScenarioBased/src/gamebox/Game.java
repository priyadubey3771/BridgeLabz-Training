package gamebox;

//abstract base class for all games
public abstract class Game implements IDownloadable {

 protected String title;
 protected String genre;
 protected double price;
 protected double rating;

 // constructor for free or paid games
 public Game(String title, String genre, double price, double rating) 
 {
     this.title = title;
     this.genre = genre;
     this.price = price;
     this.rating = rating;
 }

 // apply seasonal discount
 public void applyDiscount(double discountPercentage) 
 {
     price = price - (price * discountPercentage / 100);
 }

 public String getTitle() 
 {
     return title;
 }

 public double getPrice() 
 {
     return price;
 }

 @Override
 public void download()
 {
     System.out.println(title + " is downloading...");
 }

 @Override
 public abstract void playDemo();
}
