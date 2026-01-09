package artifydigitalartmarketplace;

//PrintArt represents printable physical artwork
public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType) 
    {
        super(title, artist, price, licenseType);
    }

    //Print art licensing
     @Override
     public void license() 
     {
        System.out.println("Print Art licensed with limited reproduction rights.");
     }
}
