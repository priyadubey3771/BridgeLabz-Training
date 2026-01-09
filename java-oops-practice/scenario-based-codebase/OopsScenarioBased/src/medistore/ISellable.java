package medistore;

public interface ISellable {

    // Sell a given quantity of medicine
    void sell(int quantity);

    // Check whether the medicine is expired
    boolean checkExpiry();
}
