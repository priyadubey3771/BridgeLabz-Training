package hospitalPatientManagementSystem;

class InPatient extends Patient {

    private int numberOfDays;

    public InPatient(int id, String name, String history, int days) 
    {
        super(id, name, history);
        this.numberOfDays = days;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println(getSummary());
        System.out.println("Admitted for " + numberOfDays + " days");
    }

    public int getNumberOfDays() 
    {
        return numberOfDays;
    }
}
