package artifydigitalartmarketplace;

public interface IPurchasable {

    // Purchase artwork using user wallet
    void purchase(User user);

    // Apply license to artwork
    void license();
}
