package com.javastreams.bufferedstreams;

public class Driver{
    public static void main(String[] args){
    	
        BufferedFileHandler fh = new BufferedFileHandler();

        String source = "C:\\Users\\hp\\Downloads\\Driver.java"; 
        String destNormal = "C:/Users/hp/Downloads/destNormal.dat";
        String destBuffered = "C:/Users/hp/Downloads/destBuffered.dat";

        // Copy using normal streams
        fh.copyFileNormal("C:\\Users\\hp\\Downloads\\Driver.java", destNormal);

        // Copy using buffered streams
        fh.copyFileBuffered("C:\\Users\\hp\\Downloads\\Driver.java", destBuffered);
    }
}
