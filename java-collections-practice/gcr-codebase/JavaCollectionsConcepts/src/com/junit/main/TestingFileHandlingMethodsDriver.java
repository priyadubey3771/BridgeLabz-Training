package com.junit.main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import com.junit.testing.TestingFileHandlingMethods;

public class TestingFileHandlingMethodsDriver {
	
		TestingFileHandlingMethods fp = new TestingFileHandlingMethods();
	    String fileName = "testfile.txt";

	    @Test
	    void testWriteAndReadFile() throws IOException
	    {
	        String content = "Hello JUnit File Test";

	        fp.writeToFile(fileName, content);
	        String result = fp.readFromFile(fileName);

	        assertEquals(content, result);
	    }

	    @Test
	    void testFileExistsAfterWriting() throws IOException
	    {
	        fp.writeToFile(fileName, "Checking file existence");

	        File file = new File(fileName);
	        assertTrue(file.exists());
	    }

	    @Test
	    void testIOExceptionForMissingFile()
	    {
	        Exception exception = assertThrows(IOException.class, () ->
	        {
	            fp.readFromFile("nonexistent.txt");
	        });

	        assertNotNull(exception);
	    }
	}


