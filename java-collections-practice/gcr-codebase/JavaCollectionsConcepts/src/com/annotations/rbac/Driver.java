package com.annotations.rbac;

import java.lang.reflect.Method;

public class Driver {
  public static void main(String[] args) {

        // Simulate current user role
        String currentUserRole = "USER"; // Change to "ADMIN" to allow access

        try 
        {
            Class<?> cls = AdminService.class;

            // Check class-level annotation
            if (cls.isAnnotationPresent(RoleAllowed.class)) 
            {
                RoleAllowed roleAllowed = cls.getAnnotation(RoleAllowed.class);
                String allowedRole = roleAllowed.value();

                if (!currentUserRole.equals(allowedRole)) 
                {
                    System.out.println("Access Denied! Only " + allowedRole + " allowed.");
                    return;
                }
            }

            // Create object
            Object service = cls.getDeclaredConstructor().newInstance();

            // Invoke methods
            Method deleteMethod = cls.getMethod("deleteUser", String.class);
            deleteMethod.invoke(service, "Priya");

            Method reportMethod = cls.getMethod("viewReports");
            reportMethod.invoke(service);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
