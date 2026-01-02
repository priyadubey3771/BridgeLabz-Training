package hospitalPatientManagementSystem;

class OutPatient extends Patient {

    private double consultationFee;

    public OutPatient(int id, String name, String history, double fee) 
    {
        super(id, name, history);
        this.consultationFee = fee;
    }

    @Override
    public void displayInfo() 
    {
        System.out.println(getSummary());
        System.out.println("Consultation Fee: ₹" + consultationFee);
    }

    public double getConsultationFee() 
    {
        return consultationFee;
    }
}
