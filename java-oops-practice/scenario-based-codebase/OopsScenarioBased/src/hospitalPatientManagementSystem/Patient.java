package hospitalPatientManagementSystem;

abstract class Patient {

    private int patientId;
    private String name;
    private String medicalHistory;   

    public Patient(int patientId, String name, String medicalHistory) 
    {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public String getName() 
    {
        return name;
    }

    // displaying only summary, not full medical history
    public String getSummary() 
    {
        return "Patient ID: " + patientId + ", Name: " + name;
    }

    public abstract void displayInfo();   
}
