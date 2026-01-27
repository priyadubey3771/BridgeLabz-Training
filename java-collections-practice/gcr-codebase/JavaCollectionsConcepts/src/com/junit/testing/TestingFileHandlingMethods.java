package com.junit.testing;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

	public class TestingFileHandlingMethods {
		
	    public void writeToFile(String filename, String content) throws IOException
	    {
	        FileWriter fw = new FileWriter(filename);
	        fw.write(content);
	        fw.close();
	    }

	    public String readFromFile(String filename) throws IOException
	    {
	        BufferedReader br = new BufferedReader(new FileReader(filename));
	        String line = br.readLine();
	        br.close();
	        return line;
	    } 
	}


