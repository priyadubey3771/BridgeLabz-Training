package com.healthcheckpro;

public class LabTestController {

    @PublicAPI
    public void getAvailableTests() {
        // logic to fetch available lab tests
    }

    @RequiresAuth
    public void orderTest(String patientId, String testCode) {
        // logic to order a lab test
    }

    public void internalAudit() {
        // this method should ideally have an annotation
    }
}
