package com.annotations.rbac;

@RoleAllowed("ADMIN")
public class AdminService {

    public void deleteUser(String username)
    {
        System.out.println("User " + username + " deleted!");
    }

    public void viewReports() 
    {
        System.out.println("Viewing sensitive reports...");
    }
}
