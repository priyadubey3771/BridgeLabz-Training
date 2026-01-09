package artifydigitalartmarketplace;

public abstract class Artwork implements IPurchasable {

    protected String title;          
    protected String artist;         
    protected double price;          
    protected String licenseType;    
    protected boolean hasPreview;    

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) 
    {
        this(title, artist, price, licenseType, false);
    }

    // Constructor with preview option
    public Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) 
    {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    // Purchase artwork and deduct wallet balance
     @Override
    public void purchase(User user) 
    {
        if (user.getWalletBalance() >= price)
        {
            user.deductBalance(price);
            System.out.println(user.getName() + " purchased \"" + title + "\" for ₹" + price);
        } 
        else 
        {
            System.out.println("Purchase failed: insufficient balance.");
        }
    }

    // Protected licensing details
    protected String getLicenseType() 
    {
        return licenseType;
    }
}
