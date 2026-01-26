package com.javastreams.pipedstreams;

import java.io.PipedOutputStream;
import java.io.PipedInputStream;
import java.io.IOException;

class PipedStreamHandler
{
    PipedOutputStream pos = new PipedOutputStream();
    PipedInputStream pis = new PipedInputStream();

    PipedStreamHandler()
    {
        try
        {
            // Connect input and output streams
            pis.connect(pos);
        }
        catch (IOException e)
        {
            System.out.println("Error while connecting piped streams.");
        }
    }

    void startCommunication()
    {
        // Create writer thread
        Thread writer = new Thread(new Runnable() {
            public void run()
            {
                try
                {
                    String message = "Hello from Writer Thread!";
                    pos.write(message.getBytes());
                    pos.close(); // Important: close after writing
                }
                catch (IOException e)
                {
                    System.out.println("Writer thread error.");
                }
            }
        });

        // Create reader thread
        Thread reader = new Thread(new Runnable() 
        {
            public void run()
            {
                try
                {
                    int data;
                    System.out.println("Reader Thread Output:");
                    while ((data = pis.read()) != -1)
                    {
                        System.out.print((char)data);
                    }
                    pis.close();
                    System.out.println();
                }
                catch (IOException e)
                {
                    System.out.println("Reader thread error.");
                }
            }
        });

        // Start both threads
        reader.start();
        writer.start();

        try
        {
            // Wait for threads to finish
            writer.join();
            reader.join();
        }
        catch (InterruptedException e)
        {
            System.out.println("Thread interrupted.");
        }
    }
}
