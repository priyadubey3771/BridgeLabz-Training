package com.junit.main;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.junit.testing.TestingBeforeEachAndAfterEachAnnotations;
	
	public class TestingBeforeEachAndAfterEachAnnotationsDriver {
		
		TestingBeforeEachAndAfterEachAnnotations db;

	    @BeforeEach
	    void setUp()
	    {
	        db = new TestingBeforeEachAndAfterEachAnnotations();
	        db.connect();
	    }

	    @AfterEach
	    void tearDown()
	    {
	        db.disconnect();
	    }

	    @Test
	    void testConnectionEstablished()
	    {
	        assertTrue(db.isConnected());
	    }

	    @Test
	    void testConnectionClosedAfterTest()
	    {
	        db.disconnect();
	        assertFalse(db.isConnected());
	    }
	}


