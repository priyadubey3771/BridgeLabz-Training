package com.annotations.todo;
import java.lang.reflect.Method;

public class Driver {
  public static void main(String[] args) {

        try 
        {
            Class<?> cls = Project.class;

            System.out.println("Pending tasks in Project:");

            for (Method method : cls.getDeclaredMethods()) 
            {

                if (method.isAnnotationPresent(Todo.class)) 
                {

                    Todo todo = method.getAnnotation(Todo.class);

                    System.out.println("- Method: " + method.getName());
                    System.out.println("  Task: " + todo.task());
                    System.out.println("  Assigned To: " + todo.assignedTo());
                    System.out.println("  Priority: " + todo.priority());
                }
            }

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
