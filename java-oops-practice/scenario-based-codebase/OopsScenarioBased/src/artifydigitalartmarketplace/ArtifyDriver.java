package artifydigitalartmarketplace;

public class ArtifyDriver {
   public static void main(String[] args) {

        // Create user
        User user = new User("Aarav", 5000);

        // Create artworks
        Artwork digital = new DigitalArt("Neon Dreams","Riya Sharma",1200,"Commercial",true);
        Artwork print = new PrintArt("Vintage Sketch","Amit Verma",800,"Limited");

        // Purchase and license artworks
        digital.purchase(user);
        digital.license();
        print.purchase(user);
        print.license();

        // Remaining wallet balance
        System.out.println("Remaining Wallet Balance: ₹" + user.getWalletBalance());
    }
}
