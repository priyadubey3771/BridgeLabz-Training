package hospitalPatientManagementSystem;

class Bill implements Payable {

    private double baseAmount;
    // 5% tax
    private double taxRate = 0.05; 
    // Flat discount
    private double discount = 500;      

    public Bill(double baseAmount) 
    {
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() 
    {
        double tax = baseAmount * taxRate;
        return baseAmount + tax - discount;   // Operators used
    }
}
