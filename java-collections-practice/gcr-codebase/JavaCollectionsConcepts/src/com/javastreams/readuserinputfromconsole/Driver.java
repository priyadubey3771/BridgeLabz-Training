package com.javastreams.readuserinputfromconsole;

public class Driver
{
    public static void main(String[] args)
    {
        UserInputHandler uih = new UserInputHandler();
        uih.readAndSaveUserData("userdata.txt"); 
    }
}
