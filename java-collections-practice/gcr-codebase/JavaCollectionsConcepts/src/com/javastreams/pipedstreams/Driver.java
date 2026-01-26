package com.javastreams.pipedstreams;

public class Driver
{
    public static void main(String[] args)
    {
        PipedStreamHandler psh = new PipedStreamHandler();
        psh.startCommunication();
    }
}
