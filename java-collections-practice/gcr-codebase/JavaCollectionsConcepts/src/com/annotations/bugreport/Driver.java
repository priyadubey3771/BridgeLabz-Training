package com.annotationsbugreport;
import java.lang.reflect.Method;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            Class<?> cls = Software.class;

            Method method = cls.getMethod("process");

            // Get all BugReport annotations
            BugReport[] reports = method.getAnnotationsByType(BugReport.class);

            System.out.println("Bug Reports on method 'process':");

            for (BugReport report : reports) 
            {
                System.out.println("- " + report.description());
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
