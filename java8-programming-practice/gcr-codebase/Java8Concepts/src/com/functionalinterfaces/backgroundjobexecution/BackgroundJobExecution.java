package com.functionalinterfaces.backgroundjobexecution;

public class BackgroundJobExecution {
  public static void main(String[] args) {

        // Runnable task using lambda
        Runnable backgroundJob = () -> {System.out.println("Background job started...");
            try 
            {
                Thread.sleep(3000); // simulate long task
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println("Background job completed!");
        };

        // Run task in a separate thread
        Thread thread = new Thread(backgroundJob);
        thread.start();

        System.out.println("Main thread continues running...");
    }
}


