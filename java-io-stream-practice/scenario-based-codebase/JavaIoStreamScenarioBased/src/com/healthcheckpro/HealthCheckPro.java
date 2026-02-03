package com.healthcheckpro;

import java.lang.reflect.Method;

public class HealthCheckPro {

    public static void scanAPI(Class<?> controllerClass) {
        System.out.println("Scanning API class: " + controllerClass.getSimpleName());
        Method[] methods = controllerClass.getDeclaredMethods();

        for (Method method : methods) {
            boolean hasPublicAPI = method.isAnnotationPresent(PublicAPI.class);
            boolean hasRequiresAuth = method.isAnnotationPresent(RequiresAuth.class);

            System.out.println("\nMethod: " + method.getName());

            if (!hasPublicAPI && !hasRequiresAuth) {
                System.out.println("⚠ Warning: No API annotation found!");
            } else if (hasPublicAPI) {
                System.out.println("Annotation: @PublicAPI");
            } else if (hasRequiresAuth) {
                System.out.println("Annotation: @RequiresAuth");
            }
        }
    }

    public static void main(String[] args) {
        scanAPI(LabTestController.class);
    }
}
