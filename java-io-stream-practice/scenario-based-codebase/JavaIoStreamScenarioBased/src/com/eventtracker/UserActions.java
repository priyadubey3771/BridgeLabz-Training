package com.eventtracker;

public class UserActions {

    @AuditTrail(action = "User Login")
    public void login(String username) {
        // logic for login
    }

    @AuditTrail(action = "File Upload")
    public void uploadFile(String filename) {
        // logic for uploading file
    }

    public void internalProcess() {
        // Not audited
    }

    @AuditTrail(action = "File Delete")
    public void deleteFile(String filename) {
        // logic for deleting file
    }
}
